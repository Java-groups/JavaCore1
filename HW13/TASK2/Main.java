import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                employees.add(new Employee("Dima"));
            } else {
                employees.add(new Employee("Dima" + ((char) (i + 65))));

            }
        }
        employees.forEach(System.out::println);

        String mostRepeatedName
                = employees.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
                .get()
                .getName();

        Optional<String> name = Optional.of(
                                Optional.ofNullable(mostRepeatedName)
                                .filter(s -> !s.isEmpty()))
                                .orElse(Optional.empty()
                                );
        System.out.println(name);
    }
}