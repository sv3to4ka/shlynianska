package com.first;

import java.io.Serializable;

public class Pupil implements Serializable {
    private String firstName;
    private String lastName;
    transient private Thread myThread;

    public Pupil(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myThread = new Thread();
    }

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

    public Thread getMyThread() {
        return myThread;
    }

    public void setMyThread(Thread myThread) {
        this.myThread = myThread;
    }

    @Override
    public String toString() {
        return "Pupil [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}

