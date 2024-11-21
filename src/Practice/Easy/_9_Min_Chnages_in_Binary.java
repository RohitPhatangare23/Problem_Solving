package Practice.Easy;

public class _9_Min_Chnages_in_Binary {
    public static void main(String[] args) {
        String s="1001";
        int result=minChanges(s);
        System.out.println(result);

    }
    public static int minChanges(String s) {

        int minChange=0;
        for(int i=0;i<s.length();i=i+2){
            if(s.charAt(i)!=s.charAt(i+1)){
                minChange++;
            }
        }
        return minChange;
    }
}
