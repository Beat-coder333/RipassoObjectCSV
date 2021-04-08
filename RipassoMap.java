package it.objectmethod.ripasso.cvs;

import java.util.HashMap;
import java.util.Map;

public class RipassoMap {

	public static void main(String[] args) {
		
//Map Base
		Map<String,String>fruits = new HashMap<>();
		fruits.put("red", "apple");
		fruits.put("yellow", "banana");
		fruits.put("white", "onion");
		fruits.put("green", "apple");
		
		System.out.println(fruits.containsKey("red"));//riotrna true se il valore esiste
		System.out.println(fruits.containsValue("apple"));//riotrna true se il valore esiste
		System.out.println(fruits.size());//riporta grandezza map
		System.out.println(fruits.remove("red"));//elimina entry con la key selezionata
		//fruits.clear();//elimina tutte le entry
		
		
		System.out.println(fruits.get("red"));
		
		for(Map.Entry pairEntry:fruits.entrySet()) {
			System.out.println(pairEntry.getKey()+ ":"+ pairEntry.getValue());
		}
		
		
		//Map<String,Customer> map = new HashMap<>();
		

		//Customer customer1 = new Customer("123","John Doe");
		//System.out.print(customer1.toString());
		
	}

}
