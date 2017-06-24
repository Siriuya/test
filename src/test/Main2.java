package test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
    	int x=0;
    	int y=0;
    	boolean isEnd=false;
        for(int i=0;i<str.length();i++){
        	isEnd=false;
        	int a=(int)str.charAt(i)-48;
        	if(a>=0&&a<10&&!isEnd){
        		y=y*10+a;
        		System.out.println(y);
        	}else if(a>=10||a<=0){
        		isEnd=true;
        		x=x+y;
        		y=0;
        	}
        }
        if(!isEnd)x=x+y;
    	System.out.println(x);
    }

}
