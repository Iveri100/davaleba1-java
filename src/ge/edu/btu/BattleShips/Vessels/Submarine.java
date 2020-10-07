package ge.edu.btu.BattleShips.Vessels;

import ge.edu.btu.BattleShips.Vessels.Ship;

public class Submarine extends Ship {

    private static final int VelocityCoefficient2 = 14;
    private static final int TimeCoefficient2 = 18;
    private static final int SubmarineSpecialCoefficient = 11;

    public Submarine() {}

    public Submarine(int force, String name) {
        super(force, name);
    }

    @Override
    public int VelocityCounter(){
        return getForce() + VelocityCoefficient2 + TimeCoefficient2;
    }

    @Override
    public int TimeCounter(){
        return getForce() * SubmarineSpecialCoefficient * TimeCoefficient2;
    }
}
