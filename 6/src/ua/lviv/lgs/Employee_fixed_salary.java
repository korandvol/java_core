package ua.lviv.lgs;

public class Employee_fixed_salary implements Salary {

	private int rewardforMonth;
	private String name;

	public Employee_fixed_salary(int rewardforMonth, String name) {
		super();
		this.rewardforMonth = rewardforMonth;
		this.name = name;
	}

	@Override
	public void calcSalary() {
		System.out.println(rewardforMonth + " грн" + " - у" + "" + name);

	}

}
