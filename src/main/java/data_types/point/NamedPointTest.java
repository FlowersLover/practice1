package data_types.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testGetName() {
        NamedPoint namedPoint = new NamedPoint();
        NamedPoint namedPoint1 = new NamedPoint(1,2,3,"A");
        namedPoint.setName("Tom");
        assertEquals(namedPoint.getName(),"Tom");
        namedPoint.setName(null);
        assertEquals(namedPoint.getName(),null);
        assertEquals(namedPoint1.getName(),"A");

    }
    }
