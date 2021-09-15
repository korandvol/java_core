package ua.lviv.lgs;

public abstract class Pet {
	private double weight;
	private double height;

	public Pet(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	abstract void voice();

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Pet [weight=" + weight + ", height=" + height + "]";
	}

}
