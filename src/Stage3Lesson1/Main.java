package Stage3Lesson1;


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





        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
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
