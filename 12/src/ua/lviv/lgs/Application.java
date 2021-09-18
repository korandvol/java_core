package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Map <Person, ArrayList<Animal>> map = new HashMap<>();
		
		ZooClub ZooClub = new ZooClub();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Натисніть 1, додати учасника клубу.");
			System.out.println("Натисніть 2, додати тваринку до учасника клубу.");
			System.out.println("Натисніть 3, видалити тваринку з учасника клубу.");
			System.out.println("Натисніть 4, видалити учасника з клубу.");
			System.out.println("Натисніть 5, видалити конкретну тваринку зі всіх власників.");
			System.out.println("Натисніть 6, вивести на екран зооклуб.");
			System.out.println("Натисніть 7, щоб вийти з програми.");
			
			switch (sc.next()) {
			
			case "1":
				ZooClub.addParticipant();
				break;
				
			case "2":
				ZooClub.addAnimal();
				break;
			case "3":
				ZooClub.removeAnimal();
				break;
			case "4":
				ZooClub.removeParticipant();
				break;
			case "5":
				ZooClub.removementionedAnimal();
				break;
			case "6":
				ZooClub.displayZooClub();
				break;
			case "7":
				System.exit(0);
			
			}
		}
		

		
	}

}
