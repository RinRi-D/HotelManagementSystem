package SSAD.HotelManagementSystem;

public class RestaurantToRoom implements Observer{
    @Override
    public void update(Room room) {
        switch (room.getFoodOrder())
        {
            case 1:addStaffFridge(room); break;
            case 2:bringTheFood(room); break;
        }
    }

    public void addStaffFridge(Room room)
    {
        System.out.println("Room " + room.getId() + " fridge is filled with staff");
        // depends on android realisation. Maybe, just notification for admin or something more
    }

    public void bringTheFood(Room room)
    {
        System.out.println("Room " + room.getId() + " food is brought");
        // depends on android realisation. Maybe, just notification for admin or something more
    }
}
