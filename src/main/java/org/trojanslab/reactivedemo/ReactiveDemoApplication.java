package org.trojanslab.reactivedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.trojanslab.reactivedemo.client.SampleClient;

import java.util.stream.Collectors;

@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);

		System.out.println(new SampleClient().getOlaResult().toStream().collect(Collectors.toList()));
	}

}
