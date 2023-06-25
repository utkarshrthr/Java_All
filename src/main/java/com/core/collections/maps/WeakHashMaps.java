package com.core.collections.maps;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMaps {
	public static void main(String args[]) throws Exception { 
		HashMap<Object, String> m = new HashMap<>(); 
        Demo d1 = new Demo(); 
        // puts an entry into HashMap 
        m.put(d1, "Hi");  
        System.out.println(m);  
        d1 = null; 
        // garbage collector is called 
        System.gc(); 
        //thread sleeps for 4 sec 
        Thread.sleep(2000);  
        System.out.println(m); 
        
        
        WeakHashMap<Object, String> wm = new WeakHashMap<>(); //  keys that are of a WeakReference type.
        Demo d2 = new Demo(); 
        // puts an entry into WeakHashMap 
        wm.put(d2, "Hello");  
        System.out.println(wm); 
        d2 = null; 
        // garbage collector is called 
        System.gc();  
        // thread sleeps for 4 sec 
        Thread.sleep(2000); 
        System.out.println(wm); 
    } 
}
    
class Demo { 
	public String toString(){ 
		return "demo"; 
	} 
	// finalize method 
	@Override
	public void finalize() { 
		System.out.println("Finalize method is called"); 
	} 
}
