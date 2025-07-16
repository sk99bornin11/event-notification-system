
package com.sprih.notification.service;

import com.sprih.notification.model.EventRequest;
import com.sprih.notification.model.EventResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventService {
    public EventResponse processEvent(EventRequest request) {
        String eventId = UUID.randomUUID().toString();
        // Queue logic and callback logic will be here later
        return new EventResponse(eventId, "Event accepted for processing.");
    }
}
