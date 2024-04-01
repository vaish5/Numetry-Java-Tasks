package com.api.formapidemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;

    @Column(unique = true, length = 8)
    private @Getter @Setter String alphaNumericId;

    @NotNull
    @NotEmpty(message = "Full name is required.")
    @Size(min = 6, max = 30, message = "Enter at least 6 characters and at most 30 characters.")
    private @Getter @Setter String fullName;

    @NotNull
    @NotEmpty(message = "User name is required.")
    @Size(min = 6, max = 30, message = "Enter at least 6 characters and at most 30 characters.")
    private @Getter @Setter String userName;

    @NotNull
    @NotEmpty(message = "Password is required.")
    @Size(min = 8, max = 15, message = "Enter at least 8 characters and at most 15 characters.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Enter correct password pattern." +
                    "Password should have at least one lower case alphabet" +
                    "Password should have at least one upper case alphabet" +
                    "Password should have at least one number" +
                    "Password should have at least one special character")
    private  @Getter @Setter String password;

    private @Getter @Setter LocalDateTime lastLogin;
    private @Getter @Setter LocalDateTime lastLogout;


    @PrePersist
    private void generateAlphaNumericId() {
        if (alphaNumericId == null) {
            // Generate alphanumeric ID of length 8 using UUID
            String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase();
            this.alphaNumericId = uuid;
        }
    }
}
