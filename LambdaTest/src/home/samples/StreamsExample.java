package home.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		Person one = new Person("Santosh", "Akhilesh", 40);
		Person two = new Person("Pulakit", "Akhilesh", 11);
		Person three = new Person("Rutvik", "Akhilesh", 3);
		Person four = new Person("Nutan", "Bala", 37);
		Person five = new Person("Nirmala", "Akhilesh", 62);

		List<Person> allPersons = new ArrayList<Person>();

		allPersons.add(one);
		allPersons.add(two);
		allPersons.add(three);
		allPersons.add(four);
		allPersons.add(five);

		allPersons.stream().filter(p -> p.getAge() > 3).filter(p -> p.getLastName().equals("Akhilesh"))
				.forEach(p -> System.out.println(p));
		System.out.println("Internal Iterator");
		allPersons.forEach(p -> System.out.println(p));

		System.out.println("Parallel Streams");
		allPersons.parallelStream().filter(p -> p.getAge() > 12).forEach(p -> System.out.println(p));

		System.out.println("Filter and Map");

		allPersons.stream().filter(p -> p.getAge() > 10).map(Person::getFirstName).map(String::toUpperCase)
				.forEach(System.out::println);
		
		allPersons.stream().forEach(System.out::println);
		
		 allPersons.stream().filter(p -> p.getAge() > 10).collect(Collectors.toList()).stream().forEach(System.out::println);



	}

}
