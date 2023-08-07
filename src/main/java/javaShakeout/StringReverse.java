package javaShakeout;

public class StringReverse {

    public static void main(String[] args) {
        String toReverse = "Hi there";
        String reversed = "";
        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed = reversed + toReverse.charAt(i);

        }
        System.out.println(reversed);
        //---------------------------------------//

        String toSplitAndReverse = "I love coding";
        String splitedAndReversed = "";
        String[] array = toSplitAndReverse.split(" ");

        for (int i = array.length-1; i >= 0; i--) {
        splitedAndReversed = splitedAndReversed + array[i]+ " ";
        }
        System.out.println(splitedAndReversed);
    }
}
