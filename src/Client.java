import Implement.Creator;
import Interface.AbstractCreator;
import Interface.IProduct;

public class Client {
	
	public static void main(String[] args) {
		AbstractCreator creator = new Creator();
		IProduct produit = creator.factoryMethod("Sen");
		produit.service();
		
		produit = creator.factoryMethod("Ita");
		produit.service();
		produit = creator.factoryMethod("Ame");
		produit.service();

	}

}
