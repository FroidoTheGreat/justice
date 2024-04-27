import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMeteorTracker {
    @Test
    public void testMeteorTracker() {
        MeteorTracker tracker = new MeteorTracker();
        Meteor meteor1 = new Meteor(100.0, 1);
        Meteor meteor2 = new Meteor(100.0, 2);
        Meteor meteor3 = new Meteor(200.0, 1);

        tracker.addMeteor(meteor1);
        tracker.addMeteor(meteor2);
        assertEquals(tracker.getNumberOfMeteors(), 2);
        tracker.addMeteor(meteor3);
        assertEquals(tracker.getNumberOfMeteors(), 3);

        assertEquals(meteor1, tracker.getClosestMeteor());
        assertEquals(meteor1, tracker.PewPew());
        assertEquals(meteor2, tracker.getClosestMeteor());
        assertEquals(meteor2, tracker.PewPew());
        assertEquals(meteor3, tracker.getClosestMeteor());
        assertEquals(meteor3, tracker.PewPew());
    }
}
