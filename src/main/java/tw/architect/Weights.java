package tw.architect;

import java.util.Objects;

public class Weights {
    String weightMetricType;
    double weightMetricValue;
    public Weights(String weightMetricType, double weightMetricValue) {
        this.weightMetricType = weightMetricType;
        this.weightMetricValue = weightMetricValue;
    }

    @Override
    public boolean equals(Object o) {
        Weights weights = (Weights) o;
        return Double.compare(weights.weightMetricValue, weightMetricValue) == 0 && Objects.equals(weightMetricType, weights.weightMetricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightMetricType, weightMetricValue);
    }
}
