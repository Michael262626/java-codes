package chapterThree;

public class Problem {
    private static String name;
    private static Type type;
    private boolean isSolved;

    public Problem(String name, Type type){
        this.type = type;
        this.name = name;
    }
    public static String getName(){
        return name;
    }
    public static Type getType(){
        return type;
    }
}
