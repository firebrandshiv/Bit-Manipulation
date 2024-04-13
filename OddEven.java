import java.util.Scanner;
public class OddEven 
{
    public static void main(String[] args) 
    {
        //This code helps us to identify whether the given number is even or odd
        //in a single line using bit manipulation, using bitwise operator.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new number: ");
        int num=sc.nextInt();

        if((num & 1)==0)
        {
            System.out.print("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
