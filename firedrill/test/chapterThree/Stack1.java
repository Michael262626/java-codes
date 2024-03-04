package chapterThree;

public class Stack1 {

    private String[] numbers;
    private int size;
    private int peekIndex;
    private boolean isEmpty = true;
    public Stack1(int number){
        numbers= new String[number];

    }
    public void push(String elements) {
        if (peekIndex < numbers.length) {
            numbers[peekIndex++] = elements;
        } else {
            throw new StackOverflowError("Stack over flow error.");
       }
    }
        public boolean isEmpty() {
            return peekIndex == 0;
        }

    public String pop(String michael) {
        if(peekIndex -1 < 0)
            throw new StackOverflowError("Element not found in stack");
        return numbers[--peekIndex];
    }

    public String peek() {
        if(peekIndex - 1 < 0 )
            throw new UnknownError("Stack is currently Empty.");
        return numbers[peekIndex - 1];
    }
    public int getSize(){
        return size;
    }
}
