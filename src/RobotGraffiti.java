import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot iCu = new Robot("mini");
		iCu.penDown();
		iCu.setSpeed(50);
		iCu.turn(180);
		iCu.move(200);
		iCu.turn(270);
		iCu.move(150);
		iCu.penUp();
		iCu.move(50);
		iCu.penDown();
		iCu.move(75);
		iCu.turn(270);
		iCu.move(95);
		iCu.turn(270);
		iCu.move(75);
		iCu.turn(270);
		iCu.move(95);
		iCu.penUp();
		iCu.turn(270);
		iCu.move(150);
		
	}	
		
}
