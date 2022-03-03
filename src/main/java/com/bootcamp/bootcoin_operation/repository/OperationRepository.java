package com.bootcamp.bootcoin_operation.repository;

import com.bootcamp.bootcoin_operation.entity.Operation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OperationRepository extends ReactiveMongoRepository<Operation, String> {
}
