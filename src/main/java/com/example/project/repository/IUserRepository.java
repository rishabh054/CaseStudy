package com.example.project.repository;

import com.example.project.entities.User;

public interface IUserRepository {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
