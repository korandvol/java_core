package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	
	HashMap <Person, ArrayList<Animal>> map = new HashMap<Person, ArrayList<Animal>>();

	public ZooClub() {
		super();
		this.map = map;
	}

	
	Scanner sc = new Scanner(System.in);

	public void addParticipant() {

		
		System.out.println("¬вед≥ть ≥м'€: ");
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к: ");
		Integer age = sc.nextInt();

		Person person = new Person(name, age);
		map.put(person, new ArrayList<>());
		
		
		System.out.println(person);

		

	}

	public void addAnimal() {

		System.out.println("¬вед≥ть ваше ≥м'€: ");
		String name = sc.next();		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			
			if (next.getKey().getName().equalsIgnoreCase(name)){
				
				System.out.println("¬вед≥ть вид твaринки: ");
				String kinfofanimal = sc.next();
				System.out.println("¬вед≥ть ≥м'€ твaринки: ");
				String animalname = sc.next();
				
				ArrayList<Animal> value = next.getValue();
				value.add(new Animal(kinfofanimal, animalname));
				next.setValue(value);
				
			}
		}
	}

	public void removeAnimal() {

		System.out.println("¬вед≥ть ваше ≥м'€: ");
		String name = sc.next();
		
		
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)){
				
				System.out.println("¬вед≥ть вид твaринки: ");
				String kinfofanimal = sc.next();
				System.out.println("¬вед≥ть ≥м'€ твaринки: ");
				String animalname = sc.next();
				
				Animal animal = new Animal(kinfofanimal, animalname);
				ArrayList<Animal> value = next.getValue();
				
				Iterator<Animal> iterator2 = value.iterator();
				while(iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getKinfofanimal().equalsIgnoreCase(name) && next2.getAnimalname().equalsIgnoreCase(name)) {
						iterator2.remove();
						System.out.println(iterator2.toString());
					}
				}
				
				
			}
		}
	}

	public void removeParticipant() {

		System.out.println("¬вед≥ть ≥м'€: ");
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к: ");
		Integer age = sc.nextInt();
		
		Person person = new Person(name, age);
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if(next.getKey().getName().equals(name)) {
				iterator.remove();
			}
		}
		
	}

	public void removementionedAnimal() {

		System.out.println("¬вед≥ть вид твaринки: ");
		String kinfofanimal = sc.next();
		
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {

			Entry<Person, ArrayList<Animal>> entry = iterator.next();

			ArrayList<Animal> animals = entry.getValue();
		Animal animal = new Animal(kinfofanimal, null);
		
		
		Iterator<Animal> iterator1 = animals.iterator();
		while(iterator1.hasNext()) {
			Animal next = iterator1.next();
			if (next.getKinfofanimal().equalsIgnoreCase(kinfofanimal)) {
				iterator1.remove();
			}
		}
		}
		
		
		
		
	}

	public void displayZooClub() {

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			next.getKey().getName();

			ArrayList<Animal> animals = next.getValue();

			for (Animal animal : animals) {
				System.out.println("«оопарк кладаЇтьс€ з: " + next.getKey().getName()+", " + animal.getKinfofanimal() +", "+ animal.getAnimalname());
			}
		}
		}
			
	

	

	public Map<Person, ArrayList<Animal>> getMap() {
		return map;
	}

	public void setMap(HashMap<Person, ArrayList<Animal>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
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
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

}
