package test;

import java.util.Scanner;

public class Main

{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 1;
        if(!scan.hasNextInt()){
        	System.out.println("ÕˆÝ”ÈëÕý´_”µ×Ö");
        }else{
        	a = scan.nextInt();
        }
        for(int i=1;i<a;i++){
        	int x =2;
        	int y =1;     	
        	boolean flag = true;
        	for(;x*y!=i;x++){
        		if(x*y>i)break;
        		for(;x*y!=i;y++){
            		if(x*y>i)break;
        		}
        		if(x*y==i){
        			flag = false;
        		}
        		y=1;
        	}
        	if(flag){
        		System.out.println(i);
        	}
        }
    }
}
