package com.bootcamp.bootcoin_operation.service.impl;

import com.bootcamp.bootcoin_operation.entity.Operation;
import com.bootcamp.bootcoin_operation.repository.OperationRepository;
import com.bootcamp.bootcoin_operation.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {
    private final OperationRepository repository;

    @Override
    public Mono<Operation> update(String id, Operation operation) {
        return repository.findById(id)
                .single().flatMap(foundOperation -> {
                    operation.setId(foundOperation.getId());
                    return repository.save(operation);
                });
    }

    @Override
    public Mono<Operation> save(Operation operation) {
        return repository.insert(operation);
    }

    @Override
    public Mono<Operation> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Flux<Operation> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
}
