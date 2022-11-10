package Concretes;

import Abstract.BurgerBase;

public class VegBurger extends BurgerBase {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "VegBurger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}
}
