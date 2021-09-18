package ua.lviv.lgs;

public class Steering_wheel {

	int diameter;
	String madeOf;

	Steering_wheel(int diameter, String madeOf) {
		this.diameter = diameter;
		this.madeOf = madeOf;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	@Override
	public String toString() {
		return "Steering_wheel [diameter=" + diameter + ", madeOf=" + madeOf + "]";
	}

}
