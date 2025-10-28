package ClassModeling;

import java.util.Objects;

public class House {
    private String address;
    private String postCode;
    private double metricArea;

    public House() {
        this.address = "n/a";
        this.postCode = "n/a";
        this.metricArea = 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public double getMetricArea() {
        return metricArea;
    }

    public void setMetricArea(double metricArea) {
        this.metricArea = metricArea;
    }
}
