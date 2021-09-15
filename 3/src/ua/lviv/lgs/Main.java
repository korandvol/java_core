package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat(20, 30, "Somali", 2);
		System.out.println(c);
		c.voice();
		System.out.println();
		
		
		
		
		Cow cw = new Cow (100, 100, "Hereford cattle", 5);
		System.out.println(cw);
		cw.voice();
		System.out.println();
		
		Dog d = new Dog(15, 50, "German Shepherd", 4);
		System.out.println(d);
		d.voice();
	}

}
