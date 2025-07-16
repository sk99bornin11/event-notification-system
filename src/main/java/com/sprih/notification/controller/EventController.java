
package com.sprih.notification.controller;

import com.sprih.notification.model.EventRequest;
import com.sprih.notification.model.EventResponse;
import com.sprih.notification.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventResponse> createEvent(@RequestBody EventRequest request) {
        return ResponseEntity.ok(eventService.processEvent(request));
    }
}
