package homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(new Person("Raul", "Pincotan", 29, "Oradea"),
                new Person("Clement", "Langlel", 27, "London"),
                new Person("Stefania", "Popa", 29, "Cluj"),
                new Person("Donald", "Trump", 74, "Washington"),
                new Person("Andrei", "Hulber", 39, "cluj"),
                new Person("Ilie", "Bolojan", 14, "Oradea"),
                new Person("Raul", "Adrian", 70, "Timisoara"),
                new Person("Raul", "Adrian", 30, "Timisoara"),
                new Person("Donald", "Duck", 7, "Budapesta"),
                new Person("Gheorghe", "Popescu", 9, "bucuresti"),
                new Person("Andreea", "Pop", 725, "London")


        ));

        System.out.println(personService.getPersonsFullName());
        System.out.println();
        System.out.println(personService.getMajor());
        System.out.println();
        System.out.println(personService.getFromOradea());
        System.out.println();
        System.out.println(personService.getFromOradeaOrCluj());
        System.out.println();
        System.out.println(personService.capitalizedFirstName());
        System.out.println(personService.getFirstNameFirstLetterOfSecond());
        System.out.println();
        System.out.println(personService.getMajorAndLess());
        System.out.println();
        System.out.println(personService.getPersonsStartsWith());
        System.out.println(personService.getUniquelyFName());
        System.out.println();
        System.out.println(personService.sortByFName());
        System.out.println();
        System.out.println(personService.sortByLName());
        System.out.println();
        System.out.println(personService.getMultipleComparations());


    }
}
