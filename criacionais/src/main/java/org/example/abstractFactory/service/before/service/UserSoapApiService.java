package org.example.abstractFactory.service.before.service;

public class UserSoapApiService {

    public void save(Integer id, String name) {
        System.out.println("\nSaving user #" + id + " com nome " + name + " through SOAP API");
    }

    public boolean delete(Integer id) {
        System.out.println("Removing user #" + id + " through SOAP API");
        return true;
    }
}
