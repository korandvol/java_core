package ua.lviv.lgs;

public class Cat extends Pet {
	private String breed;
	private int howLoud;

	public Cat(double weight, double height, String breed, int howLoud) {
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
		return "Cat [breed=" + breed + ", howLoud=" + howLoud + "]";
	}

	@Override
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");

	}

}
