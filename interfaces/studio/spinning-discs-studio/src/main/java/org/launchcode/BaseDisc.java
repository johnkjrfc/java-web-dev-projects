package org.launchcode;

public class BaseDisc {
    private String name;
    private String format;
    private double spinRate;

    public BaseDisc(String name, String format, double spinRate) {
        this.name = name;
        this.format = format;
        this.spinRate = spinRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(double spinRate) {
        this.spinRate = spinRate;
    }
    public abstract String describe();
}
