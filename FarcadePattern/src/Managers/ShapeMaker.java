package Managers;
import Concretes.Circle;
import Concretes.Rectangle;
import Concretes.Square;
import Interfaces.IShape;

public class ShapeMaker {
	private IShape circle;
	private IShape square;
	private IShape rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	
	public void DrawCircle() {
		circle.Draw();
	}
	
	public void DrawSquare() {
		square.Draw();
	}
	
	public void DrawRectangle() {
		rectangle.Draw();
	}
}
