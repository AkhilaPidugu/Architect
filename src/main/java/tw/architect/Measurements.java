package tw.architect;

import java.util.Objects;

public class Measurements<T extends Measurements> {
    String metricType;
    double metricValue;

    public Measurements(String metricType, double metricValue) {
        this.metricType = metricType;
        this.metricValue = metricValue;
    }
    public  void conversionOfMetricType(T metric1,T metric2){
        if(metric1.metricType == LengthMetricTypes.METER.getMetricType() && metric2.metricType == LengthMetricTypes.CENTIMETER.getMetricType()){
            metric2.metricValue = metric2.metricValue/100;
            metric2.metricType = LengthMetricTypes.METER.getMetricType();
            System.out.println(metric1.metricValue);
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
        else if(metric1.metricType == WeightMetricTypes.KILOGRAM.getWeightMetricType() && metric2.metricType == WeightMetricTypes.GRAM.getWeightMetricType()){
            metric2.metricValue = metric2.metricValue/1000;
            metric2.metricType = WeightMetricTypes.KILOGRAM.getWeightMetricType();
        }
        else if(metric1.metricType == WeightMetricTypes.GRAM.getWeightMetricType() && metric2.metricType == WeightMetricTypes.KILOGRAM.getWeightMetricType()){
            metric2.metricValue = metric2.metricValue*1000;
            metric2.metricType = WeightMetricTypes.GRAM.getWeightMetricType();
        }
        else if(metric1.metricType == TemperatureMetricTypes.CELSIUS.getMetricType() && metric2.metricType == TemperatureMetricTypes.FAHRENHEIT.getMetricType()){
            metric2.metricValue = metric2.metricValue-32;
            metric2.metricType = TemperatureMetricTypes.CELSIUS.getMetricType();
        }
        else if(metric1.metricType == TemperatureMetricTypes.KELVIN.getMetricType() && metric2.metricType == TemperatureMetricTypes.CELSIUS.getMetricType()){
            metric2.metricValue = metric2.metricValue+273;
            metric2.metricType = TemperatureMetricTypes.KELVIN.getMetricType();
        }
    }

    @Override
    public boolean equals(Object o) {
        T that = (T) o;
        return Double.compare(that.metricValue, metricValue) == 0 && Objects.equals(metricType, that.metricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricType, metricValue);
    }

    public double add(T metric1, T metric2) { return metric1.metricValue+metric2.metricValue; }

    public double subtract(T metric1, T metric2) {
        return metric1.metricValue-metric2.metricValue;
    }


}
