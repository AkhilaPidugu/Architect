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

    public void conversionOfWeightMetricType(Weights weightMetric1, Weights weightMetric2) {
        if(weightMetric1.weightMetricType == WeightMetricTypes.KILOGRAM.getWeightMetricType() && weightMetric2.weightMetricType == WeightMetricTypes.GRAM.getWeightMetricType()){
            weightMetric2.weightMetricValue = weightMetric2.weightMetricValue/1000;
            weightMetric2.weightMetricType = WeightMetricTypes.KILOGRAM.getWeightMetricType();
        }
        else if(weightMetric1.weightMetricType == WeightMetricTypes.GRAM.getWeightMetricType() && weightMetric2.weightMetricType == WeightMetricTypes.KILOGRAM.getWeightMetricType()){
            weightMetric2.weightMetricValue = weightMetric2.weightMetricValue*1000;
            weightMetric2.weightMetricType = WeightMetricTypes.GRAM.getWeightMetricType();
        }
    }

    public double add(Weights weightMetric1, Weights weightMetric2) {
        return weightMetric1.weightMetricValue+weightMetric2.weightMetricValue;
    }
}
