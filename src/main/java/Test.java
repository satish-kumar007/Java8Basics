import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India", "Russia", "China", "USA", "Australia", "India", "China", "India", "Russia");
        Map<String, Long> collect = countries.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((country, ap) -> {
            System.out.println(country+" "+ap);
        });

        String s = collect.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        long count = countries.stream().filter(country -> country.equalsIgnoreCase(s)).count();
        System.out.println(s+" "+count);





    }
}
