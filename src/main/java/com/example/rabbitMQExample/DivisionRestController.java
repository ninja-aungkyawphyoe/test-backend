package com.example.rabbitMQExample;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("division")
public class DivisionRestController {

    private final IDivisionService service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.list());
    }

    @PostMapping
    public ResponseEntity<?> createDivision(@RequestBody Division division){
        return ResponseEntity.ok(service.create(division));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> find(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.find(id));
    }
}
