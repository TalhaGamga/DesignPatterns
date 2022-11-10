package Concretes;

import Interfaces.IPacking;

public class Bottle implements IPacking{

	@Override
	public String pack() {
		return "Bottle";
	}
}
