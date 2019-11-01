
public class PersonnelFactory {
	public static Person createPersonnel(String last, String first, String middle, int id, double sal, int type )
	{


	     switch(type)
	     {
	        case 1:
	        return  new Employee(last, first, middle, id, sal);
	        //break;

	        case 2:
	        return new Executive(last, first, middle, id, sal);
	        //break;
	        
	        case 3:
		        return new Security(last, first, middle, id, sal);
		        //break;
		        
	        case 4:
		        return new Volunteer(last, first, middle, id, sal);
		        //break;
		        
	        /*case 5:
		        return new Person(last, first, middle);
		        //break;
*/
	        default:
	        return null;




	     }

	}
}
