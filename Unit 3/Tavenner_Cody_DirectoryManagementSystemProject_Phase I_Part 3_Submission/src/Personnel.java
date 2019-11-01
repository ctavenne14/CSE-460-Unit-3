import java.util.*;
public class Personnel {

	private ArrayList<Person> personList;

	public Personnel() {
	  setPersonList(new ArrayList<Person>());
	}

	public void addPersonnel(Person p)
	{
		getPersonList().add(p);
	}
	public int getSize()
	{
		int size;
		size = getPersonList().size();
		return size;
	}
	public boolean found(String firstN, String lastN)
	{
		boolean found = false;
		for(int i =0; i <getPersonList().size(); i++)
			  {
				if(getPersonList().get(i).getFirst().equals(firstN) && getPersonList().get(i).getLast().equals(lastN))
				{
					found = true;
			    }
			  }
		return found;
	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}

}