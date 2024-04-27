
public class Meteor implements Comparable<Meteor> {
    private double distanceFromEarth;
    private double speed;

    public Meteor(double distanceFromEarth, double speed) {
        this.distanceFromEarth = distanceFromEarth;
        this.speed = speed;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Meteor other) {
        double difference = this.distanceFromEarth*this.getSpeed() - other.distanceFromEarth*other.getSpeed();
        
        // I removed the possibility of them being equal because it prevents duplicates in the treeset
        if (difference < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return "Meteor: " + distanceFromEarth + " " + speed;
    }
}
