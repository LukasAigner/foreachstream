package io.github.guegse.foreachstream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ForeachStreamAnyMatch {

	public static <T0> boolean stream_anyMatch(Collection<T0> input, Predicate<T0> arg0) {
		for (T0 t0 : input) {
			if (arg0.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (arg1.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (arg1.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (arg1.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (arg1.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (arg1.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg1) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg1.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (arg1.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (arg1.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, Predicate<T2> arg2) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, Predicate<T1> arg2) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg2) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, Predicate<T1> arg2) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, Predicate<T1> arg2) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg2) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, Predicate<T0> arg2) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, Predicate<T0> arg2) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, Predicate<T2> arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, Predicate<Integer> arg2) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntPredicate arg2) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, Predicate<T2> arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, Predicate<Long> arg2) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongPredicate arg2) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoublePredicate arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntPredicate arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongPredicate arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, Predicate<T2> arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, Predicate<Double> arg2) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			if (arg2.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoublePredicate arg2) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_anyMatch(Collection<T0> input, Function<T0, T1> arg1, Predicate<T1> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_anyMatch(Collection<T0> input, Predicate<T0> arg1, Predicate<T0> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntPredicate arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongPredicate arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoublePredicate arg2) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, Predicate<T0> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_anyMatch(Collection<T0> input, long arg1, Predicate<T0> arg2) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, Predicate<T0> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntPredicate arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongPredicate arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, Predicate<T0> arg2) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, Predicate<T1> arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, Predicate<T0> arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntPredicate arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongPredicate arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			if (arg2.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, Predicate<T0> arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_anyMatch(Collection<T0> input, long arg0, long arg1, Predicate<T0> arg2) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			if (arg2.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2, T3> boolean stream_map_map_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, Function<T2, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, Predicate<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, ToIntFunction<T2> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, ToLongFunction<T2> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, ToDoubleFunction<T2> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, Predicate<T2> arg3) {
		List<T2> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (T2 t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, Comparator<? super T2> arg2, Predicate<T2> arg3) {
		List<T2> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (T2 t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_map_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg1, long arg2, Predicate<T2> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			T2 t2 = arg1.apply(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_filter_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_filter_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg1, long arg2, Predicate<T1> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			t2 = arg2.applyAsInt(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T3> boolean stream_map_mapToInt_mapToObj_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, IntFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_boxed_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			Integer t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToInt_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			int t2 = arg1.applyAsInt(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			t2 = arg2.applyAsLong(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T3> boolean stream_map_mapToLong_mapToObj_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, LongFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_boxed_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			Long t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToLong_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			long t2 = arg1.applyAsLong(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			t2 = arg2.applyAsDouble(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T3> boolean stream_map_mapToDouble_mapToObj_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, DoubleFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_boxed_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			Double t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_mapToDouble_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			double t2 = arg1.applyAsDouble(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_sorted_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Function<T1, T2> arg2, Predicate<T2> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg2, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToIntFunction<T1> arg2, IntPredicate arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToLongFunction<T1> arg2, LongPredicate arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		List<T1> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			sorted1.add(t1);
		}
		Collections.sort((List) sorted1);
		for (T1 t1: sorted1) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sorted_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg2, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_sortedComp_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		List<T1> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			sortedComp1.add(t1);
		}
		sortedComp1.sort(arg2);
		for (T1 t1: sortedComp1) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_sortedComp_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, Comparator<? super T1> arg1, long arg2, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg1);
		for (T1 t1: sortedComp0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_map_limit_map_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, Predicate<T1> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_map_limit_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg0, long arg1, long arg2, Predicate<T1> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			T1 t1 = arg0.apply(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_filter_map_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg3) {
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_map_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg1, long arg2, Predicate<T1> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			T1 t1 = arg1.apply(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_filter_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_filter_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg1, long arg2, Predicate<T0> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_filter_mapToInt_mapToObj_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_boxed_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToInt_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			int t1 = arg1.applyAsInt(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_filter_mapToLong_mapToObj_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_boxed_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToLong_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			long t1 = arg1.applyAsLong(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_filter_mapToDouble_mapToObj_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_boxed_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_mapToDouble_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			double t1 = arg1.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_sorted_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sorted_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_sortedComp_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_sortedComp_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, Comparator<? super T0> arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_filter_limit_map_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_filter_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, Predicate<T0> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_filter_limit_limit_anyMatch(Collection<T0> input, Predicate<T0> arg0, long arg1, long arg2, Predicate<T0> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			if (!arg0.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_map_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_map_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntUnaryOperator arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			t1 = arg1.applyAsInt(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_filter_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_filter_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntPredicate arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			t2 = arg2.applyAsLong(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToInt_mapToLong_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, LongFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			Long t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToLong_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToLongFunction arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			long t2 = arg1.applyAsLong(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			t2 = arg2.applyAsDouble(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToInt_mapToDouble_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, DoubleFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			Double t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_mapToDouble_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntToDoubleFunction arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			double t2 = arg1.applyAsDouble(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2, T3> boolean stream_mapToInt_mapToObj_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, Function<T2, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, Predicate<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, ToIntFunction<T2> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, ToLongFunction<T2> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, ToDoubleFunction<T2> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_sorted_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, Predicate<T2> arg3) {
		List<T2> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (T2 t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_sortedComp_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, Comparator<? super T2> arg2, Predicate<T2> arg3) {
		List<T2> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (T2 t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_mapToObj_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, IntFunction<T2> arg1, long arg2, Predicate<T2> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			T2 t2 = arg1.apply(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToInt_boxed_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, Function<Integer, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, Predicate<Integer> arg2, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, ToIntFunction<Integer> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, ToLongFunction<Integer> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, ToDoubleFunction<Integer> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_sorted_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, Predicate<Integer> arg3) {
		List<Integer> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (Integer t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_sortedComp_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, Comparator<? super Integer> arg2, Predicate<Integer> arg3) {
		List<Integer> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (Integer t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_boxed_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg2, Predicate<Integer> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			Integer t2 = t1;
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntPredicate arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntToLongFunction arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToInt_limit_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, Predicate<Integer> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToInt_limit_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg0, long arg1, long arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			int t1 = arg0.applyAsInt(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_map_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_map_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongUnaryOperator arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			t1 = arg1.applyAsLong(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_filter_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_filter_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongPredicate arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			t2 = arg2.applyAsInt(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToLong_mapToInt_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, IntFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			Integer t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToInt_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToIntFunction arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			int t2 = arg1.applyAsInt(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			t2 = arg2.applyAsDouble(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToLong_mapToDouble_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, DoubleFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			Double t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_mapToDouble_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongToDoubleFunction arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			double t2 = arg1.applyAsDouble(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2, T3> boolean stream_mapToLong_mapToObj_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, Function<T2, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, Predicate<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, ToIntFunction<T2> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, ToLongFunction<T2> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, ToDoubleFunction<T2> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_sorted_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, Predicate<T2> arg3) {
		List<T2> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (T2 t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_sortedComp_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, Comparator<? super T2> arg2, Predicate<T2> arg3) {
		List<T2> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (T2 t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_mapToObj_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, LongFunction<T2> arg1, long arg2, Predicate<T2> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			T2 t2 = arg1.apply(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToLong_boxed_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, Function<Long, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, Predicate<Long> arg2, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, ToIntFunction<Long> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, ToLongFunction<Long> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, ToDoubleFunction<Long> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_sorted_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, Predicate<Long> arg3) {
		List<Long> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (Long t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_sortedComp_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, Comparator<? super Long> arg2, Predicate<Long> arg3) {
		List<Long> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (Long t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_boxed_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg2, Predicate<Long> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			Long t2 = t1;
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongPredicate arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongToIntFunction arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToLong_limit_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, Predicate<Long> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToLong_limit_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg0, long arg1, long arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			long t1 = arg0.applyAsLong(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_map_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_map_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleUnaryOperator arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			t1 = arg1.applyAsDouble(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoublePredicate arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_filter_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_filter_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoublePredicate arg1, long arg2, DoublePredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			if (!arg1.test(t1)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			t2 = arg2.applyAsInt(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntPredicate arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntToLongFunction arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToDouble_mapToInt_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, IntFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, Predicate<Integer> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			Integer t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToInt_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToIntFunction arg1, long arg2, IntPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			int t2 = arg1.applyAsInt(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			t2 = arg2.applyAsLong(t2);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongPredicate arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongToIntFunction arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToDouble_mapToLong_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, LongFunction<T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, Predicate<Long> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			Long t3 = t2;
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_mapToLong_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleToLongFunction arg1, long arg2, LongPredicate arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			long t2 = arg1.applyAsLong(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2, T3> boolean stream_mapToDouble_mapToObj_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, Function<T2, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, Predicate<T2> arg2, Predicate<T2> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, ToIntFunction<T2> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, ToLongFunction<T2> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, ToDoubleFunction<T2> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_sorted_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, Predicate<T2> arg3) {
		List<T2> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (T2 t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_sortedComp_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, Comparator<? super T2> arg2, Predicate<T2> arg3) {
		List<T2> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (T2 t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_mapToObj_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, DoubleFunction<T2> arg1, long arg2, Predicate<T2> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			T2 t2 = arg1.apply(t1);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T3> boolean stream_mapToDouble_boxed_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, Function<Double, T3> arg2, Predicate<T3> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			T3 t3 = arg2.apply(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, Predicate<Double> arg2, Predicate<Double> arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			if (!arg2.test(t2)) {
				continue;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, ToIntFunction<Double> arg2, IntPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			int t3 = arg2.applyAsInt(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, ToLongFunction<Double> arg2, LongPredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			long t3 = arg2.applyAsLong(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, ToDoubleFunction<Double> arg2, DoublePredicate arg3) {
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			double t3 = arg2.applyAsDouble(t2);
			if (arg3.test(t3)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_sorted_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, Predicate<Double> arg3) {
		List<Double> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			sorted0.add(t2);
		}
		Collections.sort((List) sorted0);
		for (Double t2: sorted0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_sortedComp_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, Comparator<? super Double> arg2, Predicate<Double> arg3) {
		List<Double> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			sortedComp0.add(t2);
		}
		sortedComp0.sort(arg2);
		for (Double t2: sortedComp0) {
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_boxed_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg2, Predicate<Double> arg3) {
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			Double t2 = t1;
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoublePredicate arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_mapToDouble_limit_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, Predicate<Double> arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_mapToDouble_limit_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg0, long arg1, long arg2, DoublePredicate arg3) {
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			double t1 = arg0.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_sorted_map_map_anyMatch(Collection<T0> input, Function<T0, T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_filter_anyMatch(Collection<T0> input, Function<T0, T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_mapToInt_anyMatch(Collection<T0> input, Function<T0, T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_mapToLong_anyMatch(Collection<T0> input, Function<T0, T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_mapToDouble_anyMatch(Collection<T0> input, Function<T0, T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_sorted_anyMatch(Collection<T0> input, Function<T0, T1> arg1, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T1> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			sorted1.add(t1);
		}
		Collections.sort((List) sorted1);
		for (T1 t1: sorted1) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_sortedComp_anyMatch(Collection<T0> input, Function<T0, T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_map_limit_anyMatch(Collection<T0> input, Function<T0, T1> arg1, long arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg1.apply(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_filter_map_anyMatch(Collection<T0> input, Predicate<T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_filter_anyMatch(Collection<T0> input, Predicate<T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_mapToInt_anyMatch(Collection<T0> input, Predicate<T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_mapToLong_anyMatch(Collection<T0> input, Predicate<T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_mapToDouble_anyMatch(Collection<T0> input, Predicate<T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg1, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_sortedComp_anyMatch(Collection<T0> input, Predicate<T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_filter_limit_anyMatch(Collection<T0> input, Predicate<T0> arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg1.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_map_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_filter_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntPredicate arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_mapToLong_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntToLongFunction arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_mapToDouble_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sorted_mapToInt_mapToObj_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_boxed_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, Predicate<Integer> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToInt_limit_anyMatch(Collection<T0> input, ToIntFunction<T0> arg1, long arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg1.applyAsInt(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_map_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_filter_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongPredicate arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_mapToInt_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongToIntFunction arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_mapToDouble_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sorted_mapToLong_mapToObj_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_boxed_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, Predicate<Long> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToLong_limit_anyMatch(Collection<T0> input, ToLongFunction<T0> arg1, long arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg1.applyAsLong(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_map_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_filter_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoublePredicate arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_mapToInt_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_mapToLong_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sorted_mapToDouble_mapToObj_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_boxed_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, Predicate<Double> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_mapToDouble_limit_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg1, long arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg1.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_sorted_map_anyMatch(Collection<T0> input, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_filter_anyMatch(Collection<T0> input, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_mapToInt_anyMatch(Collection<T0> input, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_mapToLong_anyMatch(Collection<T0> input, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_mapToDouble_anyMatch(Collection<T0> input, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_sorted_anyMatch(Collection<T0> input, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		List<T0> sorted2 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			sorted2.add(t0);
		}
		Collections.sort((List) sorted2);
		for (T0 t0: sorted2) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sorted_limit_anyMatch(Collection<T0> input, long arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_sortedComp_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_sortedComp_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sorted_limit_map_anyMatch(Collection<T0> input, long arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_filter_anyMatch(Collection<T0> input, long arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_mapToInt_anyMatch(Collection<T0> input, long arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_mapToLong_anyMatch(Collection<T0> input, long arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_mapToDouble_anyMatch(Collection<T0> input, long arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_sorted_anyMatch(Collection<T0> input, long arg1, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_sortedComp_anyMatch(Collection<T0> input, long arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sorted_limit_limit_anyMatch(Collection<T0> input, long arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sorted0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_sortedComp_map_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T1> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			sortedComp1.add(t1);
		}
		sortedComp1.sort(arg2);
		for (T1 t1: sortedComp1) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_map_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg1, long arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg1.apply(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_filter_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_filter_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			if (!arg1.test(t0)) {
				continue;
			}
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntPredicate arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntToLongFunction arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sortedComp_mapToInt_mapToObj_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_boxed_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, Predicate<Integer> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToInt_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg1, long arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			int t1 = arg1.applyAsInt(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongPredicate arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongToIntFunction arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sortedComp_mapToLong_mapToObj_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_boxed_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, Predicate<Long> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToLong_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg1, long arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			long t1 = arg1.applyAsLong(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_sortedComp_mapToDouble_mapToObj_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_boxed_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, Predicate<Double> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_mapToDouble_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg1, long arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			double t1 = arg1.applyAsDouble(t0);
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_sorted_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sorted_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_sortedComp_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		List<T0> sortedComp2 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			sortedComp2.add(t0);
		}
		sortedComp2.sort(arg2);
		for (T0 t0: sortedComp2) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_sortedComp_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, Comparator<? super T0> arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg1);
		for (T0 t0: sortedComp1) {
			limit0++;
			if(limit0 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_sortedComp_limit_map_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_filter_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_mapToInt_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_mapToLong_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_mapToDouble_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_sorted_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_sortedComp_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_sortedComp_limit_limit_anyMatch(Collection<T0> input, Comparator<? super T0> arg0, long arg1, long arg2, Predicate<T0> arg3) {
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg0);
		for (T0 t0: sortedComp0) {
			limit0++;
			if(limit0 > arg1) {
				break;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1, T2> boolean stream_limit_map_map_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, Function<T1, T2> arg2, Predicate<T2> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_filter_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, Predicate<T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_mapToInt_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, ToIntFunction<T1> arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_mapToLong_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, ToLongFunction<T1> arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_mapToDouble_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, ToDoubleFunction<T1> arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_sorted_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T1> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			sorted0.add(t1);
		}
		Collections.sort((List) sorted0);
		for (T1 t1: sorted0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_sortedComp_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, Comparator<? super T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T1> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			sortedComp0.add(t1);
		}
		sortedComp0.sort(arg2);
		for (T1 t1: sortedComp0) {
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_map_limit_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg1, long arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			T1 t1 = arg1.apply(t0);
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_filter_map_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_filter_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_mapToInt_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_mapToLong_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_mapToDouble_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_sorted_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_sortedComp_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_filter_limit_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg1, long arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			if (!arg1.test(t0)) {
				continue;
			}
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_map_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntUnaryOperator arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			t1 = arg2.applyAsInt(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_filter_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntPredicate arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_mapToLong_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntToLongFunction arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_mapToDouble_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntToDoubleFunction arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_limit_mapToInt_mapToObj_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, IntFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_boxed_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, Predicate<Integer> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			Integer t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToInt_limit_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg1, long arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			int t1 = arg1.applyAsInt(t0);
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_map_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongUnaryOperator arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			t1 = arg2.applyAsLong(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_filter_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongPredicate arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_mapToInt_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongToIntFunction arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_mapToDouble_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongToDoubleFunction arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			double t2 = arg2.applyAsDouble(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_limit_mapToLong_mapToObj_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, LongFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_boxed_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, Predicate<Long> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			Long t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToLong_limit_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg1, long arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			long t1 = arg1.applyAsLong(t0);
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_map_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoubleUnaryOperator arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			t1 = arg2.applyAsDouble(t1);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_filter_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoublePredicate arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			if (!arg2.test(t1)) {
				continue;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_mapToInt_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoubleToIntFunction arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			int t2 = arg2.applyAsInt(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_mapToLong_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoubleToLongFunction arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			long t2 = arg2.applyAsLong(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T2> boolean stream_limit_mapToDouble_mapToObj_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, DoubleFunction<T2> arg2, Predicate<T2> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			T2 t2 = arg2.apply(t1);
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_boxed_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, Predicate<Double> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			Double t2 = t1;
			if (arg3.test(t2)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_mapToDouble_limit_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg1, long arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			double t1 = arg1.applyAsDouble(t0);
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_sorted_map_anyMatch(Collection<T0> input, long arg0, Function<T0, T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_filter_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_mapToInt_anyMatch(Collection<T0> input, long arg0, ToIntFunction<T0> arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_mapToLong_anyMatch(Collection<T0> input, long arg0, ToLongFunction<T0> arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_mapToDouble_anyMatch(Collection<T0> input, long arg0, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_sorted_anyMatch(Collection<T0> input, long arg0, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sorted1 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sorted1.add(t0);
		}
		Collections.sort((List) sorted1);
		for (T0 t0: sorted1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_sortedComp_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sorted_limit_anyMatch(Collection<T0> input, long arg0, long arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sorted0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_sortedComp_map_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_filter_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_mapToInt_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_mapToLong_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_mapToDouble_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_sorted_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_sortedComp_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		List<T0> sortedComp1 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			sortedComp1.add(t0);
		}
		sortedComp1.sort(arg2);
		for (T0 t0: sortedComp1) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_sortedComp_limit_anyMatch(Collection<T0> input, long arg0, Comparator<? super T0> arg1, long arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg1);
		for (T0 t0: sortedComp0) {
			limit1++;
			if(limit1 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0, T1> boolean stream_limit_limit_map_anyMatch(Collection<T0> input, long arg0, long arg1, Function<T0, T1> arg2, Predicate<T1> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			T1 t1 = arg2.apply(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_filter_anyMatch(Collection<T0> input, long arg0, long arg1, Predicate<T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			if (!arg2.test(t0)) {
				continue;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_mapToInt_anyMatch(Collection<T0> input, long arg0, long arg1, ToIntFunction<T0> arg2, IntPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			int t1 = arg2.applyAsInt(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_mapToLong_anyMatch(Collection<T0> input, long arg0, long arg1, ToLongFunction<T0> arg2, LongPredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			long t1 = arg2.applyAsLong(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_mapToDouble_anyMatch(Collection<T0> input, long arg0, long arg1, ToDoubleFunction<T0> arg2, DoublePredicate arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			double t1 = arg2.applyAsDouble(t0);
			if (arg3.test(t1)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_sorted_anyMatch(Collection<T0> input, long arg0, long arg1, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		List<T0> sorted0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			sorted0.add(t0);
		}
		Collections.sort((List) sorted0);
		for (T0 t0: sorted0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_sortedComp_anyMatch(Collection<T0> input, long arg0, long arg1, Comparator<? super T0> arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		List<T0> sortedComp0 = new ArrayList<>();
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			sortedComp0.add(t0);
		}
		sortedComp0.sort(arg2);
		for (T0 t0: sortedComp0) {
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}

	public static <T0> boolean stream_limit_limit_limit_anyMatch(Collection<T0> input, long arg0, long arg1, long arg2, Predicate<T0> arg3) {
		if(arg0 < 0) {
			throw new IllegalArgumentException();
		}
		long limit0 = 0;
		if(arg1 < 0) {
			throw new IllegalArgumentException();
		}
		long limit1 = 0;
		if(arg2 < 0) {
			throw new IllegalArgumentException();
		}
		long limit2 = 0;
		for (T0 t0 : input) {
			limit0++;
			if(limit0 > arg0) {
				break;
			}
			limit1++;
			if(limit1 > arg1) {
				break;
			}
			limit2++;
			if(limit2 > arg2) {
				break;
			}
			if (arg3.test(t0)) {
				return true;
			}
		}
		return false;
	}


}
