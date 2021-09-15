package com.Bridgelabs;

import java.util.Scanner;
import com.Bridgelabs.FoodItem;
import com.Bridgelabs.FoodStore;


//this is the controller layer
public class Application {
	
	 static DrivenInterface drivenInterface = DrivenInterface.getInstance();

	    public static void main(String[] args) {
	        drivenInterface.showUserMenu();
	    }

	    public boolean handleUserSelection(int num) {
	        FoodStore foodStore = FoodStore.getSingle_Instance();

	        switch (num) {
	            case 1 -> {
	                FoodItem foodItem = drivenInterface.addItem();
	                foodStore.add(foodItem);
	            }
	            case 2 -> {
	                System.out.println("Enter the ItemName which you want to remove: ");
	                String name = new Scanner(System.in).nextLine();
	                FoodItem food = foodStore.getFoodItem(name);
	                foodStore.remove(food);
	            }
	            case 3 -> {
	                System.out.println("\n********** MENU *************");
	                drivenInterface.print(foodStore.getFoodList());
	                System.out.println("********** MENU End *************\n");
	            }
	            case 4 -> {

	                System.out.println("Enter the ItemName which you want to edit: ");
	                String name = new Scanner(System.in).nextLine();
	                FoodItem food = foodStore.getFoodItem(name);
	                if (food != null) {
	                    drivenInterface.edit(food);
	                } else {
	                	System.out.println("\n First add the Item && Item not found...\n");
	                }


	            }
	            case 5 -> {
	                System.out.println("\nThanks for Visiting.........");
	                return false;
	            }
	            default -> System.out.println("plz enter correct choice........");
	        }
	        return true;
	    }
}
