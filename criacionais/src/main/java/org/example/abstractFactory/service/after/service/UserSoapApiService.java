package org.example.abstractFactory.service.after.service;

public class UserSoapApiService implements UserService {

    public void save(Integer id, String name) {
        System.out.println("\nSaving user #" + id + " com nome " + name + " through SOAP API");
    }

    public boolean delete(Integer id) {
        System.out.println("Removing user #" + id + " through SOAP API");
        return true;
    }
}
