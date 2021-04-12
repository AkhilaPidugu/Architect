package tw.architect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetricTest {
    @Test
    public void testIf1centimeterIsEqualTo1centimeter() {
        Metrics metric1 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 1);
        Metrics metric2 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 1);

        boolean actualValue = metric1.equals(metric2);

        assertTrue(actualValue);
    }
}
