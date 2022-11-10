package Concretes;

import Interfaces.IShape;

public class Circle implements IShape{

	@Override
	public void Draw() {
		System.out.println("Circle::draw()");
	}

}
