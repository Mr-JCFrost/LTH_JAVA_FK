package parrot;

public class AfricanParrot extends Parrot {

    //ATTRIBUT




    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    public String getNest() {
        return "hole in a tree";
    }

    public double getSpeed() {

        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }


    private double getLoadFactor() {
        return 9.0;
    }
}
