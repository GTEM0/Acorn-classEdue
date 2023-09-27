package java2prj1.day3.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class 스트링스트림예제 {

    public static void main(String[] args) {
       
    	String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Grape"};
  
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        Stream<String> stringArrayStream = Arrays.stream(stringArray);
        List<String> filteredArray = stringArrayStream.filter(str -> str.length() >= 5)
                .collect(Collectors.toList());

        Stream<String> stringListStream = stringList.stream();
        List<String> lowercaseList = stringListStream.map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Filtered Array: " + filteredArray);

        System.out.println("Lowercase List: " + lowercaseList);
    }
}

