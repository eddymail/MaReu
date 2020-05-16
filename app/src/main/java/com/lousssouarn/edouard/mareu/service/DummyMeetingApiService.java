package com.lousssouarn.edouard.mareu.service;
import com.lousssouarn.edouard.mareu.di.DI;
import com.lousssouarn.edouard.mareu.dialog.FilterDialogFragment;
import com.lousssouarn.edouard.mareu.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class DummyMeetingApiService implements MeetingApiService {

    private List<Meeting> meetings = DummyMeetingGenerator.generateMeetings();
    private long mStartDate;
    private String mEndDate;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Meeting> getMeetings() {
        return meetings;
    }

    /**
     * {@inheritDoc}
     * @param meeting
     */
    @Override
    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    @Override
    public List<Meeting> getMeetingsByRoomName(String roomName) {
        List<Meeting> result = new ArrayList<>();
        if(roomName.equals("Toutes les salles")){
            return meetings;
        }
        for(Meeting meeting : meetings) {
            if(meeting.getRoomName().equals(roomName)){
                result.add(meeting);
            }
        }
        return result;
    }

    @Override
    public List<Meeting> getMeetingsByDate(String date) {
        List<Meeting> result = new ArrayList<>();
        for(Meeting meeting : meetings) {
            if(meeting.getDate().equals(date)){
                result.add(meeting);
            }
        }
        return result;
    }
}
