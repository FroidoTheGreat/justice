import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMeteor {
    @Test
    public void testMeteor() {
        Meteor meteor = new Meteor(100.0, 1);
        assertEquals(100.0, meteor.getDistanceFromEarth(), 0.01);
        assertEquals(1, meteor.getSpeed(), 0.01);
    }

    @Test
    public void testCompareTo() {
        Meteor meteor1 = new Meteor(100.0, 1);
        Meteor meteor2 = new Meteor(100.0, 2);
        Meteor meteor3 = new Meteor(200.0, 1);

        assertEquals(-1, meteor1.compareTo(meteor2));
        assertEquals(1, meteor2.compareTo(meteor1));
        assertEquals(1, meteor1.compareTo(meteor1));
        assertEquals(1, meteor2.compareTo(meteor3));
    }
}
