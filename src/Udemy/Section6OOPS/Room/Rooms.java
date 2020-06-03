package Udemy.Section6OOPS.Room;

public class Rooms extends House{

    private int noOfBedrooms;
    private int noOfLivingRooms;

    public Rooms( int noOfToilets, int noOfKitchens, int noOfBedrooms, int noOfLivingRooms) {
        super(1, noOfToilets, noOfKitchens);
        this.noOfBedrooms = noOfBedrooms;
        this.noOfLivingRooms = noOfLivingRooms;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public int getNoOfLivingRooms() {
        return noOfLivingRooms;
    }
}
