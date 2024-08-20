package HotelbookingSystem;

public class Main {
    public static void main(String[] args) {
        StandardRoom standardRoom = new StandardRoom(101);
        DeluxeRoom deluxeRoom = new DeluxeRoom(202);
        SuiteRoom suiteRoom = new SuiteRoom(303);

        standardRoom.Roombook(3, 123456789012L, "Malik colony nawabshah");
        deluxeRoom.Roombook(2, 34534784995L, "Ashraf colony nawabsha");
        suiteRoom.Roombook(5, 4356464859595L, "Doctor colony nawabshah");
    }
}
