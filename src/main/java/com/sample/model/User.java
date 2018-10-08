package com.sample.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author jayendrasingh
 *
 */
@Data
@Document
public class User {

	@Id
	private String id;

	@Indexed
	private String username;

	private Integer age;

	@DBRef(lazy = false)
	private Set<Address> addresses;

}
