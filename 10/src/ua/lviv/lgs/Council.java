package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Council {

	private static Council instance;

	private Council() {
	}

	public static Council getInstance() {
		if (instance == null) {
			instance = new Council();
		}
		return instance;
	}

	List<Fractions> fractionsCouncil = new ArrayList<Fractions>();
	
	public void addFraction() {
		
		System.out.println("Введіть назву фракції: ");
		Scanner sc = new Scanner(System.in);
		String fractionName = sc.next();

		Fractions fractions = new Fractions(fractionName);

		fractionsCouncil.add(fractions);
		System.out.println("Додати фракцію " + fractions.toString());
		
		
	}
	
	public void removeFraction() {
		System.out.println("Введіть назву фракціх: ");
		Scanner sc = new Scanner(System.in);
		String fractionName = sc.next();

		Iterator<Fractions> iterator = fractionsCouncil.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFractionName().equalsIgnoreCase(fractionName)) {
				iterator.remove();
				System.out.println("Фракція: " + fractionName.toString() + " видалена.");
			}
		}
	}
	
	public void displayAllFractions() {
		System.out.println("Фракції : ");

		Iterator<Fractions> iterator2 = fractionsCouncil.iterator();

		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().getFractionName());
		}
	}
	
	public void displayFraction() {
		
		System.out.println("Введіть назву фракції: ");
		Scanner sc = new Scanner(System.in);
		String fractionsName = sc.next();
		Iterator<Fractions> iterator = fractionsCouncil.iterator();
		while (iterator.hasNext()) {
			Fractions fractions = iterator.next();
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				System.out.println(fractionsName.toString());
				fractions.addDeputy();
			}
		}
	}

	public void addDeputytoFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fractionsName = sc.next();

		for (Fractions fractions : fractionsCouncil) {
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				fractions.addDeputy();
			}
		}
		
	}
	
	public void removeDeputytoFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fractionsName = sc.next();

		for (Fractions fractions : fractionsCouncil) {
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				fractions.removeDeputy();
			}
		}
		
	}
	
	public void displayAllBribersinFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fractionsName = sc.next();
		for (Fractions fractions : fractionsCouncil) {
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				System.out.println("Хабарники: ");
				fractions.displayAllbribeDeputy();
			}
		}
	}
	
	public void displaytheBiggestBriberinFraction() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fractionsName = sc.next();
		for (Fractions fractions : fractionsCouncil) {
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				fractions.displaybiggestbriber();
			}
		}
	}
	
	public void displayAllDeputyofFractions() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fractionsName = sc.next();
		for (Fractions fractions : fractionsCouncil) {
			if (fractions.getFractionName().equalsIgnoreCase(fractionsName)) {
				fractions.displayAllDeputy();

			}
		}
	}
	
	public void clearFraction() {
		System.out.println("Введіть фракцію: ");
		Scanner sc = new Scanner(System.in);
		String fractionName = sc.next();
		Iterator<Fractions> iterator3 = fractionsCouncil.iterator();

		while (iterator3.hasNext()) {
			Fractions fractions = iterator3.next();
			if (fractions.getFractionName().equalsIgnoreCase(fractionName)) {
				fractions.removeAllDeputy();;
			}
		}
}
}
