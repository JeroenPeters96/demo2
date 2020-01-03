package com.example.demo2.Repo;

import com.example.demo2.Model.TestObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<TestObject, Integer> {
}
