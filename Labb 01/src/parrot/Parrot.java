package parrot;

public abstract class Parrot {

    //ATTRIBUT
    private final ParrotTypeEnum type;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    //KONSTRUKTOR SOM INNEHÅLLER PARAMETRAR
    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        //ATTRIBUT
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }



    //METOD
    public abstract double getSpeed();
    /*{
        /*return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new RuntimeException("Should be unreachable");
        };
    }*/

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    protected static double getBaseSpeed() {
        return 12.0;
    }



    public abstract String getNest();
    // public String getNest() {}
    /*public String getNest() {
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

    }*/

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
