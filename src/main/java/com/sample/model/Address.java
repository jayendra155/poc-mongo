package com.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author jayendrasingh
 *
 */
@Data
@Document
public class Address {

	@Id
	private String id;
	
	private String address;
}
