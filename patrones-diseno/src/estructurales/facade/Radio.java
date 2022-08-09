package designPatterns.structural.facade;

public class Radio {
    // ATTRIBUTES
    private boolean radioOn;
    private Double channel;
    private Integer volume;

    // CONSTRUCTORS
    public Radio() {
    }

    public Radio(boolean radioOn, Double channel, Integer volume) {
        this.radioOn = radioOn;
        this.channel = channel;
        this.volume = volume;
    }

    // GETTER AND SETTER
    public boolean isRadioOn() {
        return radioOn;
    }

    public void setRadioOn(boolean radioOn) {
        this.radioOn = radioOn;
    }

    public Double getChannel() {
        return channel;
    }

    public void setChannel(Double channel) {
        this.channel = channel;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    // METHODS
    public String turnRadio(String mode) {
        switch (mode) {
            case "enter" -> {
                setRadioOn(true);
                setVolume(70);
                setChannel(97.3);
            }
            case "out" -> {
                setRadioOn(false);
                setChannel(null);
                setVolume(null);
            }
            case "wake up" -> {
                setRadioOn(true);
                setVolume(20);
                setChannel(90.6);
            }
        }
        return toString();
    }

    // TO STRING
    @Override
    public String toString() {
        return "Radio{" +
                "radioOn=" + radioOn +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
