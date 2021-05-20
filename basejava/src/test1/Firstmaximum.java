package test1;
import java.util.*;
public class Firstmaximum {
  public static void main(String[] args) {
	
	  int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9,10};
		int length1 = array1.length;
		int length2 = array2.length;
		//int[] result = new int [length1+length2];
		//System.arraycopy(array1,0,result,0,length1);
		
			
		/*for(int array:array1) {
			int max1 = array1[0];
			 
			
		}*/
		int max1 = array1[0];
		
		for(int i = 1;i<array1.length;i++) {
			if(array1[i]>max1) {
				max1 = array1[i];
				int temp = max1;
			}
			
			
		}
		System.out.println("The maximum value of array1 is" +   max1);
}
	
 	
}

