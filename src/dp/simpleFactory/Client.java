package dp.simpleFactory;

public class Client {

	public static void main(String[] args) {
		
		Product productA = Factory.getProduct("A");
		productA.desc();
		
		Product productB = Factory.getProduct("B");
		productB.desc();
	}
}
