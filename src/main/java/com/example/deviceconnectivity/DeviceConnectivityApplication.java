package com.example.deviceconnectivity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class DeviceConnectivityApplication implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(DeviceConnectivityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DeviceConnectivityApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
	}
}
