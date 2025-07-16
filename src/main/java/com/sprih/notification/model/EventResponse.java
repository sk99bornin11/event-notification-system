
package com.sprih.notification.model;

public class EventResponse {
    private String eventId;
    private String message;

    public EventResponse(String eventId, String message) {
        this.eventId = eventId;
        this.message = message;
    }

    // Getters and setters
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
