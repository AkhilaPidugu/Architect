package tw.architect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemperatureTest {

    @Test
    public void testIf0CelsiusIsEqualTo32Fahrenheit() {
        Temperature temperature1 = new Temperature(TemperatureMetricTypes.CELSIUS.getMetricType(), 0);
        Temperature temperature2= new Temperature(TemperatureMetricTypes.FAHRENHEIT.getMetricType(), 32);
        temperature1.conversionOfMetricType(temperature1,temperature2);

        boolean actualValue = temperature1.equals(temperature2);

        assertTrue(actualValue);
    }

    @Test
    public void testIf0KelvinIsEqualToMinus273Celsius() {
        Temperature temperature1 = new Temperature(TemperatureMetricTypes.KELVIN.getMetricType(), 0);
        Temperature temperature2= new Temperature(TemperatureMetricTypes.CELSIUS.getMetricType(), -273);
        temperature1.conversionOfMetricType(temperature1,temperature2);

        boolean actualValue = temperature1.equals(temperature2);

        assertTrue(actualValue);
    }
}
