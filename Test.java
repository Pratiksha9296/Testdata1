package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class A 
{
	public static void main(String[] args) {
		
	
	ArrayList arr=new ArrayList();
	arr.add(10);
	arr.add(20);
	arr.add(40);
	arr.add(50);
	arr.add(null);
	arr.add("Str");
	System.out.println(arr);
	
for (int i=0;i<arr.size();i++)
	{
	System.out.println(arr.get(i));
	}
}
}
