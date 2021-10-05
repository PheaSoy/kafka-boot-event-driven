package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    String id;

    String firstName;

    String lastName;

    boolean isDisabled;

    @Column(name = "username", unique = true)
    String username;

    String password;

    @LastModifiedDate
    Instant lastModified;

    @CreatedDate
    Instant createdDate;

    @PrePersist
    public void beforeSave() {
        if (this.getId() == null)
            this.id = UUID.randomUUID().toString();
        this.lastModified = Instant.now();
        this.createdDate = Instant.now();
        this.isDisabled = false;
    }

    @PreUpdate
    public void beforeUpdate() {
        this.lastModified = Instant.now();
    }
}
