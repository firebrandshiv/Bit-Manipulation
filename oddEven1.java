public class oddEven1 {
    public static void main(String[] args) {
        System.out.println(isOdd(11));
    }    

    public static boolean isOdd(int num)
    {
        return (num & 1)==0;
        //this statement results in true if the given condition satisfies.
    }
    //When working with binary operators, keep a close eye on brackets/parenthesis
    //Wrong placement of brackets can give errors.
}
