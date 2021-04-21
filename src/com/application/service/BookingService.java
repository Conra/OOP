package com.application.service;

import com.application.model.Meeting;

import java.time.LocalDateTime;
import java.util.List;

public class BookingService {
    private List<Meeting> meetings;

    public BookingService(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    protected Boolean isOverlapped(Meeting meeting1, Meeting meeting2){
        LocalDateTime start1 = meeting1.getStart();
        Integer duration1 = meeting1.getDurationMinutes();
        LocalDateTime start2 = meeting2.getStart();
        Integer duration2 = meeting2.getDurationMinutes();

        if(start1.isAfter(start2) && start1.isBefore(start2.plusMinutes(duration2))
                || start1.isBefore(start2) && start2.isBefore(start1.plusMinutes(duration1)))
            return Boolean.TRUE;
        else return Boolean.FALSE;
    }

    protected Boolean checkOverlapping(Meeting meeting){
        if (meetings.stream().anyMatch(meet -> meet.getRoom().equals(meeting.getRoom()) && isOverlapped(meeting, meet)))
            return Boolean.TRUE;
        else return Boolean.FALSE;
    }

    public Boolean validateMeeting(Meeting meeting){
        if ((15 <= meeting.getDurationMinutes()) && (meeting.getDurationMinutes() <= 180))
            return this.checkOverlapping(meeting);
        else return Boolean.FALSE;
    }


}
