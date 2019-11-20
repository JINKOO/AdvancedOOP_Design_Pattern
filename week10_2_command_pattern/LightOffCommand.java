package week10_2_command_pattern;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}
}
