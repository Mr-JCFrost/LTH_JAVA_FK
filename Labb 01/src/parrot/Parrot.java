package parrot;

public class Parrot {

    //ATTRIBUT
    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    //KONSTRUKTOR SOM INNEHÅLLER PARAMETRAR
    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        //ATTRIBUT
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    //METOD
    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new RuntimeException("Should be unreachable");
        };
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getNest() {
        String result = "";
        return switch (type) {
            case EUROPEAN:
                yield ("nest of sticks");
            case AFRICAN:
                yield   ("hole in a tree");
            case NORWEGIAN_BLUE:
                if (this.isNailed == true) {
                    yield   ("in a cage");
                }else{
                    yield   ("nowhere");
                }

            default:
                yield   ("Norway");
        };

    }

/*
    public String getNest() {
        this.String result = "";
        return switch (type) {
            case EUROPEAN : result = "Europe";
            case AFRICAN : result = "Africa";
            case NORWEGIAN_BLUE : result = "Norway";
            default : result = "Should be unreachable";
        };
        return result;
    }*/
}
