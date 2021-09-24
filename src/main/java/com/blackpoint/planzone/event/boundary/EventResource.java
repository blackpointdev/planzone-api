package com.blackpoint.planzone.event.boundary;

import com.blackpoint.planzone.event.control.EventService;
import com.blackpoint.planzone.event.entity.dto.EventDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EventResource.MAIN_PATH)
public class EventResource {
    
    final static String MAIN_PATH = "/event";
    private final static String ID_PARAM = "id";

    private final EventService eventService;

    public EventResource(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    private EventDTO getEvent(@RequestParam(name = ID_PARAM) Long id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    private EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        return eventService.createEvent(eventDTO);
    }
}
