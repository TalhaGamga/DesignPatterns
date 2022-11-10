package Concretes;

import Interfaces.IShape;

public class Square implements IShape {

	@Override
	public void Draw() {
		System.out.println("Square::draw()");
	}
}
