package Udemy.Section6OOPS.Room;

public class BedRoom extends Rooms {

    private boolean hasTvs;
    private boolean hasBeds;
    private int noOfChairs;
    private int noOfWardrobes;

    public BedRoom( boolean hasTvs, boolean hasBeds, int noOfChairs, int noOfWardrobes) {
        super(1, 1, 1, 1);
        this.hasTvs = hasTvs;
        this.hasBeds = hasBeds;
        this.noOfChairs = noOfChairs;
        this.noOfWardrobes = noOfWardrobes;
    }

    public boolean isTvs() {
        return hasTvs;
    }

    public boolean isBeds() {
        return hasBeds;
    }

    public int getNoOfChairs() {
        return noOfChairs;
    }

    public int getNoOfWardrobes() {
        return noOfWardrobes;
    }

    public void hasTvs(){
        System.out.println("BedRoom, hasTvs called, does it have TV? "+ this.isTvs());
    }
    public void hasBeds(){
        System.out.println("BedRoom, hasTvs called does it have Bed? "+ this.isBeds());
    }
    public void chairs(){
        System.out.println("BedRoom, how many chairs does bedroom have? "+ this.getNoOfChairs());
    }
    public void numberOfWardrobes(){
        System.out.println("BedRoom, how many number of wardrobes? "+ getNoOfWardrobes());
    }
}
