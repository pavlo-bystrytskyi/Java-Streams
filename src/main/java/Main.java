import org.example.StudentDataReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("### reduce ###");
        System.out.println(reduce());
        System.out.println("### forEach ###");
        forEach();
        System.out.println("### collect ###");
        System.out.println(collect());
        System.out.println("### Bonus ###");
        System.out.println(StudentDataReader.getStudentData("students.csv"));
    }

    public static Optional<Integer> reduce() {
        return IntStream.range(0, 10).boxed()
                .filter(element -> element % 2 == 0) // Filter a list of numbers and only output the even numbers.
                .map(element -> element * 2) // Step 2: Use 'map' and double each number in the list.
                .sorted() // Step 3: Sort the list in ascending order.
                .reduce(Integer::sum);// Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
    }

    public static void forEach() {
        IntStream.range(0, 10).boxed()
                .filter(element -> element % 2 == 0) // Filter a list of numbers and only output the even numbers.
                .map(element -> element * 2) // Step 2: Use 'map' and double each number in the list.
                .sorted() // Step 3: Sort the list in ascending order.
                .forEach(System.out::println);  // Step 5: Use 'forEach' and output each processed number.
    }

    public static List<Integer> collect() {
        return IntStream.range(0, 10).boxed()
                .filter(element -> element % 2 == 0) // Filter a list of numbers and only output the even numbers.
                .map(element -> element * 2) // Step 2: Use 'map' and double each number in the list.
                .sorted() // Step 3: Sort the list in ascending order.
                .collect(Collectors.toList()); // Step 6: Collect the processed numbers into a new list using 'collect'.
    }
}
