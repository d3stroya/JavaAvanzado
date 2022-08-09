package designPatterns.structural.facade;

public class DomoticFacade {
    Radio radio = new Radio();
    Lights lights = new Lights();
    Thermostat thermostat = new Thermostat();

    public void mode(String mode) {
        radio.turnRadio(mode);
        lights.tunLights(mode);
        thermostat.turnThermostat(mode);
    }

    @Override
    public String toString() {
        return "DomoticFacade{\n" +
                "radio=" + radio +
                ",\n lights=" + lights +
                ",\n thermostat=" + thermostat +
                '}';
    }
}
