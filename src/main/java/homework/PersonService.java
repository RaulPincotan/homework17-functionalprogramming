package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {

        if (persons != null) {
            this.persons.addAll(persons);
        }
    }


    public List<String> getPersonsFullName() {
        return persons.stream()
                .map(person -> person.getFistName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> getMajor() {
        return persons.stream()
                .filter(person -> person.getAge() > 17)
                .collect(Collectors.toList());
    }

    public List<Person> getFromOradea() {
        return persons.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("oradea"))
                .collect(Collectors.toList());
    }

    public List<Person> getFromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("oradea") ||
                        person.getCity().equalsIgnoreCase("cluj"))
                .collect(Collectors.toList());
    }

    public List<String> capitalizedFirstName() {
        return persons.stream()
                .map(person -> person.getFistName().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> getFirstNameFirstLetterOfSecond() {
        return persons.stream()
                .map(person -> person.getFistName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());
    }

    public List<Person> getMajorAndLess() {
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsStartsWith() {
        return persons.stream()
                .filter(person -> person.getFistName().startsWith("A"))
                .collect(Collectors.toList());
    }

    public List<String> getUniquelyFName() {
        return persons.stream()
                .map(person -> person.getFistName())
                .distinct()
                .collect(Collectors.toList());

    }


    public List<Person> sortByFName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFistName))
                .collect(Collectors.toList());
    }

    public List<Person> sortByLName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public List<Person> getMultipleComparations() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFistName)
                        .thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(Collectors.toList());
    }

    public List<Person> getAllPersons() {
        return persons.stream()
                .collect(Collectors.toList());
    }

}





