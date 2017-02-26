package controller;

import java.util.ArrayList;
import java.util.List;

public class Events {

    List events = new ArrayList<Event>();

    public List getEvents() {
        return events;
    }

    public void setEvents(List events) {
        this.events = events;
    }

}