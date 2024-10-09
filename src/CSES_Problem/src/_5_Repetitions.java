import java.util.Scanner;

public class _5_Repetitions {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //read input DNA Sequence
        String seq=input.next();

        char current_char=seq.charAt(0);
        int current_count=1;
        int max_count=1;

        for(int i=1; i<seq.length();i++){
            if(seq.charAt(i)==current_char){
                current_count++;
            }
            else{
                current_char=seq.charAt(i);
                current_count=1;
            }
            max_count=Math.max(max_count,current_count);
        }
        System.out.println(max_count);

    }
}
