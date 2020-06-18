package Lesson1;

import Stage3Lesson1.Apple;
import Stage3Lesson1.Box;
import Stage3Lesson1.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        change(arr, 0, 3);
        System.out.println(Arrays.toString(arr));





        ArrayList<String> arrList = toArrayList(arr);
        System.out.println(arrList);





        Stage3Lesson1.Apple apple1 = new Stage3Lesson1.Apple();
        Stage3Lesson1.Apple apple2 = new Stage3Lesson1.Apple();
        Stage3Lesson1.Apple apple3 = new Stage3Lesson1.Apple();

        Stage3Lesson1.Orange orange1 = new Stage3Lesson1.Orange();
        Stage3Lesson1.Orange orange2 = new Stage3Lesson1.Orange();

        Stage3Lesson1.Box<Stage3Lesson1.Apple> box1 = new Stage3Lesson1.Box<Apple>(apple1, apple2, apple3);
        Stage3Lesson1.Box<Stage3Lesson1.Orange> box2 = new Stage3Lesson1.Box<Stage3Lesson1.Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Stage3Lesson1.Box<Stage3Lesson1.Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
    }

    public static void change(String[] arr, int arr1, int arr2) {
        String a = arr[arr1];
        arr[arr1] = arr[arr2];
        arr[arr2] = a;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }




}
