package ex6_static;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arr = new int[100];
		
		for(int i = 0; i <arr.length; i++) {
			int num = rnd.nextInt(10);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		int[] count = new int[10];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		String str = "#";
		for(int i = 0; i < count.length; i++) {
			
			System.out.printf("%d : %d°³\n",i,count[i]);
		}
		
			
	}
}
