package com.nttdata.bootcamp.repository;

import com.nttdata.bootcamp.entity.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
//Mongodb Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, String> {
    Mono<Customer> findByName(String name);
}
