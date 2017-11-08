/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	Robot r2d2 = new Robot();


        r2d2.penDown();


        r2d2.setSpeed(100);


        for (int i = 0; i < 4; i++) {
			
		


        r2d2.move(200);


      r2d2.turn(90);

        }
    }
}
