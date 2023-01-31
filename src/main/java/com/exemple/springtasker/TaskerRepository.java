package com.exemple.springtasker;

import org.springframework.data.repository.CrudRepository;

public interface TaskerRepository extends CrudRepository<Task, Integer> {
}
