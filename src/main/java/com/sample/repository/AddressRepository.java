package com.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.model.Address;

/**
 * @author jayendrasingh
 *
 */
public interface AddressRepository extends MongoRepository<Address, String> {

}
