import java.util.Scanner;
//import java.util.function.BinaryOperator;

public class ithbit {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new number: ");
        int num=sc.nextInt();

        System.out.println("Enter the position whose ith bit you wanna find:");
        int position= sc.nextInt();

       // int ans= num & (1<<(position-1));
        //System.out.println(1<<(position-1));
        System.out.println(num & (1<<(position-1)));
    }
}
