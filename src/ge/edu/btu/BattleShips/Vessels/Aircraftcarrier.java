package ge.edu.btu.BattleShips.Vessels;

import ge.edu.btu.BattleShips.Exceptions.BattleshipsException;
import ge.edu.btu.BattleShips.Vessels.Ship;

public class Aircraftcarrier extends Ship {

    private static final int VelocityCoefficient = 10;
    private static final int TimeCoefficient = 15;

    public Aircraftcarrier() {}

    public Aircraftcarrier(int force, String name) {
        super(force, name);
    }

    @Override
    public int VelocityCounter(){
        return getForce() * VelocityCoefficient;
    }

    @Override
    public int TimeCounter(){
        return getForce() / TimeCoefficient;
    }
}
