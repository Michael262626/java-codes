package chapterThree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoloticalZonesTest {
    @Test
    void test(){
        assertEquals(6, GeoPoliticalZones.values().length);
        System.out.println(Arrays.toString(GeoPoliticalZones.values()));
    }
    @Test
    void testThatYouCanFinEachGeoPoliticalZones() {
        assertEquals(GeoPoliticalZones.NORTH_CENTRAL, FindGeo.findGeo("FCT"));
    }
}
