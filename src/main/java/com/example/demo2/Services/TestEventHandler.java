package com.example.demo2.Services;

import com.example.demo2.Event.ObjectCreated;
import com.example.demo2.Model.TestObject;
import com.example.demo2.Repo.TestRepo;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestEventHandler {

    private final TestRepo repo;

    @Autowired
    public TestEventHandler(TestRepo repo) {
        this.repo = repo;
    }

    @EventHandler
    public void on(ObjectCreated event) {
        TestObject object = new TestObject(event.getMessage());
        repo.save(object);
    }
}
