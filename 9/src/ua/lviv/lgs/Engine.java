package ua.lviv.lgs;

public class Engine {

	int cylinders;

	public Engine(int cylinders) {
		super();
		this.cylinders = cylinders;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	@Override
	public String toString() {
		return "Engine [cylinders=" + cylinders + "]";
	}
	
	
}
