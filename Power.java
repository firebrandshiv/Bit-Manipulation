public class Power {
    public static void main(String[] args) {

        //Finding the power of a number using bit manipulation.
        //6 in binary=110.
        //Time Complexity=O(log(power)).

        int base=3;
        int power=6;

        int ans=1;
        while(power>0)
        {
            if((power&1)==1)
            {
                ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
