package com.blackpoint.planzone.event.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Builder
@Immutable
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Getter @NonNull @Id @GeneratedValue
    private Long eventId;

    @Getter @NonNull
    private String eventName;

    @Getter
    private String eventComment;

    @Getter @NonNull
    private String eventDate;

    // @Getter @NonNull
    // private final List<Long> participantUserIds;
}
