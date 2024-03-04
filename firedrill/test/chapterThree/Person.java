package chapterThree;

import java.util.ArrayList;
import java.util.List;

import static chapterThree.Problem.getName;
import static chapterThree.Problem.getType;


public class Person {
    private final List<Problem> problems = new ArrayList<>();

    public void addProblems(Problem problem) {
        problems.add(problem);
    }

    public boolean isSolved(Problem problem){
        for(Problem solved : problems){
           if(problem.equals(solved)) return false;
        }
        return true;
    }


    public String reCount(String name, Problem...problem) {
        String result = "";
        int count = 0;
        for(Problem problems : problems) {
            result += getName() + getType();
            count++;
        }
        return result;
    }
}