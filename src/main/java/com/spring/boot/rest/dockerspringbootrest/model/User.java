package com.spring.boot.rest.dockerspringbootrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {
  
  @Id
  @GeneratedValue
  @Column(
    name="id",
    nullable=false,
    unique=true
  )
  private Long id;
  
  @Column(
    name = "first_name",
    nullable = false
  )
  private String firstName;
  
  @Column(
    name = "last_name",
    nullable = false
  )
  private String lastName;
  
  @Column(
    name = "email",
    nullable = false
  )
  private String email;

  @Column(
    name = "password",
    nullable = false
  )
  private String password;

}
