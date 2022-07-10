package ro.fasttrackit.unittesting.lambdas_streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = Collections.unmodifiableList(persons);
    }



    public static List<String> getAllNames(List<Person> personList) {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName()).toList();
    }

    public static List<Person> findAllPersonThatAreMajor(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.age() >= 18).toList();
    }

    public static List<Person> findAllPersonsFromCluj(List<Person> personList) {
        return personList.stream()
                .filter(person -> "Cluj".equals(person.city()))
                .toList();
    }

    public static List<Person> findAllPersonsFromIasiOrCluj(List<Person> personList) {
        return personList.stream()
                .filter(person -> "Cluj".equals(person.city()) || "Iasi".equals(person.city())).toList();
    }

    public static List<String> getNamesInCapitalLetter(List<Person> personList) {
        return personList.stream()
                .map(person -> person.firstName().toUpperCase() + " " + person.lastName().toUpperCase()).toList();
    }

    public static List<String> abbreviateLastName(List<Person> personList) {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ".")
                .toList();
    }

    public static List<Person> getPersonsWithAgeBetweenRange(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.age() >= 18 && person.age() < 60).toList();

    }

    public static List<Person> getAllPersonsWithNameA(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.firstName().startsWith("A")).toList();
    }

    public static List<String> listFirstNamesUniquely(List<Person> personList) {
        return personList.stream()
                .map(Person::firstName)
                .distinct()
                .toList();
    }

    public static List<Person> sortByFirstName(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName)).toList();
    }

    public static List<Person> sortByLastName(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
    }

    public static List<Person> sortByFirstNameLastNameAndAge(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparing(Person::age))
                .toList();
    }

    public static List<Person> groupByAge(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparingInt(Person::age))
                .toList();
    }

}