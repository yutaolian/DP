package dp.factory;

public class Client {
	
	public static void main(String[] args) {
		
		FactoryA factoryA = new FactoryA();
		Product productA = factoryA.creatPeoduct();
		
		productA.des();
		FactoryB factoryB = new FactoryB();
		Product productB = factoryB.creatPeoduct();
		
		productB.des();
	}

}
