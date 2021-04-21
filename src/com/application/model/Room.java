package com.application.model;

public class Room {
    private long id;
    private String description;
    private Integer capacity;

    public Room(long id, String description, Integer capacity) {
        this.id = id;
        this.description = description;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room room = (Room) o;
        return id == room.getId() &&
                description.equals(room.getDescription()) &&
                capacity.equals(room.getCapacity());
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
