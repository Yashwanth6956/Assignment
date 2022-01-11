package com.te.testambiguity;

public interface Test2 {
default void m1() {
	System.out.println("from test2");
}
}
