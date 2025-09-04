package parrot;

public class ParrotFactory {
    public static Parrot getParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return new Parrot(type, numberOfCoconuts, voltage, isNailed);
    }
}
