package com.example.atividade_java_para_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableFeignClients
@SpringBootApplication
@EnableScheduling
public class AtividadeJavaParaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeJavaParaWebApplication.class, args);
	}

}
