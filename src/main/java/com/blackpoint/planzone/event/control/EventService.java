package com.blackpoint.planzone.event.control;

import com.blackpoint.planzone.event.boundary.EventRepository;
import com.blackpoint.planzone.event.entity.Event;
import com.blackpoint.planzone.event.entity.dto.EventDTO;
import com.blackpoint.planzone.event.entity.dto.EventMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventService() {
        this.eventMapper = new EventMapper();
    }

    public EventDTO getEventById(Long eventId) {
        return eventMapper.mapToDTO(eventRepository.getById(eventId));
    }

    public EventDTO createEvent(EventDTO eventDTO) {
        return eventMapper.mapToDTO(saveEvent(eventDTO));
    }

    private Event saveEvent(EventDTO eventDTO) {
        return eventRepository.save(eventMapper.mapToEntity(eventDTO));
    }
}
