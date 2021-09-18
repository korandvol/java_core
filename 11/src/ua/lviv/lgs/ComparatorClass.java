package ua.lviv.lgs;


import java.util.Comparator;;
public class ComparatorClass implements Comparator<RandomClass>{

public int compare(RandomClass arg0, RandomClass arg1) {
			 if (arg0.getAge() > arg1.getAge()) {
				return 1;
			} else if (arg0.getAge() < arg1.getAge()) {
				return -1;
			}
			return 0;
		}
	}

