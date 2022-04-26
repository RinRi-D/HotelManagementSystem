package SSAD.HotelManagementSystem;

public class Repair implements Observer{

    @Override
    public void update(Room room) {
        switch (room.getRepairIssues())
        {
            case 1:fixTheTv(room); break;
            case 2:fixTheLights(room); break;
            case 3:fixTheFridge(room); break;
            case 4:fixThePhone(room); break;
        }
    }

    public void fixTheTv(Room room)
    {
        System.out.println("Room " + room.getId() + " fridge is filled with staff");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void fixTheLights(Room room)
    {
        System.out.println("Room " + room.getId() + " fridge is filled with staff");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void fixTheFridge(Room room)
    {
        System.out.println("Room " + room.getId() + " fridge is filled with staff");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void fixThePhone(Room room)
    {
        System.out.println("Room " + room.getId() + " fridge is filled with staff");
        // depends on android realisation. Maybe, just notification for admin or something more
    }
}
