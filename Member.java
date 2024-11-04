package books;

import java.util.Arrays;
import java.util.HashMap;


public class Member
{
	//take some example names 
	String member[]={"Prabhas","Powen","Mahesh","Arjun","Srinu","Ntr","Srikanth","atlee","Ramu","Sai","Naresh","Shiva"};
	//take some random numbers
	int ids[]={101,102,103,104,105,106,107,108,109,110,111,112};	
	public void members(String name) 
	{
		if(name.equalsIgnoreCase("Admin101"))//Admin101 is just a string you can chage it
		{
			//print books available in array
			System.out.println("Books:"+Arrays.toString(member));
		}
		else{
			System.out.println("***You can't See 'Only for Administrator!!!'");
		}
	}
	
}
