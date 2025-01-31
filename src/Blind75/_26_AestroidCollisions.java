package Blind75;

import java.util.Arrays;
import java.util.Stack;

public class _26_AestroidCollisions {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(aestroidCollisons(asteroids)));
    }
    public static int[] aestroidCollisons(int[] asteroids){
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                alive = false;
                break;
            }
            if (alive) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; --i) {
            result[i] = stack.pop();
        }

        return result;
    }
}
