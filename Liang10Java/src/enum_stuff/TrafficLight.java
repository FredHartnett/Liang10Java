package enum_stuff;

public enum TrafficLight {
    RED ("please stop"), GREEN ("please go"), YELLOW ("please use caution");

    private String description;

    private TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
