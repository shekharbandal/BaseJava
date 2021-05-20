package test1;



public class Interfacedemo implements Interfdemo {

	 
	public int method1() {
		 System.out.println("This is method1 with Interface demo");
		 return (10*10);
	}

	 
	public void method2() {
		 System.out.println( "This is method 2 with Interface demo");
		
	}

	 
	public void method3() {
		 System.out.println("This is method 3 with Interface demo");
		
	}

	
	  public static void main(String[] args) {
		
		  Interfacedemo demo = new Interfacedemo(); 
	      int number = 	   demo.method1();
		    demo.method2();
		   demo.method3();
		     System.out.println(number);
		Interfdemo.method4();
	                                                                   
	                                                                         }

		
}
