package test;

import java.util.Scanner;

public class Main4 {

	
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        String a="";
        for(;number>1;number=number/2){
        	a=(number%2==0?"0":"1")+a;
        }
        System.out.println("1"+a);
	}
	
}
