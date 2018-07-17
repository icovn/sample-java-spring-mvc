package net.friend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

  private Long id;

  private String username;

  private String hashedPassword;
}
