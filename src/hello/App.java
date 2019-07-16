package hello;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
	private Map <String,Integer> jaMap= new HashMap<String,Integer>();
	
	public void addItem(String key, Integer value) {
		this.jaMap.put(key, value);
	}
	
	public void displayItem(String key) {
		System.out.println("The value of "+key+" is: "+ String.valueOf(this.jaMap.get(key)));	
	}
}
