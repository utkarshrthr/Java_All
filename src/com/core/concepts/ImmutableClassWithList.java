package com.core.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableClassWithList {

	public static void main(String[] args) {

		List<String> inp = new ArrayList<String>();
		inp.add("abc");
		ImmutableWithList list = new ImmutableWithList(inp);
		list.getList().add("def");	
		System.out.println(list.getList());		
		
		Integer integer = new Integer(1);
		integer.intValue();
		
		String s = new String("abc");
		s.concat("def");
		System.out.println(s);
		
		Set<User> users = new HashSet<User>();
		users.add(new User("abc", 1));
		users.add(new User("abc", 1));
		
		System.out.println(users.size());
	}
}

class User {
	private String name; private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return (this.age == user.age && this.name.equals(user.name));
	}*/
	
	
}


final class ImmutableWithList {
	
	private final List<String> list;
	
	public ImmutableWithList(List<String> list) {
		this.list = list;
	}
	
	public List<String> getList(){
		//return Collections.unmodifiableList(this.list);
		return new ArrayList<String>(list);
	}
	
	// NO SETTER METHOD
}


