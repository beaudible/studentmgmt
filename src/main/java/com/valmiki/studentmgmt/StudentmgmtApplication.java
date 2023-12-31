package com.valmiki.studentmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Added to suppress "Utility classes should not have a public or default constructor." Error
@SuppressWarnings({"PMD", "checkstyle:hideutilityclassconstructor"})
@SpringBootApplication
public class StudentmgmtApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }
}
