package Concretes;

import Abstract.BurgerBase;

public class ChickenBurger extends BurgerBase{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.0f;
	}
}
