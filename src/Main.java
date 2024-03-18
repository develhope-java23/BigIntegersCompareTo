import java.math.BigInteger;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static BigInteger getMaxValue(List<BigInteger> list) {
        BigInteger result = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(result) > 0) {
                result = list.get(i);
            }
        }
        return result;
    }
}