package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Steering_wheelmaterial[] steering_wheelmaterial = Steering_wheelmaterial.values();

		while (true) {
			menu();

			switch (scanner.nextInt()) {
			case 1: {

				Car[][] arrayCars = new Car[getRandomValueFromRange(1, 10)][getRandomValueFromRange(1, 10)];
				List<Car[]> lst = Arrays.asList(arrayCars);
				for (int i = 0; i < arrayCars.length; i++) {
					for (int j = 0; j < arrayCars[i].length; j++) {

						arrayCars[i][j] = new Car(getRandomValueFromRange(80, 400), getRandomValueFromRange(2004, 2019),
								new Steering_wheel(getRandomValueFromRange(30, 50),
										steering_wheelmaterial[getRandomValueFromRange(0,
												steering_wheelmaterial.length - 1)].toString()),
								new Engine(getRandomValueFromRange(4, 16)));
					}
				}
				System.out.println(Arrays.deepToString(arrayCars));

				break;
			}
			case 2: {
				Car car = new Car(getRandomValueFromRange(80, 400), getRandomValueFromRange(2004, 2019),
						new Steering_wheel(getRandomValueFromRange(30, 50),
								steering_wheelmaterial[getRandomValueFromRange(0, steering_wheelmaterial.length - 1)]
										.toString()),
						new Engine(getRandomValueFromRange(4, 16)));

				Car[] arrayCars2 = new Car[getRandomValueFromRange(1, 10)];
				List<?> lst = Arrays.asList(arrayCars2);
				

				System.out.println(car);
				break;
			}

			}
			break;
		}
	}

	private static Steering_wheel[] Steering_wheelmaterial() {

		return null;
	}

	private static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}
		Random random = new Random();

		return random.nextInt(max - min + 1) + min;
	}

	static void menu() {
		System.out.println("Enter 1, to display data of elements of this array");
		System.out.println("Enter 2, to set values of random object of Auto for all elements of this array");
	}

}
