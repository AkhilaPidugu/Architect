package tw.architect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MetricTest {
    @Test
    public void testIf1centimeterIsEqualTo1centimeter() {
        Metrics metric1 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 1);
        Metrics metric2 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 1);

        boolean actualValue = metric1.equals(metric2);

        assertTrue(actualValue);
    }

    @Test
    public void testIf1meterIsEqualTo100centimeters() {
        Metrics metric1 = new Metrics(MetricTypes.METER.getMetricType(), 1);
        Metrics metric2 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 100);

        metric1.conversionOfMetricType(metric1,metric2);

        assertTrue(metric1.equals(metric2));
    }

    @Test
    public void testIf100metersIsEqualTo0Point1kilometers() {
        Metrics metric1 = new Metrics(MetricTypes.METER.getMetricType(), 100);
        Metrics metric2 = new Metrics(MetricTypes.KILOMETER.getMetricType(), 0.1);

        metric1.conversionOfMetricType(metric1,metric2);

        assertTrue(metric1.equals(metric2));
    }

    @Test
    public void testIfSumOf1meterAnd100centimeterIsEqualTo2meters() {
        Metrics metric1 = new Metrics(MetricTypes.METER.getMetricType(), 1);
        Metrics metric2 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 100);
        Metrics expectedSum= new Metrics(MetricTypes.METER.getMetricType(), 2);

        metric2.conversionOfMetricType(expectedSum,metric2);
        double actualValue = metric1.add(metric1,metric2);

        assertEquals(2,actualValue);

    }

    @Test
    public void testIfSumOf200centimeterAnd1kilometerIsEqualTo100200centimeter() {
        Metrics metric1 = new Metrics(MetricTypes.CENTIMETER.getMetricType(), 200);
        Metrics metric2 = new Metrics(MetricTypes.KILOMETER.getMetricType(), 1);
        Metrics expectedSum= new Metrics(MetricTypes.CENTIMETER.getMetricType(), 100200);

        metric2.conversionOfMetricType(expectedSum,metric2);
        double actualValue = metric1.add(metric1,metric2);

        assertEquals(100200,actualValue);

    }
}
