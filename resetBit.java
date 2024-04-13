public class resetBit {
    public static void main(String[] args) {
        System.out.println(reset(10,2));
    }

    public static int reset(int num,int shift)
    {
        System.out.println(num & (1<<(shift-1)));
        return num & ~(1<<(shift-1));
        
        //This program is used to reset the ith bit of the given number.
        //Reset means will turn the given bit to 0.
    }
}
