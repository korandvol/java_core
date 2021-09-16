package ua.lviv.lgs;

public class Employee_salary_per_hour implements Salary {

	private String name;
	private int hours;
	private int rateperhour;

	public Employee_salary_per_hour(String name, int hours, int rateperhour) {
		super();
		this.name = name;
		this.hours = hours;
		this.rateperhour = rateperhour;
	}

	@Override
	public void calcSalary() {
		System.out.println(name + " отримує - " + hours * rateperhour + " грн");

	}

}
