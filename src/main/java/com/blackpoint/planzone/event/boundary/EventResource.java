package com.blackpoint.planzone.event.boundary;

import com.blackpoint.planzone.event.control.EventService;
import com.blackpoint.planzone.event.entity.dto.EventDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(EventResource.MAIN_PATH)
public class EventResource {

    final static String MAIN_PATH = "/event";
    private final static String ID_PARAM = "id";

    private final EventService eventService;

    public EventResource(EventService eventService) {
        this.eventService = eventService;
    }

    @Operation(summary = "Get an event by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the event", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = EventDTO.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Event not found", content = @Content) })
    @GetMapping
    private EventDTO getEvent(@RequestParam(name = ID_PARAM) Long id) {
        return eventService.getEventById(id);
    }

    @Operation(summary = "Create an event")
    @PostMapping
    private EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        return eventService.createEvent(eventDTO);
    }
}
