package books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryAPP extends Books
{
	public static void main(String[] args)
	{
		Books b1=new LibraryAPP();
		
		int s=0;
		System.out.println("------Library Administration-----");
		for(int k=1;k>0;){
			System.out.println("\nFor Library Books Enter : --1--");
			System.out.println("For Libray Members Enter: --2--");
			System.out.println("For Borrowing Enter     : --3--");
			System.out.println("For Return Books Enter  : --4--");
			System.out.println("For Exit                : --5--");
			System.out.println("Enter your option:");
			try {
			Scanner input=new Scanner(System.in);
			s=input.nextInt();
			if(s<5 && s>=1){
				switch (s) 
				{
					case 1:b1.books();break;
					case 2:System.out.println("Enter your Name and Id");
						b1.members(input.next());break;
					case 3: 
						System.out.println("Enter your Name :");
						String name=input.next();
						System.out.println("Enter your Id:");
						int id=input.nextInt();
						b1.borrow(name, id);break;
					case 4:
						System.out.println("enter your id:");
						b1.returnbook(input.nextInt());break;
				}
				input.close();
			}
			else if(s==5)
			{
				System.out.println("Exit!");
				break;
			}
			else if(s>5){
				System.out.println("Invalid option!!");
			}
		
			}
			catch (InputMismatchException e) {
		
			// TODO: handle exception
			System.out.println("Input miss match");
			}

	}
}
}
