package home.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Condition{
	boolean test(Person p);
}
public class LambdaTest1 {

	public static void main(String[] args) {
		
		Person one = new Person("Santosh", "Akhilesh",40);
		Person two = new Person("Pulakit", "Akhilesh",11);
		Person three = new Person("Rutvik", "Akhilesh",3);
		Person four = new Person("Nutan", "Bala",37);
		Person five = new Person("Nirmala", "Akhilesh",62);
		
		List<Person> allPersons = new ArrayList<Person>();
		allPersons.add(one);
		allPersons.add(two);
		allPersons.add(three);
		allPersons.add(four);
		allPersons.add(five);
		System.out.println(allPersons);
		
		Collections.sort(allPersons, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName()); 
			}
			
		});
		System.out.println(allPersons);
		Collections.sort(allPersons,(o1,o2)->o1.getFirstName().compareTo(o2.getFirstName()));
		
		System.out.println(allPersons);
	}

	public static void print(){
		
		
	}
	
}
