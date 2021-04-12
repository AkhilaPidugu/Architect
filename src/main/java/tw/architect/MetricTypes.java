package tw.architect;

public enum MetricTypes {
    CENTIMETER("Centimeter"),
    METER("Meter"),
    KILOMETER("Kilometer");
    String metricType;

    MetricTypes(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }
}
