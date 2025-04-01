package com.lm2a.relations.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Living room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
