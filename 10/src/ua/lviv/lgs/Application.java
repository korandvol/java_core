package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

public static void main(String[] args) {
		
	List<Deputy>lst = new ArrayList<Deputy>();
		lst.add(new Deputy(150, 180, "������", "�����", 50, true));
		lst.add(new Deputy(160, 190, "�������", "�����", 40, true));
		lst.add(new Deputy(100, 170, "���", "������", 42, true));
		
		List<Fractions> fractionsCouncil = new ArrayList<Fractions>();
		fractionsCouncil.add(new Fractions("���"));
		fractionsCouncil.add(new Fractions("��˲���Ͳ���"));
		fractionsCouncil.add(new Fractions("�����"));
		
		
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
		System.out.println("�������� 1, ������ �������.");
		System.out.println("�������� 2, �������� �������.");
		System.out.println("�������� 3, �������� ������� �������� ����.");
		System.out.println("�������� 4, ��� �������� ��������� �������.");
		System.out.println("�������� 5, ������� ��������� �������.");
		System.out.println("�������� 6, ��� ������ �������� � �������.");
		System.out.println("�������� 7, �������� �������� � �������.");
		System.out.println("�������� 8, ������� ������ ���������.");
		System.out.println("�������� 9, ��� ������� ���������� ���������.");
	}

}
