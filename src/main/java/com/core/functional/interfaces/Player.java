package com.core.functional.interfaces;

@FunctionalInterface
public interface Player<T extends Object>  {
	public void play(T t);
}
