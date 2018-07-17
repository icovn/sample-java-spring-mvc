package net.friend.security;

import javax.annotation.PostConstruct;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class FixedInformationUserDetailsService
    extends InMemoryUserDetailsManager {

  @PostConstruct
  public void init(){
    UserDetails user =
        User.withDefaultPasswordEncoder()
            .username("user")
            .password("password")
            .roles("abc")
            .build();

    this.createUser(user);
  }
}
