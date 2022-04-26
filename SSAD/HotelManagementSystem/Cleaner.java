package SSAD.HotelManagementSystem;

public class Cleaner implements Observer{
    @Override
    public void update(Room room) {
        if (room.needCleaning())
        {
            cleanAllRoom(room);
        }
    }

    public void cleanAllRoom(Room room)
    {
        swapTheTowel(room);
        addSomeStaff(room);
        swapTheBedding(room);
    }

    public void swapTheTowel(Room room)
    {
        System.out.println("Room " + room.getId() + " towels are swapped");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void addSomeStaff(Room room)
    {
        System.out.println("Room " + room.getId() + " some staff added");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void swapTheBedding(Room room)
    {
        System.out.println("Room " + room.getId() + " bedding is swapped");
        // depends on android realisation. Maybe, just notification for admin or something more
    }
}
