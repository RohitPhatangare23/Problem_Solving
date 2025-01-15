package Blind75;

public class _11_Move_Zeros {
    public static void main(String[] args) {
        int[] n={0,1,0,3,12};
       movesZeros(n);
        System.out.println("\nArray after moving zeros:");
        for (int num : n) {
            System.out.print(num + " ");
        }
    }

    public static void movesZeros(int[] n) {
        int count=0;
        for (int i=0;i<n.length;i++){
            if (n[i]!=0){
                n[count++]=n[i];
            }
        }
        while (count<n.length){
            n[count++]=0;
        }

    }


}
