package main;

import java.util.Scanner;

public class MaxAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		int e;
		for(int i = 0; i<n; i++) {
			e = sc.nextInt();
			array[i] = e;
		}
		
		array = sort(array);
		
		int q = sc.nextInt();
		
		int maxAvg, limit, count;
		for(int i = 0; i<q; i++) {
			maxAvg = sc.nextInt();
	        limit = 0;
	        count = 0;
	        for (int j : array) {
	            int diff = j - maxAvg;
	            if (limit + diff < 0) {
	                count++;
	                limit += diff;
	            } else {
	                break;
	            }
	        }
	        System.out.println(count);
		}

	}
	
	public static int[] sort(int[] array) {
		int a, b, aux;
		for(int i=0; i<(array.length-1); i++) {
			for(int j=(i+1); j<array.length ; j++) {
				a = array[i];
				b = array[j];
				
				aux = a;
				
				if(a>b) {
					array[i] = b;
					array[j] = aux;
				} 
			}
		}
		return array;
	}
	
}
