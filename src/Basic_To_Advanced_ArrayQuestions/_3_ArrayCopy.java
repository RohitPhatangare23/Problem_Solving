package Basic_To_Advanced_ArrayQuestions;

public class _3_ArrayCopy {
    public static void main(StringHackerRank[] args) {
        int arr[] = { 1, 8, 3 };
        int b[] = new int[arr.length];

        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
        //b = arr;
        //b[0]++;

        //1.Iterating each element of the given original array and copy one element at a time
        /*
        for (int i=0;i<arr.length;i++){
            b[i]=arr[i];
        }
        b[0]++;

         */

        /*
       //2. Using Clone() method
        int b[]=arr.clone();
        b[0]++;

         */

        //3.Using arraycopy() method
//        System.arraycopy(arr, 0, b, 0, 3);
//        b[0]++;

        //4.Using copyOf()
//        int b[]= Arrays.copyOf(arr,3);
//        b[0]++;

        //5.Using copyOfRange()
//        int b[] = Arrays.copyOfRange(a, 2, 6);



        System.out.println("Contents of arr[] ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
