package Managers;

import Concretes.ChickenBurger;
import Concretes.Coke;
import Concretes.Pepsi;
import Concretes.VegBurger;

public class MealBuilder {
	
	public Meal PrepareVegMeal() {
		Meal meal = new Meal();
		meal.AddItem(new VegBurger());
		meal.AddItem(new Coke());
		return meal;
	}
	
	public Meal PrepareNonVegMeal() {
		Meal meal = new Meal();
		meal.AddItem(new ChickenBurger());
		meal.AddItem(new Pepsi());
		return meal;		
	}
}
