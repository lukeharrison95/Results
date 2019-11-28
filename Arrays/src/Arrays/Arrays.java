package Arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
	
		int[] qOne = {1,4,3,2,5,10,45,22,13,4};
		
		for(int element : qOne) {
			System.out.println(element);
		}
		
		ArrayList <Integer> qTwo = new ArrayList<>();
		
		for(int i =0 ; i<10; i++) {
			qTwo.add(i);
			
		}
		
		System.out.println(qTwo);
		System.out.println();
		for(int i : qTwo) {
			int j= i*2;
			System.out.println(j);
		}
	}


}
