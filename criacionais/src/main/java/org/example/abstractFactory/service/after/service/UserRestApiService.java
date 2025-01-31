package org.example.abstractFactory.service.after.service;

public class UserRestApiService implements UserService {

    public void save(Integer id, String name) {
        System.out.println("\nSaving user #" + id + " com nome " + name + " through REST API");
    }

    public boolean delete(Integer id) {
        System.out.println("Removing user #" + id + " through REST API");
        return true;
    }
}
