package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestToArray {
    public static void main(String[] args) {
        //Задание 2
        String[] array = {"1", "2", "3", "4"};

        List<String> list = new ArrayList<String>();

        list = new ArrayList<String>();

        Collections.addAll(list, array);

        for (String str : list)
            System.out.print(" " + str);

// Задание 1
        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

//Задание 3

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

    }

    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;


    }
}
