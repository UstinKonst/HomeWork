package Stage2Lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"cat", "dog", "cat", "human", "animal", "robot", "dog", "cow", "bird", "bird"};
        System.out.println(Arrays.toString(arr));

        Set<String> stringSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(stringSet);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        System.out.println(map);


        Phonebook book = new Phonebook();
        book.add("Боря", "89213634872");
        book.add("Ваня", "89118709773");
        book.add("Лёша", "89115442564");
        book.add("Боря", "89118771655");
        book.add("Костя", "89218897374");
        book.add("Костя", "89538757332");

        book.get("Костя");
        book.get("Ваня");
        book.get("Боря");
    }
}
