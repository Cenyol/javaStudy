package com.cenyol.study.designPartner.P01_ObserverPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class DataObj {
    private float temp;
    private float humidity;
    private float presssure;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPresssure() {
        return presssure;
    }

    public void setPresssure(float presssure) {
        this.presssure = presssure;
    }

    @Override
    public String toString() {
        return "DataObj{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", presssure=" + presssure +
                '}';
    }
}
