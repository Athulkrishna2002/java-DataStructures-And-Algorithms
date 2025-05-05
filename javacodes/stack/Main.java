package javacodes.stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);
//        st.getTop();
//        st.getHeight();
        st.printStack();
        System.out.println("After pushing the 1st value");
        st.push(4);
        st.printStack();
        System.out.println("After popping the 1st top value");
        st.pop();
        st.printStack();

    }
}
