import java.util.TreeSet;

public class MeteorTracker {
    private TreeSet<Meteor> meteors = new TreeSet<Meteor>();

    public static void main(String[] args) {
        MeteorTracker tracker = new MeteorTracker();
        Meteor meteor1 = new Meteor(100.0, 1);
        Meteor meteor2 = new Meteor(100.0, 2);
        Meteor meteor3 = new Meteor(200.0, 1);

        tracker.addMeteor(meteor1);
        tracker.addMeteor(meteor2);
        tracker.addMeteor(meteor3);

        System.out.println(tracker);
    }

    public void addMeteor(Meteor meteor) {
        meteors.add(meteor);
    }

    public Meteor getClosestMeteor() {
        return meteors.first();
    }

    public Meteor PewPew() {
        return meteors.pollFirst();
    }

    public String toString() {
        String s = "";
        int count = 1;
        for (Meteor meteor : meteors) {
            count ++;
            s += meteor + "\n";
        }
        s += "Total of: " + count + " meteors \n";
        return s;
    }

    public Object getNumberOfMeteors() {
        return meteors.size();
    }
}