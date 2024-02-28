package ru.semyak.springcourse.springlesson.dao;

import org.springframework.stereotype.Component;
import ru.semyak.springcourse.springlesson.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Danya", 18, "semen4in.d@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Car", 20, "zhenyakuk@rambler.com"));
        people.add(new Person(++PEOPLE_COUNT, "Misha", 23, "sozinov@yandex.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Valera", 48, "eliseev@mail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(person.getName());
        personToBeUpdated.setAge(person.getAge());
        personToBeUpdated.setEmail(person.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}