
public class EXArrayQueue<T> extends ArrayQueue<T> implements QueueI<T> {
    protected static final int CAPACITY = 100;

    public EXArrayQueue () {
        super(CAPACITY);
    }

    public EXArrayQueue (int size) {
        super(size);
    }


    public void reverse() {
        Stack<T> stack = new ArrayStack<T>(super.size());

        while (!super.isEmpty())
            stack.push(super.deQueue());

        while (!stack.isEmpty())
            super.enQueue(stack.pop());
    }

    public void rotate() {
        T first = this.deQueue();
        this.enQueue(first);
    }
}
