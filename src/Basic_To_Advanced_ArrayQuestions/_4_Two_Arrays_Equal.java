package Basic_To_Advanced_ArrayQuestions;

import java.util.Arrays;

public class _4_Two_Arrays_Equal {
    public static void main(StringHackerRank[] args) {
        int a[]={10,20,30};
        int b[]={10,20,30};

        boolean result= Arrays.equals(a,b);
        if (result==true){
            System.out.println("Two Arrays are equal");
        }
        else{
            System.out.println("Not equal");
        }

        //2.Without using pre-defined function

        boolean ans=true;
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (a[i]!=b[i]){
                    ans=false;
                }
            }
        }
        else {
            ans=false;
        }

        if (ans==true){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
