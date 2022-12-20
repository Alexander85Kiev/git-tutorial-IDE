package module3Arrays;

import hardCases1.Sounds;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {

    String [] DangerBanger = new String[] {"Fobius", "Demius"};
    String [] Unknown = new String[0];

    public String[] getPlanets(String galaxy){
        if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        }else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        }else {
                return new String[0];
        }
    }

    public int roundSpeed(int speed){
        if (speed%10 < 5){
            return speed/10*10;
        } else {return speed/10*10+10;}
    }

    public int calculateNeededFuel(int distance){
        int overYears = (distance - 20) * 5;
        if (distance <= 20){
            return 1000;
        } else {
            return 1000 + overYears;
        }
    }

    public void calculateMaxPower(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a,Math.max(b,c));
        float coeff = 0.0F;
        if (max < 10) {
        coeff = 0.7f;
    } else if (max < 100) {
            coeff = 1.2f;
        }else if (max > 100){
            coeff = 2.1f;
        }
     float maxPower = max * coeff;
        System.out.println(maxPower);
        }

    public String getMyPrizes(int ticket){
        String result = "";
        if (ticket % 10 == 0) {result += "crystall";}
        if (ticket % 10 == 7) {result += " chip";}
        if (ticket > 200) {result += " coin";}
        return result.strip();
    }


    public boolean isHangarOk(int side1, int side2, int price){
        int square = side1*side2;
        int max;
        if(side2>side1) max = side2;
        else max = side1;
        int n = square/max;
        return square >= 1500 && price/square <= 1000 && (float) max/n <= 2.0f;
    }

        public String choosePlanet(long distanceToEarth){
        if (distanceToEarth > 45677){
            return "Earth";
        }else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count){
        switch (fuel){
            case "STAR100":
                return count * 70;

            case "STAR500":
                return count * 120;

            case "STAR1000":
                return count * 200;

            default:
                return count * 50;

        }
    }

    public int calculateDistance(int distance) {
        boolean b = distance >= 0;
        if (b) {
            return distance;
        } else {
            int positive = Math.abs(distance);
            return positive;
        }
    }
    
        //Test output
        public static void main(String[] args) {
            SaveStarShip ship = new SaveStarShip();

            //Should be 10
            System.out.println(ship.calculateDistance(-10));

         //   System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
           // System.out.println(ship.choosePlanet(10));
          //  System.out.println(ship.calculateFuelPrice("STAR100", 10));
          //  System.out.println(ship.roundSpeed(15));
          //  System.out.println(ship.calculateNeededFuel(21));
           // ship.calculateMaxPower();
           // System.out.println(ship.getMyPrizes(250));
            System.out.println(ship.isHangarOk(100, 75, 100000));
        }
    }

