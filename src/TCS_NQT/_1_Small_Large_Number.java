package TCS_NQT;

public class _1_Small_Large_Number {
    public static void main(String[] args) {
        int[] arr={10,50,30,80,5,15};
        int result=smallestNumber(arr);
        System.out.println("smallest number = "+ result);

        int result2=largestNumber(arr);
        System.out.println("largest number = "+ result2);
    }


    public static int smallestNumber(int[] arr){
        int small=arr[0];
        for (int i=0;i<arr.length;i++){
            if (small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static int largestNumber(int[] arr) {
        int large=arr[0];
        for (int i=0;i<arr.length;i++){
            if (large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }
}
