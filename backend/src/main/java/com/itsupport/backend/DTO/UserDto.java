package com.itsupport.backend.DTO;

import com.itsupport.backend.model.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDto {
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
