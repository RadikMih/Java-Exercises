package dsa.stack;

public class StackTest {
    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        int element = stack.pop();
        System.out.println(element);

        DynamicStack<Integer> dynamicStack = new DynamicStack<>();


        for (int i = 1; i <= 5; i++) {
            dynamicStack.push(i);
        }

        int y = dynamicStack.peek();
        System.out.println(y);

        System.out.println(dynamicStack.size());



    }
}
