package SSAD.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public List<Room> rooms;
    private List<Observer> observers;
    private int numberFreeRooms;
    private Administrator admin;

    Hotel(Administrator admin, int numberOfRooms)
    {
        this.admin = admin;
        rooms = new ArrayList<>();
        observers = new ArrayList<>();
        observers.add(admin);
        numberFreeRooms = numberOfRooms;
        for (int i = 0; i < numberOfRooms; i++) {
            Room room = new Room(i);
            rooms.add(room);
        }
    }


    public int numberFreeRooms()
    {
        return numberFreeRooms;
    }

    public void addObserver(Observer observer)
    {
        observers.add(observer);
        for (Room room:rooms) {
            room.attach(observer);
        }
    }


}
