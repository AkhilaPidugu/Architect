package tw.architect;

import org.junit.jupiter.api.Test;

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
}
