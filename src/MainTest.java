import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private List<BigInteger> createListFromPrimitives (int... values){
        ArrayList<BigInteger> result = new ArrayList<>();

        for (int i : values){
            result.add(BigInteger.valueOf(i));
        }
        return result;
    }

    @Test
    public void testGetMaxValue() {
        List<BigInteger> testList = createListFromPrimitives(1,20,100);
        BigInteger expectedResult = BigInteger.valueOf(100);
        BigInteger actualResult = Main.getMaxValue(testList);
        assertEquals(expectedResult,actualResult);
    }
}