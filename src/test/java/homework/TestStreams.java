package homework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStreams {


    @Test
    @DisplayName("WHEN capitalizeFirstName method  then fist name will return with uppercases")
    void testCapitalizeFistName() {
        PersonService personService = new PersonService(List.of(new Person("Raul", "Pincotan", 29, "Oradea"),
                new Person("adrian", "pincotan", 30, "Oradea")
        ));

        List<String> capitalized = personService.capitalizedFirstName();

        Assertions.assertThat(capitalized).contains("RAUL", "ADRIAN");
    }

    @Test
    @DisplayName("CHECK list size ")
    void testSize() {
        PersonService personService = new PersonService(List.of(new Person("Raul", "Pincotan", 29, "Oradea"),
                new Person("adrian", "pincotan", 30, "Oradea")
        ));

        List<Person> allPersons = personService.getAllPersons();

        Assertions.assertThat(allPersons).hasSize(2);
    }

    @Test
    @DisplayName("CHECK IF LIST IS EMPTY")
    void testIfEmpty() {
        PersonService personService = new PersonService(List.of());

        List<Person> allPersons = personService.getAllPersons();

        Assertions.assertThat(allPersons).isEmpty();
    }

    @Test
    @DisplayName("WHEN getPersonsFullName is called THEN return persons full name")
    void testGetPersonsFullName() {
        PersonService personService = new PersonService(List.of(new Person("Raul", "Pincotan", 29, "Oradea")
        ));

        List<String> fullName = personService.getPersonsFullName();

        Assertions.assertThat(fullName).contains("Raul Pincotan");
    }


}
