package com.first;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonApplication {
    public static void main(String[] args) throws IOException {
        Person student = new Person();
        student.setFirstName("Valera");
        student.setLastName("Klishch");

        ObjectMapper mapper = new ObjectMapper();

        String studentJson = mapper.writeValueAsString(student);
        System.out.println(studentJson);
    }
}
