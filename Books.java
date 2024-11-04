package books;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Books extends Library
{
    HashMap<Integer ,String> hash=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    int h1,id2;
    String s;
    void borrow(String name,int id)
    { 
        for(int i=0;i<=member.length-1;i++){
            s=member[i];
            id2=ids[i];
            if(name.equalsIgnoreCase(s.toString())&& id==id2)
            {
                System.out.println("How  many books you want:");
                h1=sc.nextInt();
                String b1[]=new String[h1];
                Library lb=new Books();
                lb.books();
                System.out.println("\nwhich book you want in above list:");
                for(int j=0;j<h1;j++)
                {
                    b1[j]=sc.next();
                }  

                System.out.println(name+" borrowing books :"+Arrays.toString(b1));
            }
            else if(name.equalsIgnoreCase(s.toString()) && id!=id2) 
            {
            		System.out.println("Enter valid id:");break;
            }
            else if(name!=s.toString() && id!=id2) {
            		System.out.println("Enter valid details:");break;
            }
        }
   }
   public void returnbook(int id){
        Library lb=new Books();
        for(int i=0;i<=ids.length-1;i++){
            if(id==ids[i]){
                System.out.println("How many books you want return: ");
                int r=sc.nextInt();
                String arr[]=new String[r];
                System.out.println("Which book you want to return:");
                for(int k=0;k<=r-1;k++){
                    lb.books();
                    arr[k]=sc.next();
                }
                System.out.println("Id "+id+"  Total returned Books:"+Arrays.toString(arr));break;
            }
            else if(id>112 || id<100 ){
                System.out.println("you are not a member! Check your Id!");break;
            }
        }

   }
}
