package BusinessLayer;

// import java.io.FileNotFoundException;
// import java.util.*;

public class Event {

    private String eventType;
    private String eventDateandTime;
    private String eventAddress;
    private int eventNumPeople;
    private String eventDecor;

    public String getEventType() {
        return eventType;
    }

    public String getEventDecor() {
        return eventDecor;
    }

    public void setEventDecor(String eventDecor) {
        this.eventDecor = eventDecor;
    }

    public int getEventNumPeople() {
        return eventNumPeople;
    }

    public void setEventNumPeople(int eventNumPeople) {
        this.eventNumPeople = eventNumPeople;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getEventDateandTime() {
        return eventDateandTime;
    }

    public void setEventDateandTime(String eventDateandTime) {
        this.eventDateandTime = eventDateandTime;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Event (String eventType, String eventDateandTime, String eventAddress, int eventNumPeople,String eventDecor)
    {

        this.eventType = eventType;
        this.eventDateandTime = eventDateandTime;
        this.eventAddress = eventAddress;
        this.eventNumPeople = eventNumPeople;
        this.eventDecor = eventDecor;

    }



}