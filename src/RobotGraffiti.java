import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot L = new Robot();
	L.penDown();
	L.setSpeed(20);
	L.move(100);
	L.move(-150);
	L.turn(90);
	L.move(100);
	
}
}
