package dp.simpleFactory;

public class ProductB implements Product {

	public ProductB() {
		// TODO Auto-generated constructor stub
		System.out.println("创建B");
	}

	@Override
	public void desc() {
		// TODO Auto-generated method stub
		System.out.println("this is B product");
	}
}
