package com.example;

import org.springframework.data.annotation.Id;

public class RecordEntity {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "First Name{" +
                "FirstName='" + firstName + '\'' +
                ", LastName=" + lastName +
                '}';
    }

}
