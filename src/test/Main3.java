package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int a=65;a<91;a++){
        	str=str.replace((char)a, (char)(a+32));
        }
        str.trim();
    	str=str.replace(" ",",");
    	str=str.replace(".",",");
    	str=str.replace(":",",");
    	String str1[]=str.split(",");
        HashMap<String , Integer> strMap = new HashMap<String , Integer>();
        for(int i=0;i<str1.length;i++){
        	if(str1[i].isEmpty()){
        	}else{
        	if(strMap.isEmpty()||strMap.get(str1[i])==null){
        		strMap.put(str1[i], 1);
        	}else {
        		int count=strMap.get(str1[i]);
        		strMap.remove(str1[i]);
        		strMap.put(str1[i], count+1);
        	}
        	}
        }
        Set set=strMap.entrySet();
        Entry[] entries = (Entry[])set.toArray(new Entry[set.size()]);
        Comparator c=new Comparator(){
        	public int compare(Object obj1, Object obj2) {
        		if((Integer)((Entry)obj1).getValue()>(Integer)((Entry)obj2).getValue()){
        			return -1;
        		}else if((Integer)((Entry)obj1).getValue()<(Integer)((Entry)obj2).getValue()){
        			return 1;
        		}else if((Integer)((Entry)obj1).getValue()==(Integer)((Entry)obj2).getValue()){
            		String s1=String.valueOf(((Entry)obj1).getValue())+((Entry)obj1).getKey();
            		String s2=String.valueOf(((Entry)obj2).getValue())+((Entry)obj2).getKey();
            	    return ((Comparable)s1).compareTo(s2);
        		}
				return 0;
        	}
        };
        Arrays.sort(entries,c);
        for(Entry entry:entries){
        	System.out.println((String) entry.getKey()+" "+(Integer)entry.getValue());
        	
        }        
    }       
}
