package ge.edu.btu.BattleShips.Vessels;

import ge.edu.btu.BattleShips.Exceptions.BattleshipsException;

public abstract class Ship {

    private int force;

    private String name;


    public Ship (){}

    public Ship(int force, String name) {
        this.force = force;
        this.name = name;
    }

    public int getForce(){
        return force;
    }

    public void setForce(int force){
        this.force=force;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }



    public abstract int VelocityCounter();

    public abstract int TimeCounter();
}
