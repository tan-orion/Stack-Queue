package reserver;

import java.util.Arrays;
import java.util.Stack;

public class Reverser {
    public static void main(String[] args) {
reveserIntergers();
reverseString();
    }
    private static void reveserIntergers(){
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int element : array) {
            stack.push(element);
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println(Arrays.toString(array));
    }
    private static void reverseString() {
        String string = "Nguyễn Huy Tân";
        String newString = "";
        System.out.println(string);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char thisChar = string.charAt(i);
            stack.push(thisChar);
        }
        for (int i = 0; i < string.length(); i++) {
            newString += stack.pop();
        }
        System.out.println(newString);
    }


}
