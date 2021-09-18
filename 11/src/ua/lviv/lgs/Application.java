package ua.lviv.lgs;

import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<RandomClass> rc = new HashSet<>();

		rc.add(new RandomClass("Перший", 1));

		rc.add(new RandomClass("Другий", 2));

		rc.add(new RandomClass("Третій", 3));

		rc.add(new RandomClass("Четвертий", 4));

		rc.add(new RandomClass("П'ятий", 5));

		rc.add(new RandomClass("Шостий", 6));

		rc.add(new RandomClass("Сьомий", 7));

		rc.add(new RandomClass("Восьмий", 8));

		rc.add(new RandomClass("Девятийй", 9));

		for (RandomClass RandomClass : rc) {
			System.out.println(rc);
		}
		
		System.out.println();
		
		TreeSet<RandomClass> ts = new TreeSet<>(new ComparatorClass());
		
		ts.add(new RandomClass("Перший", 1));

		ts.add(new RandomClass("Другий", 2));

		ts.add(new RandomClass("Третій", 3));

		ts.add(new RandomClass("Четвертий", 4));

		ts.add(new RandomClass("П'ятий", 5));

		ts.add(new RandomClass("Шостий", 6));

		ts.add(new RandomClass("Сьомий", 7));

		ts.add(new RandomClass("Восьмий", 8));

		ts.add(new RandomClass("Девятийй", 9));

		for (RandomClass RandomClass : ts) {
			System.out.println(ts);
		}
	}

	
	
	
}
