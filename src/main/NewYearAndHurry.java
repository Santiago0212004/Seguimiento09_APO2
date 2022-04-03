package main;

import java.util.Scanner;

public class NewYearAndHurry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        int count = 0;
        
        if(n>=1 && n<=10) {
        
    		int k = sc.nextInt();
    		count = 0;
    		int sum = 0;
    		int difference = 240 - k;
        	
        	if(k>=1 && k<=240) {
        
        		for(int i = 1; i<=n; i++) {
        			sum += 5*i;
        			
        			if(sum>difference) {
            			break;
            		}
        			
        			count++;
        		}
        			
        	}
    	}

        System.out.println(count);
	}   
}
