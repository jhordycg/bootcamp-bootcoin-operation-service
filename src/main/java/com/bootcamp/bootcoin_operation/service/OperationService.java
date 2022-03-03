package com.bootcamp.bootcoin_operation.service;

import com.bootcamp.bootcoin_operation.entity.Operation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OperationService {
    Mono<Operation> update(String id, Operation product);

    Mono<Operation> save(Operation product);

    Mono<Operation> findById(String id);

    Flux<Operation> findAll();

    Mono<Void> deleteById(String id);
}
