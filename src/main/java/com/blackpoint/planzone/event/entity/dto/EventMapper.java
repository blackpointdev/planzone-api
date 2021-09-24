package com.blackpoint.planzone.event.entity.dto;

import com.blackpoint.planzone.event.entity.Event;

public class EventMapper {
    public EventDTO mapToDTO(Event event) {
        return EventDTO.builder()
            .eventId(event.getEventId())
            .eventName(event.getEventName())
            .eventComment(event.getEventComment())
            .eventDate(event.getEventDate())
            .build();
    }

    public Event mapToEntity(EventDTO eventDTO) {
        return Event.builder()
            .eventId(eventDTO.getEventId())
            .eventName(eventDTO.getEventName())
            .eventComment(eventDTO.getEventComment())
            .eventDate(eventDTO.getEventDate())
            .build();
    }
}
