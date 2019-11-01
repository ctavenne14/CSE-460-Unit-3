public class Person {
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}


	public void printName1()
	{
	      System.out.println(getFirst() + "  " + middle + "  " + last);
	}
	public void printName2()
	{
		System.out.println(last + " ," + middle + " " + getFirst());
	}
	public void printName3()
	{
		System.out.println(last + " ," + getFirst() + " " + middle);
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


}
