package com.sample.model.projection;

import org.springframework.data.rest.core.config.Projection;

import com.sample.model.User;

@Projection(name = "username", types = { User.class })
public interface UsernameProjection {

	String getId();

	String getUsername();
}
