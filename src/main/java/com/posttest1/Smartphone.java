/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posttest1;

/**
 *
 * @author Aditya D
 */
public class Smartphone {
    // Property
    public String brand;
    public String model;
    public double screenSize;

    // Constructor
    public Smartphone(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

