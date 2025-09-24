package parrot;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    //NYA TEST

    @Test
    public void  getNestLocationAfricanParrot() {
        //Raden nedan "tillverkar" min Parrot
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.AFRICAN, 0, 3.3, false);
        assertEquals( "hole in a tree", parrot.getNest() );
    }


    @Test
    public void getNestLocationEuropeanParrot() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.EUROPEAN, 0, 3.3, false);
        assertEquals( "nest of sticks", parrot.getNest() );
    }


    @Test
    public void getNestLocationNorwegianBlueParrot_not_nailed() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 5, false);
        assertEquals( "nowhere", parrot.getNest() );
    }

    @Test
    public void getNestLocationNorwegianBlueParrot_nailed() {
        Parrot parrot = ParrotFactory.getParrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0,5, true);
        assertEquals( "in a cage", parrot.getNest() );
    }
}

