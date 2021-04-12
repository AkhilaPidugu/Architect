package tw.architect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetricTest {
    @Test
    public void testIf1centimeterIsEqualTo1centimeter() {
        String metricType = "cm";
        double metricValue = 1;
        Metrics metric1 = new Metrics(metricType,metricValue);
        Metrics metric2 = new Metrics(metricType,metricValue);

        boolean actualValue = metric1.equals(metric2);

        assertTrue(actualValue);
    }
}
