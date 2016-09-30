package dp.builder;

public class Computer {

	private String display;
	private String mouse;
	private String memory;
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Computer [display=" + display + ", mouse=" + mouse + ", memory=" + memory + "]";
	}
	
}
