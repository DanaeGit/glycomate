package com.example.glycomate.model;

public class UserProfile {
    private String name;
    private int age;
    private float weight;
    private float height;

    public UserProfile(String name, int age, float weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }
}
