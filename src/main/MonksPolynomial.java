package main;

import java.util.Scanner;

public class MonksPolynomial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        String solutions = "";
        
        for(int i=0;i<n;i++) {
        	
	        int a = sc.nextInt(); 
	        int b = sc.nextInt(); 
	        int c = sc.nextInt(); 
	        int k = sc.nextInt(); 

	        boolean founded = false;
	        int x = 0;
	        int ecuation;
	        
	        while(!founded) {
	        	ecuation = a*x*x + b*x + c;
	        	if(ecuation>=k) {
	        		founded = true;
	        	} else {
	        		x++;
	        	}
	        }
	        
        	solutions += (int)x+"\n";
        }
        System.out.println(solutions); 
	}
}
