package net.friend.security;

import net.friend.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DatabaseUserDetailService implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //get User from username
    User user = new User(1L, "test", "asdfasdfasdfasdfadsf");

    //if User not exist --> return null

    //if User exist init UserDetails from User

    //ma hoa password nhap vao --> so sanh password tra ve tu function
    return null;
  }
}
