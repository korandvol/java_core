package ua.lviv.lgs;

import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<RandomClass> rc = new HashSet<>();

		rc.add(new RandomClass("������", 1));

		rc.add(new RandomClass("������", 2));

		rc.add(new RandomClass("�����", 3));

		rc.add(new RandomClass("���������", 4));

		rc.add(new RandomClass("�'����", 5));

		rc.add(new RandomClass("������", 6));

		rc.add(new RandomClass("������", 7));

		rc.add(new RandomClass("�������", 8));

		rc.add(new RandomClass("��������", 9));

		for (RandomClass RandomClass : rc) {
			System.out.println(rc);
		}
		
		System.out.println();
		
		TreeSet<RandomClass> ts = new TreeSet<>(new ComparatorClass());
		
		ts.add(new RandomClass("������", 1));

		ts.add(new RandomClass("������", 2));

		ts.add(new RandomClass("�����", 3));

		ts.add(new RandomClass("���������", 4));

		ts.add(new RandomClass("�'����", 5));

		ts.add(new RandomClass("������", 6));

		ts.add(new RandomClass("������", 7));

		ts.add(new RandomClass("�������", 8));

		ts.add(new RandomClass("��������", 9));

		for (RandomClass RandomClass : ts) {
			System.out.println(ts);
		}
	}

	
	
	
}
