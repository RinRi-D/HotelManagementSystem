package SSAD.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private List<Observer> observers;
    private int repairIssues;
    private int foodOrder;
    private int adminIssues;
    private Boolean clean;

    Room(int id, List<Observer> observers)
    {
        this(id);
        this.observers = observers;
    }

    Room(int id)
    {
        this.id = id;
        repairIssues = 0;
        foodOrder = 0;
        adminIssues = 0;
        clean = true;
        this.observers = new ArrayList<>();
    }

    public int getRepairIssues()
    {
        return repairIssues;
    }

    public int getId()
    {
        return id;
    }

    public int getFoodOrder()
    {
        return foodOrder;
    }

    public int getAdminIssues()
    {
        return adminIssues;
    }

    public boolean needCleaning()
    {
        return !clean;
    }

    public void setRepairIssues(int repairIssues)
    {
        this.repairIssues = repairIssues;
        notifyAllObservers();
    }

    public void setAdminIssues(int adminIssues)
    {
        this.adminIssues = adminIssues;
        notifyAllObservers();
    }

    public void setFoodOrder(int foodOrder)
    {
        this.foodOrder = foodOrder;
        notifyAllObservers();
    }

    public void setClean(boolean clean)
    {
        this.clean = clean;
        notifyAllObservers();
    }

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void notifyAllObservers()
    {
        for (Observer observer:observers) {
            observer.update(this);
        }
    }


}
