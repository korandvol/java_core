package ua.lviv.lgs;

import java.util.Iterator;

public class Animal {

	String kinfofanimal;
	String animalname;

	public Animal(String kinfofanimal, String animalname) {
		super();
		this.kinfofanimal = kinfofanimal;
		this.animalname = animalname;
	}

	public String getKinfofanimal() {
		return kinfofanimal;
	}

	public void setKinfofanimal(String kinfofanimal) {
		this.kinfofanimal = kinfofanimal;
	}

	public String getAnimalname() {
		return animalname;
	}

	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}

	@Override
	public String toString() {
		return "Animal [kinfofanimal=" + kinfofanimal + ", animalname=" + animalname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animalname == null) ? 0 : animalname.hashCode());
		result = prime * result + ((kinfofanimal == null) ? 0 : kinfofanimal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (animalname == null) {
			if (other.animalname != null)
				return false;
		} else if (!animalname.equals(other.animalname))
			return false;
		if (kinfofanimal == null) {
			if (other.kinfofanimal != null)
				return false;
		} else if (!kinfofanimal.equals(other.kinfofanimal))
			return false;
		return true;
	}

}
