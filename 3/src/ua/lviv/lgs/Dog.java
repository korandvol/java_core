package ua.lviv.lgs;

public class Dog extends Pet {
	private String breed;
	private int howLoud;

	public Dog(double weight, double height, String breed, int howLoud) {
		super(weight, height);
		this.breed = breed;
		this.howLoud = howLoud;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHowLoud() {
		return howLoud;
	}

	public void setHowLoud(int howLoud) {
		this.howLoud = howLoud;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", howLoud=" + howLoud + "]";
	}

	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");

	}

}
