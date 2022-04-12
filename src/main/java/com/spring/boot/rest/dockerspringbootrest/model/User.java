package com.spring.boot.rest.dockerspringbootrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="User")
@Table(
  name = "user",
  uniqueConstraints = {
    @UniqueConstraint(
      name = "email_unique",
      columnNames = "email"
    )
  }
)
@Getter
@Setter
@NoArgsConstructor
public class User {
  
  @Id
  @SequenceGenerator(
    name = "user_sequence",
    sequenceName = "user_sequence",
    allocationSize = 1    
  )
  @GeneratedValue(
     strategy = GenerationType.SEQUENCE,
     generator = "user_sequence"
  )
  @Column(
    name = "id",
    updatable = false
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
