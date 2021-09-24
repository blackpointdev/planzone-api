package com.blackpoint.planzone.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Entity
@Builder
public class User {
    
    @Getter @NonNull
    @Id @GeneratedValue
    private Long userId;

    @Getter @NonNull
    private String username;
}
