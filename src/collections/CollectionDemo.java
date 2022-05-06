package collections;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet<>();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");

        System.out.println(fruit.size());
        System.out.println(fruit);

        //using iterator
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //enhanced for loop
        for (String item: fruit) {
            System.out.println(item);
        }

        //method reference or with lambda expression
        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);

    }

    public static void listDemo() {
        List<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(90);
        evenNumbers.add(60);
        evenNumbers.add(32);

        System.out.println(evenNumbers.get(2));
        System.out.println(evenNumbers.size());
        System.out.println(evenNumbers);
    }

    public static void queueDemo() {
        Queue<String> animals = new LinkedList();

    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 65);
        fruitCalories.put("pineapple", 93);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 15);

//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//        System.out.println(fruitCalories.get("lemon"));
//        System.out.println(fruitCalories.entrySet());
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);

        for (var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v )
        );
    }
}
