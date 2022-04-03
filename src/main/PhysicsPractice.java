package main;

import java.util.Random;
import java.util.Scanner;

public class PhysicsPractice {
	
	public static void mix(int[] array) {
		Random r = new Random();

		for (int i = 0; i <= array.length - 2; i++) {
			int j = i + r.nextInt(array.length - i);

			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
		}

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
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int ans = n - 1;

		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();

		mix(a);

		int i = 0, j = 0;

		while (i < n) {
			while (j < n && a[i]*2 >= a[j]) {
				j++;
			}
			
			if (i + n - j < ans) {
				ans = i + n - j;
			}
			
			i++;
		}

		System.out.println(ans + "");  

	}
}
