package dp.builder;

public abstract class ComputerBuilder {
	
	protected Computer computer = new Computer();
	
	public abstract void buildDisplay();
	public abstract void buildMouse();
	public abstract void buildMemory();
	
	//这个叫钩子方法
	public boolean isBox(){
		return false;
	}

	public Computer createComputer(){
		return computer;
	}
}
