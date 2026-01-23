package lab11.pb2;

import lab11.pb4.Notification;
import lab11.pb4.Observer;

import java.util.ArrayList;

public class Parent extends User implements Observer {
    ArrayList<Notification> notifications = new ArrayList<>();

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Parent: " + super.toString();
    }

    public void update(Notification notification) {
        notifications.add(notification);
    }
}
