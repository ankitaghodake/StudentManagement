package practiceStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.zensar.java8.Student;

public class FilterPractice {
	public static void main(String[] args) {
		/*List<Integer> numbers=new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);*/
		
		//another way to create collection
		System.out.println("STREAM OPERATION ON INTEGERS");
		List<Integer> numbers=Arrays.asList(10,20,30,40);
		
		//I want to filter data=condition is print number >30
		System.out.println("1st way");
		numbers.stream().filter(num->num>20 && num<40).forEach(System.out::println);
		
		System.out.println("2nd way using collect");
		List<Integer> greaterThanNum=new ArrayList();
		greaterThanNum=numbers.stream().filter(num->num>20).collect(Collectors.toList());
		System.out.println(greaterThanNum);
		
		
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("STREAM OPERATION ON STRINGS");
		List<String> names=Arrays.asList("Ankita","Nikita","Ram","Yatharth","Dhananjay");
		//List<String> namesLength=new ArrayList<>();
		names.stream().filter(n-> (n.length()<=9 && n.length()>6)).forEach(System.out::println);
		//System.out.println(namesLength);
		
		
		
		System.out.println("STREAM OPERATION ON OBJECT");
		List<Student> list = new ArrayList();

		list.add(new Student(1, 10, "A"));
		list.add(new Student(3, 25, "C"));
		list.add(new Student(2, 27, "B"));
		
		
		list.stream().filter(student->student.getAge()>20).forEach(System.out::println);
		
	}
}
