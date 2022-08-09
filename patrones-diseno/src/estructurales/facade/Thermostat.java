package designPatterns.structural.facade;

public class Thermostat {
    // ATTRIBUTES
    private boolean thermostat;
    private Integer minTemperature;
    private Integer maxTemperature;
    private Integer timer;

    // CONSTRUCTORS
    public Thermostat() {
    }

    public Thermostat(boolean thermostat, Integer minTemperature, Integer maxTemperature, Integer timer) {
        this.thermostat = thermostat;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.timer = timer;
    }

    // GETTER AND SETTER
    public boolean getThermostat() {
        return thermostat;
    }

    public void setThermostat(boolean thermostat) {
        this.thermostat = thermostat;
    }

    public Integer getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Integer minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Integer getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Integer maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Integer getTimer() {
        return timer;
    }

    public void setTimer(Integer timer) {
        this.timer = timer;
    }


    // METHDOS
    public String turnThermostat(String mode) {
        switch (mode) {
            case "enter" -> {
                setThermostat(true);
                setMinTemperature(22);
            }
            case "out" -> {
                setThermostat(false);
                setTimer(0);
                setMinTemperature(null);
                setMaxTemperature(null);
            }
            case "winter" -> {
                setThermostat(true);
                setMinTemperature(19);
            }
            case "summer" -> {
                setThermostat(true);
                setMaxTemperature(25);
            }
            case "wake up" -> {
                setThermostat(true);
                setMinTemperature(20);
                setTimer(30);
            }
        }
        return toString();
    }

    // TO STRING
    @Override
    public String toString() {
        return "Thermostat{" +
                "thermostat=" + thermostat +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", timer=" + timer +
                '}';
    }
}
