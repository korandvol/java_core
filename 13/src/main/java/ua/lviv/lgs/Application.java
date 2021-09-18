package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import ua.lviv.lgs.Time.TimeException;

public class Application {

	public static void main(String[] args) throws TimeException {
		Cinema cinema = new Cinema(null, null, null, null);
		Schedule schedule;
		Time time = new Time(10, 10);
		Movie movie = new Movie("������� �����", new Time(20, 10));

		Seance seance = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("³���� � ��������!");
			System.out.println();
			System.out.println("��������� 1 ��� �������� ��������");
			System.out.println("��������� 2 - �������� ����� �����");
			System.out.println("��������� 3 - ������ �����");
			System.out.println("��������� 4 ��� ��������� ������");
			System.out.println("��������� 5 ��� ��������� ������");
			System.out.println("��������� 0 ��� ������");
			System.out.println();

			int i = sc.nextInt();
			switch (i) {
			case (1):
				System.out.println("�������: ");

				for (Days days : Days.values()) {
					System.out.println();
					System.out.println(days);
					schedule = cinema.getSchedules().get(days);
					cinema.getSchedules();
				}
				// cinema.getSchedules();
				break;

			case (2): {
				System.out.println("�� �������� ����� �����: ");
				for (Days days : Days.values()) {
					// cinema.addMovie(movie, time);
					cinema.addSeance(seance, null);
				}
				

				break;
			}
			case 3: {
				System.out.println("�� �������� ����� ����� �� ������ ������: ");
				System.out.println();
				cinema.addMovie(movie, time);
				break;
			}

			case 4: {
				System.out.println("�� �������� �����: ");
				System.out.println();
				for (Days days : Days.values()) {

					cinema.removeSeance(seance, null);
					break;
				}

			}

			case 5: {
				System.out.println("�� �������� ����� � ������:  ");
				System.out.println();
				cinema.removeMovie(movie);
				break;
			}
			case 0: {
				System.out.println("������, �� ����������� ����� ����������!");
				System.exit(0);
				break;
			}
			default:
				System.err.println("������ ����� � 0 - 5");
				break;
			}

		}
	}

}
