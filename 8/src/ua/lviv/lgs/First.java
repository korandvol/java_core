package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class First {

	public static void main(String[] args) throws Exception {
		Integer[] ArraysofInteger = { (RandomValue(1, 20)), (RandomValue(1, 20)), (RandomValue(1, 20)),
				(RandomValue(1, 20)), (RandomValue(1, 20)), (RandomValue(1, 20)), (RandomValue(1, 20)),
				(RandomValue(1, 20)), (RandomValue(1, 20)), (RandomValue(1, 20)), (RandomValue(1, 20)) };
		System.out.println(Arrays.toString(ArraysofInteger));

		Arrays.sort(ArraysofInteger);
		System.out.println(Arrays.toString(ArraysofInteger));

		Arrays.sort(ArraysofInteger, Collections.reverseOrder());
		System.out.println(Arrays.toString(ArraysofInteger));
	}

	public static int RandomValue(int min, int max) throws Exception {
		if (min >= max) {
			throw new Exception("Min shouldn't be bigger then Max!");
		}
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}
}
