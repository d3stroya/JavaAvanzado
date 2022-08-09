package designPatterns.structural.facade;

/**
 * Whe have an intelligent house with some devices:
 *  Lights
 *  Thermostat
 *  Radio
 * ...and some modes whiches change the state of devices.
 * 1) When entering home:
 *      hall and kitchen lights turn on
 *      radio turns on in a specific channel and volume
 *      thermostat turns on 22º
 * 2) When going out:
 *      all devices turn off
 * 3) When we wake up:
 *      room1 light turns on with specific color and brigth
 *      thermostar turns on 20º for 30 minutes
 *      radio turns on in a specific channel and volume
 *
 * So here, implementing facade pattern design, we create those 3 modes.
 * Then, we call them in Main and show each device with their attributes.
 */
public class IntelligentHouse {
    DomoticFacade domoticFacade = new DomoticFacade();

    public IntelligentHouse() {
    }

    public String enter() {
        domoticFacade.mode("enter");
        return "MODE: Entering...";
    }

    public String out() {
        domoticFacade.mode("out");
        return "MODE: Getting out...";
    }

    public String wakeUp() {
        domoticFacade.mode("wake up");
        return "MODE: Wake up!";
    }

    @Override
    public String toString() {
        return "IntelligentHouse{" +
                "domoticFacade=" + domoticFacade +
                "}\n";
    }
}
