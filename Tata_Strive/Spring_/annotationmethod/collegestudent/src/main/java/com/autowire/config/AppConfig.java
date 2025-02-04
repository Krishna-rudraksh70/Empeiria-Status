// package com.autowire.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;

// import com.autowire.model.Student;

// import java.util.Arrays;
// import java.util.List;

// @Configuration
// @ComponentScan(basePackages = "com.autowire")
// public class AppConfig {
    
//     @Bean
//     public Student student1() {
//         return new Student(1, "Kvds");
//     }

//     @Bean
//     public Student student2() {
//         return new Student(2, "dsds");
//     }

//     @Bean
//     public List<Student> students() {
//         return Arrays.asList(student1(), student2());
//     }
// }

package com.autowire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.autowire.model.Student;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.autowire")
public class AppConfig {

    @Bean
    public List<Student> eng() {
        return Arrays.asList(new Student(1, "Krishna"), new Student(2, "Rudraksh"));
    }

    @Bean
    public List<Student> med() {
        return Arrays.asList(new Student(3, "Aasif"), new Student(4, "Hap"));
    }
}
