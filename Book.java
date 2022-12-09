
import java.util.*;
import java.lang.*;
import java.util.Scanner;
class book
{
      String name,author;
      int price, num_pages;  
     void getval()
     {
     
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter book name:");
       name=sc.nextLine();

       System.out.println("Enter author name");
       author=sc.nextLine();
       System.out.println("Enter price ");
       price=sc.nextInt();
       System.out.println("Enter No. of pages");
       num_pages=sc.nextInt();
     }
    void display()
     {
         System.out.println("Details of the book:");
         System.out.println("name of the book :"+name);
         System.out.println("author of book: "+author);
         System.out.println("book price :"+price);
         System.out.println("number of pages :"+num_pages);
     }
}
class Book1
{
  public static void main(String args[])
   {
     int n;
     Scanner sc=new Scanner(System.in) ;
     System.out.println("enter the number of books:");
     n=sc.nextInt();
     
     book ob[]=new book[n];
     for(int i=0;i<n;i++)
     {
        ob[i]=new book();
     }
     for(int j=0;j<n;j++)
     {
        ob[j].getval();
     }
     for(int j=0;j<n;j++)
     {
        ob[j].display();
     }
   }
}
