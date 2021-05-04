package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {
    private String name;
    private int id;
    private LocalDate dob;
    private Enum gender;

    public Patient(String name, int id, LocalDate dob, Enum gender) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }
}


