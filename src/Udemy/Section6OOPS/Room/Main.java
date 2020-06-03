package Udemy.Section6OOPS.Room;

public class Main {

    public static void main(String[] args) {
        House house = new House(2, 1, 1);
        Rooms rooms = new Rooms(1, 1, 1, 1);
        BedRoom bedRoom = new BedRoom(true, true, 2, 3);
        bedRoom.hasBeds();
        bedRoom.hasTvs();
        bedRoom.numberOfWardrobes();
        //bedRoom.set();

        
    }
}
