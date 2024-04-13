public class findUnique {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,4};
        System.out.println(answer(arr));
    }

    public static int answer(int[] array)
    {
        //In this program, we are using the concept of XOR operator to find the unique element 
        //which appears only once in the given array.
        //Time Complexity: O(n) -- linear

        int unique=0;
        for(int num:array)
        {
            unique^=num;
        }
        return unique;
    }
}
