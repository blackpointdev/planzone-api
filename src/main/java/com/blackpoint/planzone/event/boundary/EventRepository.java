package com.blackpoint.planzone.event.boundary;

import com.blackpoint.planzone.event.entity.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    
}
