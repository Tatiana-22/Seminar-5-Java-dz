import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();    
        bookFone.put("Журкина А.В.", "8-927-876-54-76");
        bookFone.put("Воронина Т.О.", "8-926-717-90-07");
        bookFone.put("Воронина Ю.О.", "8-926-784-88-00, 8-926-543-89-61");
        bookFone.put("Исаева Д.С.", "8-916-878-45-48");
        bookFone.put("Лобанова Д.О.", "8-971-673-98-03, 8-978-564-87-98");
        System.out.println(bookFone.get("Журкина А.В."));
        System.out.println(bookFone.get("Лобанова Д.О."));

        addBookFone(bookFone, "Минина А.Е.", "8-926-983-89-00");

        System.out.println(bookFone.get("Минина А.Е."));

        deleteBookFone(bookFone, "Журкина А.В.");

        System.out.println(bookFone);

    }

    // Добавить или изменить или изменить данные
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }

    public static void sert(Map<String, String> dict, String name){
       class ArraySort {
            public void main(String[] args) {
                Integer[] arr = {bookFone.put};
                Arrays.sort(arr, Collections.reverseOrder());

            for (int values : arr) {
             System.out.print(values + ", ");
        
            }
    }
    } 
    }
}