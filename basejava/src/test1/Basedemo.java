package test1;

public  class Basedemo extends Abstractdemo {

	   public void test() {
		   System.out.println("This is non abstract test method");
	   
	                             }
	   //public abstract void test1();
	   
	   
	   public static void main(String[] args) {
	Basedemo demo= new Basedemo();
	demo.test();
	demo.method1();
int number = 	Abstractdemo.method2();
   System.out.println(  number);
	}


	@Override
	void method1() {
		
		 System.out.println("This is method1 from abstract class");
		
	}
	    
	  
	}

     
    	
    	
    
