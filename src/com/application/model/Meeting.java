package com.application.model;

import java.time.LocalDateTime;
import java.util.List;

public class Meeting {
    private Long id;
    private Long creatorId;
    private LocalDateTime start;
    private Integer durationMinutes;
    private List<Long> usersIds;
    private Room room;

    public Meeting(Long id, Long creatorId, LocalDateTime start, Integer durationMinutes, List<Long> usersIds, Room room) {
        this.id = id;
        this.creatorId = creatorId;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.usersIds = usersIds;
        this.room = room;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public List<Long> getUsersIds() {
        return usersIds;
    }

    public void setUsersIds(List<Long> usersIds) {
        this.usersIds = usersIds;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
