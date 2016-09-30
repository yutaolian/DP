package dp.abstractFactory;

public class FactoryY implements Factory {

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductYA();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductYB();
	}

}
