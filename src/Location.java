public class Location {
    double longitude;
    double latitude;

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "{" +
                "longitude = " + longitude +
                ", latitude = " + latitude +
                '}';
    }
}
