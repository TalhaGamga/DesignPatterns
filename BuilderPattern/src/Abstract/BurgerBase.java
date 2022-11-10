package Abstract;

import Concretes.Wrapper;
import Interfaces.IItem;
import Interfaces.IPacking;

public abstract class BurgerBase implements IItem {
	
	@Override
	public IPacking packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
