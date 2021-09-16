package ua.lviv.lgs;

import java.time.MonthDay;
import java.util.Scanner;

import lesson8.part1.Months;
import ua.lviv.lgs.Month.monthofYear;
import ua.lviv.lgs.enumer.Month;
import ua.lviv.lgs.enumer.Seasons;
import ua.lviv.lgs.enumer.String;

public class Application {

	static void menu() {

		System.out.println("For a month check press - 1");
		System.out.println("For a month with the same season press - 2");
		System.out.println("For a month with the same amount of days press - 3");
		System.out.println("For a month with less days press - 4");
		System.out.println("For a month with more days press - 5");
		System.out.println("For the next season press - 6");
		System.out.println("For the previous season press - 7");
		System.out.println("For month with paired days press - 8");
		System.out.println("For month with unpaired days press - 9");
		System.out.println("To check if entered month consist of paired days press - 10");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Month[] mas = Month.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1":

				System.out.println("Enter a random  month of the year:");
				sc = new Scanner(System.in);
				String Month = sc.next().toUpperCase();

				boolean flag1 = false;

				for (Month m : mas) {
					if (m.name().equals(Month)) {
						System.out.println("Month exists!");
						flag1 = true;
					}

				}
				if (!flag1) {
					System.out.println("Month doesn't exists!");
				}

				break;

			case "2": {
				System.out.println("Enter a season of the year:");
				sc = new Scanner(System.in);
				String Seasons = sc.next().toUpperCase();

				boolean flag = false;

				for (Month m : mas) {
					if (m.getSeasons().name().equals(Seasons)) {
						flag = true;
					}

				}

				if (flag) {
					for (Month mon : mas) {
						if (mon.getSeasons().toString().equalsIgnoreCase(Seasons))
							System.out.println(mon);
					}
				}

				if (!flag) {
					System.out.println("Season doesn't exist");
				}

				break;
			}

			case "3": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				Month Month1;
				Month1 = ua.lviv.lgs.Month.valueOf(month);

				for (Month m : Month1.values()) {
					if (m.getDays() == Month1.getDays()) {
						System.out.println(m);
					}
				}
				break;
			}

			case "4": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				Month Month1;
				Month1 = ua.lviv.lgs.Month.valueOf(month);

				for (Month m : Month1.values()) {
					if (m.getDays() < Month1.getDays()) {
						System.out.println(m);
					}
				}
				break;
			}

			case "5": {

				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				Month Month1;
				Month1 = ua.lviv.lgs.Month.valueOf(month);

				for (Month m : Month1.values()) {
					if (m.getDays() > Month1.getDays()) {
						System.out.println(m);
					}
				}
				break;
			}

			case "6": {

				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				Seasons season2 = Seasons.valueOf(season);

				int ordinal = season2.ordinal();
				int nextIndex = ordinal + 1;

				Seasons[] arr2 = Seasons.values();
				nextIndex %= arr2.length;

				System.out.println(arr2[nextIndex]);
			}
				break;

			case "7": {

				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				Seasons season2 = Seasons.valueOf(season);

				int ordinal = season2.ordinal();
				int prev = ordinal - 1;

				Seasons[] arr2 = Seasons.values();
				prev %= arr2.length;
				if (ordinal == 0) {
					int prev1 = arr2.length - 1;
					System.out.println(arr2[prev1]);
				} else {
					System.out.println(arr2[prev]);
				}
			}
				break;

			
			case "10": {
				System.out.println("Enter month ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				Month Month2;
				Month2 = ua.lviv.lgs.Month.valueOf(month);
				if (Month2.getDays() % 2 == 0) {
					System.out.println("There is even days count in the inputted month.");
				} else {
					System.out.println("There is odd days count in the inputted month");
				}
				break;
			}

			}

		}
	}
	
}
