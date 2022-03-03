package com.bootcamp.bootcoin_operation.controller;

import com.bootcamp.bootcoin_operation.entity.Operation;
import com.bootcamp.bootcoin_operation.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("operations")
@RequiredArgsConstructor
public class OperationController {
    private final OperationService service;

    @GetMapping
    public Flux<Operation> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Operation> getOne(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Operation> create(@RequestBody Operation product) {
        return service.save(product);
    }

    @PutMapping("/{id}")
    public Mono<Operation> update(@PathVariable String id, @RequestBody Operation product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable String id) {
        return service.deleteById(id);
    }
}
