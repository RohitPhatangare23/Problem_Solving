package Blind75;

public class _19_Higest_Altitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int ans=higestAltitude(gain);
        System.out.println(ans);
    }
    public static int higestAltitude(int[] gain){
        int altitude=0;
        int max=0;
        for (int val:gain){
            altitude=altitude+val;
            max=Math.max(max,altitude);
        }
        return max;
    }
}
