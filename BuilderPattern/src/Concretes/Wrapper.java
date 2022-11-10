package Concretes;

import Interfaces.IPacking;

public class Wrapper implements IPacking {

	@Override
	public String pack() {
		return "Wrapper";
	}
}
