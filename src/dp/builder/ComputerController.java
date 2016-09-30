package dp.builder;

public class ComputerController {
	
	public Computer construct(ComputerBuilder builder){
		builder.buildDisplay();
		builder.buildMemory();
		
		if (builder.isBox()) {
			builder.buildMouse();
		}
		return builder.createComputer();
	}

}
