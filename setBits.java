public class setBits {
    public static void main(String[] args) {

        //We are trying to count the number of set bits in the given number.
        //Set Bits means the number of 1's in the binary form of given number.
        
        int num=8;
        System.out.println(Integer.toBinaryString(num));

        int count=0;
        while(num>0)
        {
            if((num&1)==1)
            {
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
}
