import java.util.Scanner;
public class quad
{ public static void main(String args[])
   {
   
     Scanner input=new Scanner(System.in);
       System.out.println("enter a=");
       double a=input.nextDouble();
       System.out.println("enter b=");
       double b=input.nextDouble();
       System.out.println("enter c=");
       double c=input.nextDouble();

       double root1,root2;
       double determinant=(b*b)-(4*a*c);
        if(determinant>0)
         { root1=(-b+Math.sqrt(determinant)/(2*a));
           root2=(-b-Math.sqrt(determinant)/(2*a));
           System.out.println("roots are real and distict");
          System.out.format("root1= %.2f and root2= %.2f",root1,root2);
         }
         else if(determinant==0)
          {    root1=root2= -b/(2*a);
               System.out.println("real and equall roots");
               System.out.format("root1= %.2f and root2= %.2f",root1,root2);
          }
         else
          { System.out.println("real and imaginary roots");  
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
          }
}
}
         
       


