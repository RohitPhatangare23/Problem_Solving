import java.util.Scanner;

public class _7_Trailing_Zero {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int count=0;
        while (n>=5){
            n=n/5;
            count=count+n;
        }
        System.out.println(count);
    }
}
