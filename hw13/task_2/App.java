package hw13.task_2;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of("Bob", "Din", "Sam", "Sam", "John", "Ali")
                .map(Employee::new);
        Optional<String> mostPopularName = mostPopularName(employees);
        System.out.println(mostPopularName.orElse(""));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> namesCount = employees.map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Long, String> countToName = namesCount.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (s, s2) -> ""));

        long nameWithMaxCount = countToName.keySet().stream().max(Long::compareTo).orElse(-1L);

        return Optional.ofNullable(countToName.get(nameWithMaxCount));
    }
}
