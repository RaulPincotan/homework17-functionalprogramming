package homework;

import java.util.Objects;

public class Person {
    private final String fistName;
    private final String lastName;
    private final int age;
    private final String city;

    public Person(String fistName, String lastName, int age, String city) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fistName, person.fistName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, age, city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
