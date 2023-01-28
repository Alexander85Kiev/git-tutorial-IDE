package module5;

public class SpaceShip {
    private String name;

    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() < 100) {
            this.name = name;
        }
    }

    private String getSerialNumber() {
        return serialNumber;
    }

    private void setSerialNumber(String serialNumber) {
        if (serialNumber.contains("SN") & serialNumber.length() == 8) {
            this.serialNumber = serialNumber;
        }
    }

    public void printInfo(){

        System.out.printf("Name is "+ name + ", serial number is " + serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
//        ship.setName("Walker");
//        System.out.println(ship.getName()); //Should be Walker
//
//        ship.setName("");
//        System.out.println(ship.getName()); //Should be Walker, empty value ignored
//
//        ship.setName("Voyager ".repeat(100));
//        System.out.println(ship.getName()); //Should be Walker, too long value ignored
        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
   }
}
