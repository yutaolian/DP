package dp.abstractFactory;

public class Client {
	
	public static void main(String[] args) {
		
		Factory factoryX = new FactoryX();
		ProductA productA = factoryX.createProductA();
		productA.desA();
		ProductB productB = factoryX.createProductB();
		productB.desB();
		
		System.out.println("-----------------------");
		Factory factoryY = new FactoryY();
		ProductA productA2 = factoryY.createProductA();
		productA2.desA();
		ProductB productB2 = factoryY.createProductB();
		productB2.desB();

		
		
	}

}
