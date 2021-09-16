package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Employee_fixed_salary Employee_fixed_salary = new Employee_fixed_salary(1000, " Іван");
		Employee_fixed_salary.calcSalary();

		System.out.println(Employee_fixed_salary);

		Employee_salary_per_hour Employee_salary_per_hour = new Employee_salary_per_hour("Петро", 70, 50);
		Employee_salary_per_hour.calcSalary();

		System.out.println(Employee_salary_per_hour);
	}

}
