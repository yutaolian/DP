package dp.builder;

public class DellComputerBuilder extends ComputerBuilder {

	@Override
	public void buildDisplay() {
		// TODO Auto-generated method stub
		computer.setDisplay("dell 显示器");
		System.out.println("this is dell display");

	}

	@Override
	public void buildMouse() {
		// TODO Auto-generated method stub
		
		computer.setMouse("dell 鼠标");
		System.out.println("this is dell mouse");

	}

	@Override
	public void buildMemory() {
		// TODO Auto-generated method stub
		computer.setMemory("dell 金士顿内存");
		System.out.println("this is dell memory");
	}
	
	@Override
	public boolean isBox() {
		// TODO Auto-generated method stub
		return true;
	}

}
