package Managers;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IItem;

public class Meal {
	private List<IItem> items = new ArrayList<IItem>();
	
	public void AddItem(IItem item) {
		items.add(item);
	}
	
	public float GetCost() {
		float cost = 0.0f;
		
		for(IItem item : items) {
			cost+=item.price();
		}
		
		return cost;
	}
	
	public void ShowItems() {
		
		for(IItem item : items) {
			System.out.println("Item : " + item.name());
			System.out.println("Packing : " + item.packing().pack());
			System.out.println("Price : " + item.price());
		}
	}
}
