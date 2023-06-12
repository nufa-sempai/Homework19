import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        List<Integer> nums = generateInts(20);
        System.out.println("Сгенерированные числа: " + nums);
        task1(nums);
        task2(nums);
        task3(List.of("test", "test", "Test", "TEST", "tes", "test"));
        task4(List.of("test", "test", "Test", "TEST", "tes", "test"));
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }

    private static void task3(List<String> words) {
        System.out.println("Задача 3");
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }

    private static void task4(List<String> words) {
        System.out.println("Задача 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int wordsWithDuplicates = 0;
        for (Integer count: map.values()){
            if (count > 1) {
                wordsWithDuplicates++;
            }
        }
        System.out.println("Колличество слов с повторами: " + wordsWithDuplicates);
        System.out.println("----------------------------");
    }

    private static List<Integer> generateInts(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(0, 5));
        }
        return list;
    }

}