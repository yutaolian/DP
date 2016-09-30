package dp.prototype;

public class Client {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setName("iphone7");
		product1.setPrice(6888.88);
		
		System.out.println(product1);
		
		try {
			Product product2 = product1.clone();

			System.out.println(product2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
