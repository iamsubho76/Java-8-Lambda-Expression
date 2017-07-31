package com.org.v19.Java_8_Lambda_Reference_to_an_instance_method_of_an_arbitrary_object;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.org.model.Person;

public class ReferenceToInstanceMethodInLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bean", 27));
		persons.add(new Person("Sean", 21));
		persons.add(new Person("Martin", 45));
		persons.add(new Person("Frank", 27));

		List<String> personNames = ReferenceToInstanceMethodInLambda.getPersonsName(persons, Person::getName);
		personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons,Function<Person, String> f) {
		List<String> results = new ArrayList<>();
		persons.forEach(n -> results.add(f.apply(n)));
		return results;
	}
}
