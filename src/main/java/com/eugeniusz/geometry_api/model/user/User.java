//package com.eugeniusz.geometry_api.model.user;
//
//import com.eugeniusz.geometry_api.model.user.Role;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.experimental.FieldDefaults;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@Entity
//@NoArgsConstructor
//@Builder
//@AllArgsConstructor
//@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
//@Table(name = "users")
//public class User implements UserDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Long id;
//
//    String firstName;
//
//    String lastName;
//
//    @NonNull
//    String email;
//
//    @NonNull
//    @Email
//    String password;
//
//    @Enumerated(EnumType.STRING)
//    Role role;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority(role.name()));
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
