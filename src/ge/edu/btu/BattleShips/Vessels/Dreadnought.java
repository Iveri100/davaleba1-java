package ge.edu.btu.BattleShips.Vessels;

import ge.edu.btu.BattleShips.Exceptions.BattleshipsException;
import ge.edu.btu.BattleShips.Vessels.Ship;

public class Dreadnought extends Ship {

    private static final int VelocityCoefficient1 = 19;
    private static final int TimeCoefficient1 = 21;
    private static final int SomeOtherCoefficient = 8;

    public Dreadnought() {}

    public Dreadnought(int force, String name)  {
        super(force, name);
    }

    @Override
    public int VelocityCounter(){
        return getForce() + VelocityCoefficient1;
    }

    @Override
    public int TimeCounter(){
        return TimeCoefficient1 * SomeOtherCoefficient + getForce();
    }
}
