import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
	Robot callum = new Robot();
	callum.setSpeed(10);
	callum.turn(360);
	callum.penDown();
	callum.sparkle();
	callum.setPenColor(Color.BLUE);
	callum.move(200);
	callum.turn(90);
	callum.setPenColor(Color.GREEN);
	callum.move(200);
	callum.turn(90);
	callum.setPenColor(Color.MAGENTA);
	callum.move(200);
	callum.turn(90);
	callum.setPenColor(Color.ORANGE);
	callum.move(200);
	callum.turn(90);
	
	
	
		
	}
}
