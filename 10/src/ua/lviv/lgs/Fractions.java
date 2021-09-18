package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fractions {
	
	String fractionName;
	
	

	public Fractions(String fractionName) {
		super();
		this.fractionName = fractionName;
	}

	List<Deputy>lst = new ArrayList<Deputy>();
	
	
	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть пр≥звище депутата: ");
		String surname = sc.next();
		System.out.println("¬вед≥ть ≥м'€ депутата: ");
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к депутата: ");
		Integer age = sc.nextInt();
		System.out.println("¬вед≥ть вагу депутата: ");
		Integer weight = sc.nextInt();
		System.out.println("¬вед≥ть зр≥ст депутата: ");
		Integer height = sc.nextInt();
		System.out.println("„и бере депута хабар≥: ");
		Boolean bribe = sc.nextBoolean();
		System.out.println("—умма: ");
		Integer howMuchbribe = sc.nextInt();
		lst.add(new Deputy(weight, height, surname, name, age, bribe));
	}
	
	public void removeDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть пр≥звище депутата: ");
		String surname = sc.next();
		System.out.println("¬вед≥ть пр≥звище депутата: ");
		String name = sc.next();
		
		Iterator<Deputy> iterator = lst.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();
			
			if(next.getHowMuchbribe() == 0) {
				System.out.println(next);
				iterator.remove();
				
			}
		}
	}
	
	public void displayAllbribeDeputy() {
		Iterator<Deputy> iterator = lst.iterator();
		while (iterator.hasNext()) {
			Deputy deputy = iterator.next();
			if (deputy.isBriber()) {
			}
			System.out.println("’абарники: " + deputy.getSurname().toString());
		}
	}
		
	
	
	public void displaybiggestbriber() {
		
		Iterator<Deputy> iterator = lst.iterator();
		
		int maxBribe = 0;
		
		while (iterator.hasNext()) {
			Deputy deputy = iterator.next();
			if (deputy.getHowMuchbribe() > maxBribe) {
				maxBribe = deputy.getHowMuchbribe();
			}
			System.out.println("Ќайб≥льший хабарник: - " + deputy.getSurname().toString());
		}
	}
		
	
	
	public void displayAllDeputy() {
		
		for (Deputy deputy : lst) {
			System.out.println("—писок ус≥х депутат≥в: " + deputy.toString());
			
		}
	}
	
	public void removeAllDeputy() {
		
		for (Deputy deputy : lst) {
			lst.clear();
		}
	}

	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	@Override
	public String toString() {
		return "Fractions [fractionName=" + fractionName + "]";
	}

	
	
	
	
}

