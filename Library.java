package books;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.Scanner;

public class Library extends Member
{
	HashMap<Integer,String  > obj=new HashMap<>();
	String books[]={"Java","Sql","Python","HTML","C++","C","C#","DSA","MACHINE LEARNING","AI","DBMS","OS"};
	void books() 
	{
		System.out.println("Books:"+Arrays.toString(books));
	}
	/*
	void add() {
		Scanner sc=new Scanner(System.in);
		books[books.length-1]=sc.next();
		sc.close();	}
	public static void main(String[] args) {
		Library lb=new Library();
		lb.add();
		lb.books();
	}*/
}

