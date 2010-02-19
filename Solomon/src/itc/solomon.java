package itc;
import robocode.*;
//import java.awt.Color;

/**
 * Solomon - a robot by (your name here)
 */
public class solomon extends Robot
{
	/**
	 * run: Solomon's default behavior
	 */
	public void run() {
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:
		//setColors(Color.red,Color.blue,Color.green);
		while(true) {
			
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - e.getBearing());
	}
	
}
