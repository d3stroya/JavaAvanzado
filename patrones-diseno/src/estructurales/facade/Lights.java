package designPatterns.structural.facade;

public class Lights {
    // ATTRIBUTES
    private boolean kitchenLight;
    private boolean hallLight;
    private boolean livingroomLight;
    private boolean room1Light;
    private boolean room2Light;
    private boolean bathroomLight;
    private Integer bright;
    private String color;

    // CONSTRUCTORS
    public Lights() {
    }

    public Lights(boolean kitchenLight, boolean hallLight, boolean livingroomLight, boolean room1Light, boolean room2Light, boolean bathroomLight, Integer bright, String color) {
        this.kitchenLight = kitchenLight;
        this.hallLight = hallLight;
        this.livingroomLight = livingroomLight;
        this.room1Light = room1Light;
        this.room2Light = room2Light;
        this.bathroomLight = bathroomLight;
        this.bright = bright;
        this.color = color;
    }

    // GETTER AND SETTER
    public boolean isKitchenLight() {
        return kitchenLight;
    }

    public void setKitchenLight(boolean kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public boolean isHallLight() {
        return hallLight;
    }

    public void setHallLight(boolean hallLight) {
        this.hallLight = hallLight;
    }

    public boolean isLivingroomLight() {
        return livingroomLight;
    }

    public void setLivingroomLight(boolean livingroomLight) {
        this.livingroomLight = livingroomLight;
    }

    public boolean isRoom1Light() {
        return room1Light;
    }

    public void setRoom1Light(boolean room1Light) {
        this.room1Light = room1Light;
    }

    public boolean isRoom2Light() {
        return room2Light;
    }

    public void setRoom2Light(boolean room2Light) {
        this.room2Light = room2Light;
    }

    public boolean isBathroomLight() {
        return bathroomLight;
    }

    public void setBathroomLight(boolean bathroomLight) {
        this.bathroomLight = bathroomLight;
    }

    public Integer getBright() {
        return bright;
    }

    public void setBright(Integer bright) {
        this.bright = bright;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // METHODS
    public void setAllLightsOff() {
        setRoom1Light(false);
        setLivingroomLight(false);
        setBathroomLight(false);
        setRoom2Light(false);
        setKitchenLight(false);
        setHallLight(false);
        setColor(null);
        setBright(null);
    }
    public String tunLights(String mode) {
        switch (mode) {
            case "enter" -> {
                setBright(50);
                setColor("warm");
                setHallLight(true);
                setKitchenLight(true);
            }
            case "out" -> {
                setAllLightsOff();
            }
            case "wake up" -> {
                setColor("warm");
                setRoom1Light(true);
                setBright(40);
            }
        }
        return toString();
    }

    // TO STRING
    @Override
    public String toString() {
        return "Lights{" +
                "kitchenLight=" + kitchenLight +
                ", hallLight=" + hallLight +
                ", livingroomLight=" + livingroomLight +
                ", room1Light=" + room1Light +
                ", room2Light=" + room2Light +
                ", bathroomLight=" + bathroomLight +
                ", bright=" + bright +
                ", color='" + color + '\'' +
                '}';
    }
}
