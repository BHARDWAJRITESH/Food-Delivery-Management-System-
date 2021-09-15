package com.Bridgelabs;

import java.util.ArrayList;
import java.util.List;



public class FoodStore {
	private static FoodStore single_instance = null;

	
	
	FoodStore(){
	}
	
	public  synchronized static FoodStore getSingle_Instance() {
		if ( single_instance == null) {
			single_instance = new FoodStore();
		
		}
		return single_instance;
	}	
	
	List<FoodItem> foodList = new ArrayList<>();
	
	
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
		
	}
	
	public void remove(FoodItem foodItem) {
		foodList.remove(foodItem);
		System.out.println("\nDeleted..\n");
	}
	
	public List<FoodItem> getFoodList() {
		return foodList;
	}
	public List<FoodItem>getList() {
		return foodList;
	}
	
	public FoodItem getFoodItem(String foodName) {
		for(FoodItem foodItem : foodList) {
			if(foodName.equals(foodItem.itemName)) {
				return foodItem;
			}
		}
		return null;
	}	
}
	
	
