
public class Executive extends Person {
	private int empID;
	private double baseSalary;


	public Executive(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;

	}
}
