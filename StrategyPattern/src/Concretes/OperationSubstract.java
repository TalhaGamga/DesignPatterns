package Concretes;

import Interfaces.IStrategy;

public class OperationSubstract implements IStrategy {

	@Override
	public int DoOperation(int num1, int num2) {
		return num1-num2;
	}
}
