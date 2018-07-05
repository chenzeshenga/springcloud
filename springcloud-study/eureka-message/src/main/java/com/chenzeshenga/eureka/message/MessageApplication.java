/**
 * @FILE_NAME MessageApplication.java
 * @AUTHOR chenz
 * @DATE 2018年7月5日
 */
package com.chenzeshenga.eureka.message;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageApplication.class, args);
		while (true) {
			System.out.println(new Date());
			try {
				Thread.sleep(5000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
