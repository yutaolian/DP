package dp.builder;

public class Client {

	public static void main(String[] args) {
		
		ComputerBuilder builder = new DellComputerBuilder();
		ComputerController controller = new ComputerController();
		Computer computer = controller.construct(builder);
		System.out.println(computer.toString());
		System.out.println("---------");
		
		ComputerBuilder builder2 = new AppleComputerBuilder();
		Computer computer2 = controller.construct(builder2);
		System.out.println(computer2.toString());
		
	}
}
