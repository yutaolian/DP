package dp.abstractFactory;

public class FactoryX implements Factory{

	@Override
	public ProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductXA();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductXB();
	}

}
