package main;

import java.util.Scanner;

public class GamerHemose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int n, H;
		
		int w; //Weapons used
		boolean killed;
		
		for(int i=0; i<t; i++) {
			n = sc.nextInt();
			H = sc.nextInt();
			killed = false;
			w = 1;
			int totalDamage = 0;
			
			int[] a = new int[n];
			
			for(int j = 0; j<n; j++) {
				a[j] = sc.nextInt();
			}
			
			a = sort(a);
			
			
			for(int j = a.length-1; j>=0 && !killed; j--) {
				totalDamage += a[j];
				
				if(totalDamage>=H) {
					killed = true;
				} else {
					w++;
				}
				
			}
			System.out.println(w);
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
