package dp.simpleFactory;

public class Factory {

	//静态工厂方法
	public static Product getProduct(String type){
		Product product = null;
		if (type.equals("A")) {
			product = new ProductA();
			System.out.println("设置A");
		}else if (type.equals("B")) {
			product = new ProductB();
			System.out.println("设置B");
		}
		return product;
		
	}
}
