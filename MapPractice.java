package practiceStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapPractice {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Ankita","Nikita","Ram","Yatharth","Dhananjay");
	
	names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
	names.stream().map(name->name.concat(name)).forEach(System.out::println);
	names.stream().map(name->name.charAt(1)).forEach(System.out::print);
	names.stream().map(name->name.length()).forEach(System.out::print);
	
}
}
