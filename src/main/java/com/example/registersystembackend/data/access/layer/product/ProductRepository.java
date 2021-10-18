package com.example.registersystembackend.data.access.layer.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<Product, UUID>, ProductCustomRepository {

    Optional<Product> findProductByIsDeletedIsFalseAndCode(String code);

    Set<Product> findAllByIsDeletedIsFalseAndIdIn(Set<UUID> ids);
}
