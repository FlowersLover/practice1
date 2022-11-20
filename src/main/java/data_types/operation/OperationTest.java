package data_types.operation;

import org.testng.annotations.Test;

import static data_types.point.PointsTest.*;
import static org.testng.Assert.*;

public class OperationTest {

    @Test
    public void testApply() {
        IdenticalOperation identicalOperation = new IdenticalOperation();
        SqrtOperation sqrtOperation = new SqrtOperation();
        TangentOperation tangentOperation = new TangentOperation();
        assertEquals(identicalOperation.apply(5.6), 5.6);
        assertEquals(identicalOperation.apply(POSITIVE_INFINITY), POSITIVE_INFINITY);
        assertEquals(sqrtOperation.apply(81.0), 9.0, aproximation);
        assertEquals(sqrtOperation.apply(NEGATIVE_INFINITY), NaN);
        assertEquals(tangentOperation.apply(Math.PI), 0, aproximation);
        assertEquals(tangentOperation.apply(NEGATIVE_INFINITY), NaN);
    }

    @Test
    public void testApplyTriple() {
    }
}