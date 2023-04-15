package com.example.jpp3_1_2.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "budgetToAct")
    private int budgetToAct;

    public User() {
    }

    public User(String name, String surname, String purpose, int budgetToAct) {
        this.name = name;
        this.surname = surname;
        this.purpose = purpose;
        this.budgetToAct = budgetToAct;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getBudgetToAct() {
        return budgetToAct;
    }

    public void setBudgetToAct(int budgetToAct) {
        this.budgetToAct = budgetToAct;
    }

    @Override
    public String toString() {
        return "User: " + name + ", " + surname +
                ", purpose - " + purpose +
                ", budget for it - " + budgetToAct;
    }
}
