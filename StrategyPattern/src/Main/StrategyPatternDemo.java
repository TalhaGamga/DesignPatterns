package Main;

import Concretes.OperationAdd;
import Concretes.OperationMultiply;
import Concretes.OperationSubstract;
import Managers.Context;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 : " + context.ExecuteStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("5 * 7 : " + context.ExecuteStrategy(5, 7));
		
		context = new Context(new OperationSubstract());
		System.out.println("53 - 42 : " + context.ExecuteStrategy(53,42));
	}
}
