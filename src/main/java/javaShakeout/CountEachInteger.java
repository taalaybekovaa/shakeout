package javaShakeout;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachInteger {
    /* Write a program which will count occurrences of each integer int number=122346;*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 2, 3, 5, 5};
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;//because we have already updated the count of that element(freq[j])  and we don't want to visit that element again
                }if (freq[i] != visited) {
                    freq[i] = count;
                }
            }
        }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != visited) {// since we would like to print only unique elements
                    System.out.println("Integer | Frequency");
                    System.out.println(arr[i] +"       |    "+ freq[i]);
                }
            }
        }
    }


