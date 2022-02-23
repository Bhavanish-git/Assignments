package ColletionsAssignment;

import java.util.TreeMap;
public class Collection_Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 916387843, "Vishwa");
		contact.put((long) 943388789, "Aditya");
		contact.put((long) 987456983, "Bhavanish");
		contact.put((long) 969874152, "Jack");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}