package com.first;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonApplication {
    public static void main(String[] args) throws IOException {
        Person student = new Person();
        student.setFirstName("Valera");
        student.setLastName("Klishch");

        ObjectMapper mapper = new ObjectMapper();

        String studentJson = mapper.writeValueAsString(student);
        System.out.println(studentJson);

        String nac = "{\"name\":\"John\", \"age\":30, \"car\":null}";
        StringToJson nacJson = mapper.readValue(nac, StringToJson.class);
        System.out.println("name: " + nacJson.getName() + ", age: " + nacJson.getAge());
    }
}
