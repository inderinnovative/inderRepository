package com.inder;

public interface InderFunctional {
	abstract void absik(int x);
	
	default void ab(int x, int y) {
		System.out.println(x+y);
	}

	default void abc(int x, int y) {
		System.out.println(x-y);
	}
}
