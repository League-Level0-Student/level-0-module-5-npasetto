package nested_loops;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
        Robot turtle = new Robot();

       //  2. Set your robot’s position to x=150 and y=200
        turtle.moveTo(150, 200);
        // 3. Put the robot's pen down
        turtle.penDown();
        // 4. Set the robot’s speed to 10
        turtle.setSpeed(0);
        // 5. Do everything below here 360 times (use i as the counter)
        for (int i = 0; i < 360; i++) {
			turtle.move(3);
			turtle.turn(1);
			if (i%20==0) {
				for (int j = 0; j < 360; j++) {
					turtle.move(1);
					turtle.turn(1);
				}
			}
		}
	        // 6. Move the robot 3 pixels

       //  7. Turn the robot 1 degree

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)..

		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

				// 10. Move the robot 1 pixel

				// 11. Turn the robot 1 degree
}
}
