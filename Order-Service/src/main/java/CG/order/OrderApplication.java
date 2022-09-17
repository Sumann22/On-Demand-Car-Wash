package CG.order;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class OrderApplication {
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("On Demand Car Wash")
						.description("This is the swagger ui for Order Service")
						.version("v0.0.1"));
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
}
