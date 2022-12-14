package Abstract;

import Concretes.Bottle;
import Interfaces.IItem;
import Interfaces.IPacking;

public abstract class ColdDrink implements IItem {
	@Override
	public IPacking packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
