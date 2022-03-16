public class TestEXArrayQueue {
    public static void main (String[] args) {
        EXArrayQueue<Integer> queue = new EXArrayQueue<Integer>(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.toString());
        queue.rotate();
        queue.rotate();
        while (!queue.isEmpty()) {
            System.out.println("elements " + queue.deQueue());
        }
    }
}
