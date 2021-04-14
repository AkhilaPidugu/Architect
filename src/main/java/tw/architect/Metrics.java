package tw.architect;

import java.util.Objects;

public class Metrics {
    String metricType;
    double metricValue;

    public Metrics(String metricType, double metricValue) {
        this.metricType = metricType;
        this.metricValue = metricValue;
    }

    @Override
    public boolean equals(Object o) {
        Metrics metric = (Metrics) o;
        return Double.compare(metric.metricValue, metricValue) == 0 && Objects.equals(metricType, metric.metricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricType, metricValue);
    }

    public  void conversionOfMetricType(Metrics metric1,Metrics metric2){
        if(metric1.metricType == LengthMetricTypes.METER.getMetricType() && metric2.metricType == LengthMetricTypes.CENTIMETER.getMetricType()){
            metric2.metricValue = metric2.metricValue/100;
            metric2.metricType = LengthMetricTypes.METER.getMetricType();
        }
        else  if(metric1.metricType == LengthMetricTypes.METER.getMetricType() && metric2.metricType == LengthMetricTypes.KILOMETER.getMetricType()){
            metric2.metricValue = metric2.metricValue*1000;
            metric2.metricType = LengthMetricTypes.METER.getMetricType();
        }
        else  if(metric1.metricType == LengthMetricTypes.CENTIMETER.getMetricType() && metric2.metricType == LengthMetricTypes.KILOMETER.getMetricType()){
            metric2.metricValue = metric2.metricValue*100000;
            metric2.metricType = LengthMetricTypes.CENTIMETER.getMetricType();
        }
        else if(metric1.metricType == LengthMetricTypes.CENTIMETER.getMetricType() && metric2.metricType == LengthMetricTypes.METER.getMetricType()){
            metric2.metricValue = metric2.metricValue*100;
            metric2.metricType = LengthMetricTypes.CENTIMETER.getMetricType();
        }
    }

    public double add(Metrics metric1, Metrics metric2) {
        return metric1.metricValue+metric2.metricValue;
    }

    public double subtract(Metrics metric1, Metrics metric2) {
        return metric1.metricValue-metric2.metricValue;
    }
}