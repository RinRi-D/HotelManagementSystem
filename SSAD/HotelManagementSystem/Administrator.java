package SSAD.HotelManagementSystem;

public class Administrator implements Observer{
    @Override
    public void update(Room room) {
        int adminIssues = room.getAdminIssues();
        switch (adminIssues) {
            case 1 : evictFromRoom(room); break;
            case 2 : bookTheRoom(room); break;
            case 3 : complaint(room); break;
        }
    }

    public void evictFromRoom(Room room)
    {
        System.out.println("Room " + room.getId() + ": guests are evicted");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void bookTheRoom(Room room)
    {
        System.out.println("Room " + room.getId() + ": guest are booked");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void complaint(Room room)
    {
        System.out.println("Room " + room.getId() + ": guest are complaining");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

}
