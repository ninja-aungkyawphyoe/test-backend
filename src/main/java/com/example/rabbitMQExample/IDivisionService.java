package com.example.rabbitMQExample;

import java.util.List;

public interface IDivisionService {
    Division find(Long id);
    List<Division> list();
    Division create(Division division);
}
