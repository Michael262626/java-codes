package chapterThree;

public class FindGeo {
    public static GeoPoliticalZones findGeo(String state){
        for(var zones : GeoPoliticalZones.values()) {
            for (int states = 0; states < zones.getStates().length; states++) {
                if (state.equals(zones.getStates()[states])) {
                    return zones;
                }
            }
        }
        return null;
    }
}
