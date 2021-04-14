package tw.architect;

public enum WeightMetricTypes {
    GRAM("Gram"),
    KILOGRAM("Kilogram");
    String weightMetricType;

    WeightMetricTypes(String weightMetricType) {
        this.weightMetricType = weightMetricType;
    }

    public String getWeightMetricType() {
        return weightMetricType;
    }
}
