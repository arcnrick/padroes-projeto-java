package org.example.abstractFactory.service.before.service;

public class CarRestApiService {

    public void save(Integer id, String name) {
        System.out.println("\nSaving car #" + id + " com nome " + name + " through REST API");
    }

    public void update(Integer id, String newName) {
        System.out.println("Updating car #" + id + " com nome " + newName + " through REST API");
    }
}
