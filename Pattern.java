import java.util.Scanner;
 
public class Pattern
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the no. of rows:");
         
        int rows = sc.nextInt();
         
        //Printing upper half
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j+" "); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half 
         
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        sc.close();
    }
}
