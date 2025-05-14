package esprit.alt.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator getewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes().route(
				"candidat",
				r->r.path("/candidats/**")
						.uri("lb://Candidat2AL6"))
				.route(
						"job",
						r->r.path("/jobs/**")
								.uri("lb://JobALT6"))
				.build();

	}




}
