package tw.architect;

public enum TemperatureMetricTypes {
    CELSIUS("Celsius"),
    FAHRENHEIT("Fahrenheit"),
    KELVIN("Kelvin");
    String metricType;

    TemperatureMetricTypes(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }
}
