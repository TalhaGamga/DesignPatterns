package Concretes;

import Interfaces.IShape;

public class Rectangle implements IShape{

	@Override
	public void Draw() {
		System.out.println("Rectangle::draw()");
	}

}
