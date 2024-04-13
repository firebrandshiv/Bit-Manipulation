import java.util.Scanner;
//import java.util.function;

public class Bits
{
    public static void main(String[] args) {
        System.out.print("Enter the number you want to left shift: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        //int ans= num<<1 ;
        //System.out.println("The left shifted num is: " + ans);

        for(int i=1;i<10;i++)
        {
            int answer =num<<i;
            System.out.println(answer);
        }

    }
}