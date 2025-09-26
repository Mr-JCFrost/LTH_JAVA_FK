package parrot;

public class NorwegianBlueParrot extends Parrot {


    //private boolean isNailed;

    public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    public String getNest() {
        if (isNailed == true) {
            return   ("in a cage");
        }else{
            return   ("nowhere");
        }
    }

    public double getSpeed() {
        if (isNailed == true) {
            return   0;
        }else{
            return   getBaseSpeed(voltage);
        }

    }


    //private double getLoadFactor() {
    //    return 9.0;
    //}
}
