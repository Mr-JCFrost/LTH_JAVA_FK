package parrot;

import static parrot.ParrotTypeEnum.EUROPEAN;

public class ParrotFactory {
    public static Parrot getParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
      /*  if (type == EUROPEAN) {
            return  new EuropeanParrot(type, numberOfCoconuts, voltage, isNailed);
        }*/

        return switch (type) {
            case EUROPEAN ->  new EuropeanParrot(type, numberOfCoconuts, voltage, isNailed);
            case AFRICAN ->  new AfricanParrot(type, numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE ->  new NorwegianBlueParrot(type, numberOfCoconuts, voltage, isNailed);
            default -> throw new RuntimeException("Should be unreachable");
        };





    }
}
