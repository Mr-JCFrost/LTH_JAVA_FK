package parrot;

public class EuropeanParrot extends Parrot {


    public EuropeanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    public String getNest() {
        return "nest of sticks";
    }

    public double getSpeed() {
        return Parrot.getBaseSpeed();
    }

}
