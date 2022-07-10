package ro.fasttrackit.unittesting.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.unittesting.lambdas_streams.Person;
import ro.fasttrackit.unittesting.lambdas_streams.PersonService;


import java.util.List;


public class LambdasAndStreamsTest {
    @Test
    public void testIfPersonManesArePresent() {
        List<Person> input = List.of(new Person("Ion", "Pop", 15, "Iasi"),
                new Person("Ioana", "Popescu", 25, "Cluj"));
        List<String> output = PersonService.getAllNames(input);
        Assertions.assertEquals(List.of("Ion Pop", "Ioana Popescu"), output);

    }

    @Test
    public void testIfPersonsAreMajor() {
        List<Person> input = List.of(new Person("Ion", "Pop", 15, "Iasi"),
                new Person("Ioana", "Popescu", 25, "Cluj"));
        List<Person> output = PersonService.getPersonsWithAgeBetweenRange(input);
        Assertions.assertEquals(List.of(new Person("Ioana", "Popescu", 25, "Cluj")), output);
    }

    @Test
    public void testIfSortByNameAndAgeWork() {
        List<Person> input = List.of(new Person("Oana", "Pop", 15, "Iasi"),
                new Person("Andreea", "Popescu", 25, "Cluj"));
        List<Person> output = PersonService.sortByFirstNameLastNameAndAge(input);
        Assertions.assertEquals(List.of(new Person("Andreea", "Popescu", 25, "Cluj"),
                new Person("Oana", "Pop", 15, "Iasi")), output);
    }
}
