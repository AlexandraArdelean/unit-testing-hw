package ro.fasttrackit.unittesting.lambdas_streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ion", "Pop", 35, "Iasi"),
                new Person("Ion", "Pop", 25, "Cluj"),
                new Person("Alex", "Dumitrescu", 68, "Oradea"),
                new Person("Alex", "Dragos", 17, "Cluj"),
                new Person("Alexandra", "Ardelean", 31, "Baia Mare"),
                new Person("Adelina", "Ardelean", 58, "Baia Mare"));
        System.out.println(people);


        System.out.println(PersonService.getAllNames(people));
        System.out.println(PersonService.findAllPersonThatAreMajor(people));
        System.out.println(PersonService.findAllPersonsFromIasiOrCluj(people));
        System.out.println(PersonService.getNamesInCapitalLetter(people));
        System.out.println(PersonService.abbreviateLastName(people));
        System.out.println(PersonService.getPersonsWithAgeBetweenRange(people));
        System.out.println(PersonService.getAllPersonsWithNameA(people));
        System.out.println(PersonService.sortByFirstName(people));
        System.out.println(PersonService.sortByLastName(people));
        System.out.println(PersonService.sortByFirstNameLastNameAndAge(people));
        System.out.println(PersonService.groupByAge(people));

        System.out.println(PersonService.listFirstNamesUniquely(people));


    }
}
