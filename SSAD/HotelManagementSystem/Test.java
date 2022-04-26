package SSAD.HotelManagementSystem;

public class Test {
    public static void main(String[] args) {
        Administrator administrator = new Administrator();
        Hotel hotel = new Hotel(administrator,2);
        Cleaner cleaner = new Cleaner();
        Repair repair = new Repair();
        RestaurantToRoom restaurantToRoom = new RestaurantToRoom();
        hotel.addObserver(cleaner);
        hotel.addObserver(repair);
        hotel.addObserver(restaurantToRoom);

        System.out.println("Rooms are ok");
        for (Room r: hotel.rooms)
        {
            r.setClean(false);
            r.setClean(true);
            r.setFoodOrder(1);
            r.setFoodOrder(0);
        }
    }
}
