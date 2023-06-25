package com.core.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {
	public static void main(String[] args) {
		
		//
		
		Class<Dummy> dummy = Dummy.class;
		
		Constructor[] constructors =  dummy.getDeclaredConstructors();
		
		for(Constructor constructor: constructors) {
		}
		
		Field[] fields = dummy.getFields();
		
		System.out.println(fields.length);
		
		for(Field field: fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		
		
		Method[] methods = dummy.getMethods();
		for(Method method:methods) {
			System.out.println(method.getName() + " has " + method.getParameterCount() + " patameters");
		}
	}
}
