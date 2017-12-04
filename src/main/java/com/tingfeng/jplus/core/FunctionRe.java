package com.tingfeng.jplus.core;

@FunctionalInterface
public interface FunctionRe {
	public <T> T functionRe(Class<?> returnType,Object ... args);
}
