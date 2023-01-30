package chapter3;

public class Stack3_1 {

    private int[] lastIndexes = { -3, -2, -1 };
    private int[] stackArray;

    Stack3_1(int[] stackArray) {
        this.stackArray = stackArray;
    }

    Stack3_1(int val) {
        this(new int[val]);
    }

    private void pushToStack(int index, int value) {
        int lastIndex = lastIndexes[--index] + 3;
        stackArray[lastIndex] = value;
        lastIndexes[index] = lastIndex;
    }

    private int popFromStack(int index) {
        int lastIndex = lastIndexes[--index];
        int value = stackArray[lastIndex];
        stackArray[lastIndex] = 0;
        lastIndexes[index] = lastIndex - 3;
        return value;
    }

    private int peekFromStack(int index) {
        int lastIndex = lastIndexes[--index];
        int value = stackArray[lastIndex];
        return value;
    }

    private void printStack() {
        for (int i = 0; i <= findMaxIndex(); i++) {
            System.out.print(stackArray[i] + ",");

        }
    }

    private int findMaxIndex() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lastIndexes.length; i++) {
            if (lastIndexes[i] > max) {
                max = lastIndexes[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Stack3_1 stack = new Stack3_1(10);
        stack.pushToStack(1, 10);
        stack.pushToStack(2, 40);
        stack.pushToStack(3, 70);
        stack.pushToStack(1, 20);
        stack.pushToStack(2, 50);
        stack.pushToStack(1, 30);
        stack.pushToStack(2, 60);

        // System.out.println("value: " + stack.popFromStack(1));
        // System.out.println("value: " + stack.popFromStack(1));
        //
        stack.pushToStack(1, 100);
        stack.pushToStack(3, 110);
        stack.pushToStack(3, 120);

        System.out.println("value: " + stack.popFromStack(3));

        stack.printStack();
    }

}
