package test1;

public class Secmaximum {
    
	public static void main(String[] args) {
		
		int[] array = {11,2,3,4,10,16};
		
		int biggest = 0;
		int second_biggest = 0;
		int third_biggest = 0;
		
		for(int i =1;i<array.length;i++) {
			if(array[i]> biggest) {
				third_biggest= second_biggest;
				second_biggest = biggest;
				biggest = array[i];
			}
			else if (second_biggest < array[i] ) {
				
				 second_biggest = array[i];
			}
		}
		System.out.println("The third biggest number is "  +  third_biggest);
		System.out.println("The second biggest number is "  +  second_biggest);
	}
	
	
}
