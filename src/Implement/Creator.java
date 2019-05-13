package Implement;

import Interface.AbstractCreator;
import Interface.IProduct;

public class Creator extends AbstractCreator {

	public Creator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IProduct factoryMethod(String s) {
		switch(s) {
		    case "Sen": p = new PizzaSene();break;
		    case "Ame": p = new PizzaAmer();break;
		    case "Ita": p = new PizzaIta();break;
		}
		return p;
	}

}
