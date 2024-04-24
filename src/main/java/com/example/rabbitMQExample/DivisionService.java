package com.example.rabbitMQExample;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DivisionService implements IDivisionService{

    private final DivisionRepository repository;
    @Override
    public Division find(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Division> list() {
        return repository.findAll();
    }

    @Override
    public Division create(Division division) {
        return repository.save(division);
    }
}
