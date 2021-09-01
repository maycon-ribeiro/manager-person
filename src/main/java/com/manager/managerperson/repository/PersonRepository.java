package com.manager.managerperson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.managerperson.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
