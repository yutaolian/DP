package dp.builder;

public class AppleComputerBuilder extends ComputerBuilder {

	@Override
	public void buildDisplay() {
		// TODO Auto-generated method stub
		computer.setDisplay("apple 显示器");
		System.out.println("this is apple display");
	}

	@Override
	public void buildMouse() {
		// TODO Auto-generated method stub
		computer.setMouse("apple 鼠标");
		System.out.println("this is apple mouse");
	}

	@Override
	public void buildMemory() {
		// TODO Auto-generated method stub
		computer.setMemory("apple 内存");
		System.out.println("this is apple memory");

	}
	
	@Override
	public boolean isBox() {
		// TODO Auto-generated method stub
		return false;
	}

}
