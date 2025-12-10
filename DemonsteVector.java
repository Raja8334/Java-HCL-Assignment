package JavaAssign3_4;

import java.util.Iterator;
import java.util.Vector;

public class DemonsteVector {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Raja");
		vector.add("Aarav");
		vector.add("Rocky");
		vector.add("Raja");
		vector.add("Raja");
		System.out.println("After adding vector : "+vector);
		System.out.println("Size of Vector State : "+ vector.size());
		vector.add(4,"Sita");
		System.out.println("Insert at specific Position : " +vector);
		System.out.println("Element at index 0: "+vector.get(0));
		System.out.println("Element at postion : "+vector.get(4));
		System.out.println("Contains John : "+vector.contains("John"));
		System.out.println("Contains Raja : "+vector.contains("Raja"));
		vector.remove("Rocky");
		vector.remove(4);
        System.out.println(vector);
        for(String name : vector)
        {
        	System.out.println(name +" ");
        }
        System.out.println("\n");
        
        Iterator<String> it = vector.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next()+ " ");
        }
        System.out.println("\n");
        System.out.println("Current Capacity : " +vector.capacity());
        System.out.println("Current Size : " +vector.size());        
        
	}

}
