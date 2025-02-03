import java.util.*;
class ReadOnlySet {
    public static void main(String[] args)
    {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        numbers.stream().forEach(System.out::print);

        numbers.remove(5);

        System.out.println("\nAfter Performing Operation");

        numbers.stream().forEach(System.out::print);

        System.out.println(
            "\nSet is also By Default Readable and Writable");

        numbers = Collections.unmodifiableSet(numbers);
        //numbers.remove(4);
        System.out.println(numbers.contains(3));
        System.out.println("Now Set is Read-Only");
       
    }
}