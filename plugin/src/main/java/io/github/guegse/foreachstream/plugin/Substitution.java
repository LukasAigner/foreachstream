package io.github.guegse.foreachstream.plugin;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeMaker;

import java.util.ArrayList;
import java.util.List;

import static io.github.guegse.foreachstream.plugin.ASTHelpers.getReturnType;

public class Substitution {
    private final JCTree.JCBlock staticBlock;
    private final List<Entry> entries;
    private final TreeMaker treeMaker;
    private final PrintOutput printOutput;

    private static class Entry {
        public JCTree.JCMethodInvocation original;
        public JCTree.JCMethodInvocation sub;
        public JCTree.JCMethodInvocation streamCall;
        public List<JCTree.JCExpression> arguments;

        public Entry(JCTree.JCMethodInvocation original, JCTree.JCMethodInvocation sub, JCTree.JCMethodInvocation streamCall, List<JCTree.JCExpression> arguments) {
            this.original = original;
            this.sub = sub;
            this.arguments = arguments;
            this.streamCall = streamCall;
        }
    }

    public Substitution(TreeMaker treeMaker, PrintOutput printOutput) {
        entries = new ArrayList<>();
        this.treeMaker = treeMaker;
        staticBlock = treeMaker.Block(0, com.sun.tools.javac.util.List.nil());
        this.printOutput = printOutput;
    }

    public JCTree.JCBlock getStaticBlock() {
        return staticBlock;
    }

    public void add(JCTree.JCMethodInvocation original, JCTree.JCMethodInvocation sub, JCTree.JCMethodInvocation streamCall, List<JCTree.JCExpression> arguments) {
        entries.add(new Entry(original, sub, streamCall, arguments));
        staticBlock.stats = staticBlock.stats.append(treeMaker.Exec(sub));
    }

    public void substitute() {
        for(var entry : entries) {
            if(!getReturnType(entry.streamCall).toString().startsWith("java.util.stream.Stream")) {
                printOutput.debugPrint(entry.original, "not replaced: ");
                continue;
            }
            printOutput.debugPrint(entry.original, "replacing with: " + entry.sub.getMethodSelect());
            entry.original.args = com.sun.tools.javac.util.List.from(entry.arguments);
            entry.original.meth = entry.sub.meth;
        }
        staticBlock.stats = com.sun.tools.javac.util.List.nil();
    }
}
