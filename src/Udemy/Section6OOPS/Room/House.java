package Udemy.Section6OOPS.Room;

public class House {

    private int noOfRooms;
    private int noOfToilets;
    private int noOfKitchens;

    public House(int noOfRooms, int noOfToilets, int noOfKitchens) {
        this.noOfRooms = noOfRooms;
        this.noOfToilets = noOfToilets;
        this.noOfKitchens = noOfKitchens;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public int getNoOfToilets() {
        return noOfToilets;
    }

    public int getNoOfKitchens() {
        return noOfKitchens;
    }
}
