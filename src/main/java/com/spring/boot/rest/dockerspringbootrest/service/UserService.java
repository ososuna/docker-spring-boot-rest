package com.spring.boot.rest.dockerspringbootrest.service;

import java.util.List;
import java.util.Optional;

import com.spring.boot.rest.dockerspringbootrest.model.User;
import com.spring.boot.rest.dockerspringbootrest.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    
    Optional<User> userOpt = userRepository
      .findByEmail(user.getEmail());

    if (userOpt.isPresent()) {
      throw new IllegalStateException("already existing email");
    }

    userRepository.save(user);

    return user;
  
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

}
