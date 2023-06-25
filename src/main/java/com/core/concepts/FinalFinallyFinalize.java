package com.core.concepts;

public class FinalFinallyFinalize {

	public static final int x = 100; /** final is a keyword, used with variables, methods and classes
	 * 'final' variables can not be changed once initialized, final class can not be sub-classed, final method can not be overridden,
	 * all methods of a final class are final by default */
	
	public static void main(String[] args) {
		try{  
			int x=300;  
		}
		catch(Exception e){
			System.out.println(e);
		}  
		finally {
			System.out.println("finally block is executed");	/** 'finally' is a also a reserved keyword, it indicates a block, it is used in association with 
			try/catch block, and guarantees that a section of code will be executed, even if an exception is thrown*/
		}  
		
		FinalFinallyFinalize fff = new FinalFinallyFinalize();
		
		fff = null;	// finalize method will be called because of this line
		
		System.gc();
		
		/* SPECIAL CASE FOR finally BLOCK -> in the following case exception will thrown after 'finally' block, because exception not cathed in catch block */
		int k = 15; 
        try { 
            System.out.println("In try block"); 
            int z = k / 0; 
        } 
        catch (NullPointerException e) { 
            System.out.println("In catch block"); 
            System.out.println("Dividing by zero but caught"); 
        } 
        finally { 
            System.out.println("Executes whether an exception occurs or not"); 
        }
        
        Runner runner = new Runner();
	}
	
	@Override
	public void finalize(){
		/*It is a method that the Garbage Collector always calls just before the deletion/destroying the object which is eligible for Garbage Collection, so as to 
		 * perform clean-up activity. Clean-up activity means closing the resources associated with that object like Database Connection, Network Connection or we 
		 * can say resource de-allocation*/
		System.out.println("finalize called");
		
		/**We can call finalize method Explicitly then it will be executed just like normal method call but object won’t be deleted/destroyed
		 * If Garbage Collector calls finalize method, while executing finalize method some unchecked exception rises then JVM ignores that exception and rest of 
		 * program will be continued normally
		 */
	}
	
	public void fun(int x, float y) {
		
	}
	
	public void fun(float x, int y) {
		
	}
}

final class Runner {
	
}
