package chapterThree;

import java.util.HashSet;

public class Set {
    private boolean isEmpty;
    private int number;
    private java.util.Set<String> names = new HashSet<>(5);

    public boolean isEmpty() {
        return number == 0;
    }

    public void add(String elements) {
        if(number < names.size()){ this.add(elements);}
        else {
        throw new IllegalArgumentException("Elements is more than the size");}
    }
}
