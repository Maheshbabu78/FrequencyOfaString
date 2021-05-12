package Hellojava;
import java.util.*;
import java.util.Map.Entry;
	public class Demo{
	public static void main(String[] args) {	
		String name="mahesh is here mahesh here";
		String a[]=name.split("\s");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(Entry demo: map.entrySet()) {
			System.out.println(demo.getKey()+ "  "+ demo.getValue()+ " times");
		}
		
		}
	}
	
 
