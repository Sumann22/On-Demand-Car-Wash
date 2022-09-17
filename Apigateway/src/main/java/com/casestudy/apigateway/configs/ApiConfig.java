package com.casestudy.apigateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApiConfig {
	@Bean
	public RouteLocator allroutes(RouteLocatorBuilder route) {
	return route.routes()

			.route(Admin->Admin
			.path("/admins/*")
			.uri("http://localhost:8081"))
			
			.route(order->order
			.path("/orders/*")
			.uri("http://localhost:8082"))
			
			.route(user->user
			.path("/users/*")
			.uri("http://localhost:8083"))

			.route(washer->washer
		    .path("/washers/*")
		    .uri("http://localhost:8085"))

		    .build();
	
}

}