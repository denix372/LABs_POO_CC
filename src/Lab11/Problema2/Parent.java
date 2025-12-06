package Lab11.Problema2;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

public class Parent extends User implements Observer {
    private List<Notification> notifications = new ArrayList<>();

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void update(Notification notification) {
        notifications.add(notification);
        System.out.println("Parinte notificat: " + this + " -> " + notification);
    }
}