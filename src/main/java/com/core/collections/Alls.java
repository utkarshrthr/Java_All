package com.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Alls {
/* Example of Comparator.reverseOrder, Collections.unmodifiableList, Iterator vs. ListIterator */	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4); 
		
		
		System.out.println(list.add(9));
		System.out.println(list.add(9));
		
		/*
		 * System.out.println(list); Collections.sort(list); System.out.println(list);
		 * 
		 * Collections.sort(list, Comparator.reverseOrder()); System.out.println(list);
		 * 
		 * List<Integer> constList = Collections.unmodifiableList(list);
		 * //constList.add(99); // java.lang.UnsupportedOperationException
		 * 
		 * ListIterator<Integer> iterator = list.listIterator();
		 * 
		 * while(iterator.hasNext()) { System.out.println(iterator.next());
		 * iterator.add(1); }
		 */
	}
}

/*
class Post
{
    private ErrorLogger errorLogger = new ErrorLogger();

    void CreatePost(Database db, string postMessage)
    {
        try
        {
            db.Add(postMessage);
        }
        catch (Exception ex)
        {
            errorLogger.log(ex.ToString())
        }
    }
}
*/