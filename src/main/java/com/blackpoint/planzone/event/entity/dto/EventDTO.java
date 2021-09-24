package com.blackpoint.planzone.event.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private Long eventId;
    private String eventName;
    private String eventComment;
    private String eventDate;
    // private List<Long> participantUserIds;
}
