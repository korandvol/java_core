package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;



public class Cinema {

	private TreeMap<Days, Schedule> schedules;

	ArrayList<Movie> moviesLibrary = new ArrayList<>();

	private Time open;
	private Time close;

	public Cinema(TreeMap<Days, Schedule> schedules, ArrayList<Movie> moviesLibrary, Time open, Time close) {
		super();
		this.schedules = new TreeMap<Days, Schedule>();
		for (Days days : Days.values()) {
			this.schedules.put(days, new Schedule(null));
		}
		this.open = open;
		this.close = close;
	}

	public TreeMap<Days, Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(TreeMap<Days, Schedule> schedules) {
		this.schedules = schedules;
	}

	public ArrayList<Movie> getMoviesLibrary() {
		return moviesLibrary;
	}

	public void setMoviesLibrary(ArrayList<Movie> moviesLibrary) {
		this.moviesLibrary = moviesLibrary;
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {
		this.open = open;
	}

	public Time getClose() {
		return close;
	}

	public void setClose(Time close) {
		this.close = close;
	}

	Scanner sc = new Scanner(System.in);

	public void addMovie(Movie movie, Time time) {
		System.out.println("������ ����� ������: ");
		String name = sc.nextLine();

		if (name.equals(name)) {
			System.out.println("Գ���: " + name.toString() + " ������ ������.");
		} else {
			System.out.println("��������� ����� !");
		}
	}
	
public void addSeance(Seance seance, String day) {
		System.out.println("������ �����: ");
		String seance1 = sc.nextLine();
		System.out.println();
		System.out.println("������ ����: ");
		String day1 = sc.nextLine();
		
		if (seance1.equals(seance1)) 
		if(day1.equals(day1)){
			System.out.println("����� �����: " + seance1.toString()+" ����: "+day1.toString());
		} 
		while (sc.hasNext()) {
			String string = (String)sc.next();
			
		}
		}
	

public void removeMovie(Movie movie){
    
	System.out.println("������ ����� ������: ");
	String movieString = sc.nextLine();

	Iterator<Movie> iterator = Movie.movieSet.iterator();

	while (iterator.hasNext()) {
		if (iterator.next().equals(movieString))
			iterator.remove();
	}

		System.out.println("Գ��� " + movieString + " ��������");
		System.out.println();
	
}
	
	


void removeSeance(Seance seance, String day) {

	System.out.println("������ �����");
	String seance1 = sc.nextLine();


	Iterator<Seance> iterator = Seance.iterator;

	while (iterator.hasNext()) {
		if (iterator.next().equals(seance1))
			iterator.remove();
	}
	
		System.out.println("����� " + seance + " ��������!");
		System.out.println();
		
	}
	
	
}

