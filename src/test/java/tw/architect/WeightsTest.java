package tw.architect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeightsTest
{
    @Test
    public void testIf1gramIsEqualTo1gram() {
        Weights weightMetric1 = new Weights(WeightMetricTypes.GRAM.getWeightMetricType(),1);
        Weights weightMetric2 = new Weights(WeightMetricTypes.GRAM.getWeightMetricType(),1);

        boolean actualValue = weightMetric1.equals(weightMetric2);

        assertTrue(actualValue);
    }

    @Test
    public void testIf0Point1kilogramIsEqualTo100grams() {
        Weights weightMetric1 = new Weights(WeightMetricTypes.KILOGRAM.getWeightMetricType(), 0.1);
        Weights weightMetric2 = new Weights(WeightMetricTypes.GRAM.getWeightMetricType(),100);

        weightMetric1.conversionOfWeightMetricType(weightMetric1,weightMetric2);

        assertTrue(weightMetric1.equals(weightMetric2));
    }

    @Test
    public void testIfSumOf10gramsAnd1kilogramIsEqualTo1010grams() {
        Weights weightMetric1 = new Weights(WeightMetricTypes.GRAM.getWeightMetricType(), 10);
        Weights weightMetric2 = new Weights(WeightMetricTypes.KILOGRAM.getWeightMetricType(),1);
        Weights expectedSum= new Weights(WeightMetricTypes.GRAM.getWeightMetricType(), 1010);

       weightMetric2.conversionOfWeightMetricType(expectedSum,weightMetric2);
        double actualValue = weightMetric1.add(weightMetric1,weightMetric2);

        assertEquals(1010,actualValue);
    }

    @Test
    public void testIfDifferenceOf1Point5kilogramAnd500gramIsEqualTo1kilogram() {
        Weights weightMetric1 = new Weights(WeightMetricTypes.KILOGRAM.getWeightMetricType(), 1.5);
        Weights weightMetric2 = new Weights(WeightMetricTypes.GRAM.getWeightMetricType(),500);
        Weights expectedValue= new Weights(WeightMetricTypes.KILOGRAM.getWeightMetricType(), 1);

        weightMetric2.conversionOfWeightMetricType(expectedValue,weightMetric2);
        double actualValue = weightMetric1.subtract(weightMetric1,weightMetric2);

        assertEquals(1,actualValue);
    }
}
