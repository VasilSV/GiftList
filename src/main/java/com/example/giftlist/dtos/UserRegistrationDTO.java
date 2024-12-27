package com.example.giftlist.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegistrationDTO {
    @NotNull
    @Size(min = 2, max = 20, message = "Username length must be between 2 and 20 characters ")
    private String firstName;
    @NotNull
    @Size(min = 2, max = 20, message = "Lastname length must be between 2 and 20 characters ")
    private String lastName;
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be empty!")
    private String email;
    @NotNull
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters ")
    private String password;
    @NotNull
    @Size(min = 3, max = 20, message = "Passwords should match")
    private String confirmPassword;


    public UserRegistrationDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegistrationDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegistrationDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegistrationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegistrationDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
