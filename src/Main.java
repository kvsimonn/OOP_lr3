import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        stack1.push(2);
        stack1.push(4);
        stack2.push(7);
        stack1.push(90);
        stack1.push(23);

        System.out.println("Стек 1 до:" + stack1);
        System.out.println("Стек 2 до: " + stack2);

        swapStacks(stack1,stack2);
        System.out.println("Стек 1 после:" + stack1);
        System.out.println("Стек 2 после:" + stack2);


    }
    public static void swapStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> new_stack = new Stack<Integer>();
        while (!stack1.isEmpty()){
            new_stack.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        while (!new_stack.isEmpty()){
            stack2.push(new_stack.pop());
        }
    }
}