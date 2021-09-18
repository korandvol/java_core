package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

public static void main(String[] args) {
		
	List<Deputy>lst = new ArrayList<Deputy>();
		lst.add(new Deputy(150, 180, "Петров", "Андрій", 50, true));
		lst.add(new Deputy(160, 190, "Сидоров", "Петро", 40, true));
		lst.add(new Deputy(100, 170, "Мяч", "Василь", 42, true));
		
		List<Fractions> fractionsCouncil = new ArrayList<Fractions>();
		fractionsCouncil.add(new Fractions("БЮТ"));
		fractionsCouncil.add(new Fractions("СОЛІДАРНІСТЬ"));
		fractionsCouncil.add(new Fractions("СЛУГА"));
		
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {
				Council.getInstance().addFraction();
				break;
			}

			case 2: {
				Council.getInstance().removeFraction();
				break;
			}

			case 3: {
				Council.getInstance().displayAllFractions();
				break;
			}

			case 4: {
				Council.getInstance().clearFraction();
				break;
			}

			case 5: {
				Council.getInstance().displayFraction();
				break;
			}

			case 6: {
				Council.getInstance().addDeputytoFraction();
				break;
			}

			case 7: {
				Council.getInstance().removeDeputytoFraction();
				break;
			}

			case 8: {
				Council.getInstance().displayAllBribersinFraction();
				break;
			}

			case 9: {
				Council.getInstance().displaytheBiggestBriberinFraction();
				break;
			}

			}

		}

	}

	static void menu() {
		System.out.println();
		System.out.println("Натисніть 1, додати фракцію.");
		System.out.println("Натисніть 2, видалити фракцію.");
		System.out.println("Натисніть 3, показати фракції верховної ради.");
		System.out.println("Натисніть 4, щоб очистити конкретну фракцію.");
		System.out.println("Натисніть 5, вивести конкретну фракцію.");
		System.out.println("Натисніть 6, щоб додати депутата в фракцію.");
		System.out.println("Натисніть 7, видалити депутата з фракції.");
		System.out.println("Натисніть 8, вивести список хабарників.");
		System.out.println("Натисніть 9, щоб вивести найбільшого хабарника.");
	}

}
