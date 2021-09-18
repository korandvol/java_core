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
			
			System.out.println("�������� 1, ������ �������� �����.");
			System.out.println("�������� 2, ������ �������� �� �������� �����.");
			System.out.println("�������� 3, �������� �������� � �������� �����.");
			System.out.println("�������� 4, �������� �������� � �����.");
			System.out.println("�������� 5, �������� ��������� �������� � ��� ��������.");
			System.out.println("�������� 6, ������� �� ����� �������.");
			System.out.println("�������� 7, ��� ����� � ��������.");
			
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
