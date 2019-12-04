package com.example.cmd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info(Arrays.toString(args));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
