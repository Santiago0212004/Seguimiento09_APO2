package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ExactSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> books = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			books.add(sc.nextInt());
		}
		
		int a, b;
		boolean changed=false;
		for(int i=0; i<books.size()-1; i++) {
			a = books.get(i);
			for(int j=(i+1); j<books.size() && !changed; j++) {
				b = books.get(j);
				
				if(a>b) {
					books.remove(j);
					books.add(i,b);
					changed = true;
					i--;
				}				
			}
			changed = false;
		}
		
		int money = sc.nextInt();
	
		
		int pair[] = new int[2];
		int difference;
		
		int menor = 10000000;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				difference = books.get(i)-books.get(j);
				
				if(difference<0) {
					difference = difference*(-1);
				}
				
				if(difference<menor && (books.get(i)+books.get(j)==money)) {
					menor = difference;
					pair[0] = books.get(i);
					pair[1] = books.get(j);
				}
				
			}
		}

		System.out.println("Peter should buy books whose prices are "+pair[0]+" and "+pair[1]+".");
		
	}

}
