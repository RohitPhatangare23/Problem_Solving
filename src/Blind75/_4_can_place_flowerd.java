package Blind75;

public class _4_can_place_flowerd {
    public static void main(String[] args) {
        int[] floweredbed={1,0,0,0,1};
        int n=1;
        System.out.println(placeFlower(floweredbed,n));
    }

    private static boolean placeFlower(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
