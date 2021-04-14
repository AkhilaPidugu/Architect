package tw.architect;

public enum LengthMetricTypes {
    CENTIMETER("Centimeter"),
    METER("Meter"),
    KILOMETER("Kilometer");
    String metricType;

    LengthMetricTypes(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricType() {
        return metricType;
    }
}
