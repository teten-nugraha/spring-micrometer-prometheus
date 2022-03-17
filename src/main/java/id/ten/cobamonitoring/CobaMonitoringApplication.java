package id.ten.cobamonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CobaMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobaMonitoringApplication.class, args);
	}

}
