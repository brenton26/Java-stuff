import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int location_ID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int location_ID, String description){
        this.location_ID = location_ID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public int getLocation_ID() { return location_ID; }
    public Map<String, Integer> getExits() { return exits; }
    public String getDescription() { return description; }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }
}
