package ru.semyak.springcourse.springlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.semyak.springcourse.springlesson.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
