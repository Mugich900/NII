package ru.ilya.test1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 1000; i++){
            if (i%3 == 0 && i%5 != 0 && getSum(i) < 10){
                arr.add(i);
            }
        }

        System.out.println(Arrays.toString(arr.toArray()));
    }
    static int getSum(int num){
        return num == 0 ? 0 : num % 10 + getSum(num/10);
    }
}