package Controllers;

import Managers.Meal;
import Managers.MealBuilder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.PrepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.ShowItems();
		System.out.println("Total Cost: " + vegMeal.GetCost());
		
		Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.ShowItems();
		System.out.println("Total Cost: " + nonVegMeal.GetCost());
	}
}
