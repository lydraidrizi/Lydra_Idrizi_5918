import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors

public class main{
    public static void main (String[] args) {
        List<Integer> resultList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> resultList = initialList.stream().map(x -> x*x).collectors;
                resultList.stream().forEach(x -> System.out.println(x));
    }
}