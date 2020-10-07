package ge.edu.btu.BattleShips;

import ge.edu.btu.BattleShips.Vessels.Ship;
import ge.edu.btu.BattleShips.Vessels.Aircraftcarrier;
import ge.edu.btu.BattleShips.Vessels.Dreadnought;
import ge.edu.btu.BattleShips.Vessels.Submarine;

public class Runner {
    private static Ship ship = new Aircraftcarrier(600, "Missouri");
    private static Ship ship1 = new Dreadnought(550, "Bismarck");
    private static Ship ship2 = new Submarine(620, "Typhoon");

    public static void main(String[] args){
        System.out.println(ship.TimeCounter());
        System.out.println(" above is the time for/" + ship.getName() + "/to reach max.speed!");
        System.out.println(ship.VelocityCounter());
        System.out.println(" above is the maximum speed of/" + ship.getName() + "/");

        System.out.println(ship1.TimeCounter());
        System.out.println(" above is the time for/" + ship1.getName() + "/to reach max.speed!");
        System.out.println(ship1.VelocityCounter());
        System.out.println("above is the maximum speed of/" + ship1.getName() + "/");

        System.out.println(ship2.TimeCounter());
        System.out.println("above is the time for/" + ship2.getName() + "/to reach max.speed!");
        System.out.println(ship2.VelocityCounter());
        System.out.println("above is the maximum speed of/" + ship2.getName() + "/");
    }
}
