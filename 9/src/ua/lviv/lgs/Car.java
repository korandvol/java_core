package ua.lviv.lgs;

public class Car {

	int power;
	int age;
	private Steering_wheel steering_wheel;
	private Engine engine;
	public Car(int power, int age, Steering_wheel steering_wheel, Engine engine) {
		super();
		this.power = power;
		this.age = age;
		this.steering_wheel = steering_wheel;
		this.engine = engine;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Steering_wheel getSteering_wheel() {
		return steering_wheel;
	}
	public void setSteering_wheel(Steering_wheel steering_wheel) {
		this.steering_wheel = steering_wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [power=" + power + ", age=" + age + ", steering_wheel=" + steering_wheel + ", engine=" + engine
				+ "]";
	}
	
	
	
}
