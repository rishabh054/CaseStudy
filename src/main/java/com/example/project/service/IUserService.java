package com.example.project.service;

import com.example.project.entities.User;
import com.example.project.repository.IUserRepository;

public interface IUserService  {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
