package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {

	
	String surname;
	String name;
	int age;
	static boolean  bribe;
	int howMuchbribe;

	public Deputy(int height, int weight, String surname, String name, int age, boolean bribe) {
		super(height, weight);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribe = bribe;
	}

	

	public void giveBribe() {
		if (this.bribe == false) {
			System.out.println("Цей депутат не бере хабарів!");
			
		}
		else if (this.bribe = true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введіть сумму: ");
			int howMuchBribe = sc.nextInt();
			
			if(howMuchbribe > 5000) {
				System.out.println("Поліція ув\"язнить депутата!");
				}
			else  {
					System.out.println(howMuchbribe);
				}
		}
	}


	public boolean isBriber() {
		if (this.bribe == true) {
			return bribe;
		} else {
			return false;
		}
	}

	public String getSurname() {
		return surname;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public static boolean isBribe() {
		return bribe;
	}



	public int getHowMuchbribe() {
		return howMuchbribe;
	}



	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", howMuchbribe=" + howMuchbribe
				+ "]";
	}
}


	