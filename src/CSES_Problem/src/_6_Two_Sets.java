import java.util.ArrayList;
import java.util.Scanner;

public class _6_Two_Sets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int totalsum=(n*(n+1))/2; // calculate total sum
        if (totalsum % 2 != 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");

            //Create Two Sets
            ArrayList<Integer> s1=new ArrayList<>();
            ArrayList<Integer> s2=new ArrayList<>();

            //distribute number into two sets

            for (int i=n;i>=1;i--){
                if (totalsum -i>=i){
                    s1.add(i);
                    totalsum-=i;

                }
                else{
                    s2.add(i);
                }
            }

            //print size and elements of sets;
            System.out.println(s1.size());
            for (int num:s1){
                System.out.println(num + " ");
            }
            System.out.println();

            System.out.println(s2.size());
            for (int num : s2){
                System.out.println(num + " ");
            }
            System.out.println();
        }

    }
}
