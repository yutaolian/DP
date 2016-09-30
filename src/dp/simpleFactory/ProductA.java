package dp.simpleFactory;

public class ProductA implements Product {

	public ProductA() {
		// TODO Auto-generated constructor stub
		System.out.println("创建A");
	}

	@Override
	public void desc() {
		// TODO Auto-generated method stub
		
		System.out.println("this is A product");
		
	}

}
