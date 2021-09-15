package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot();
		CoffeRobot cr = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCoocker rc = new RobotCoocker();
		r.Work();
		cr.Work();
		rd.Work();
		rc.Work();
		Robot[] array = { r, cr, rd, rc };
		for (int i = 0; i < array.length; i++) {
			array[i].Work();
		}
	}

}
