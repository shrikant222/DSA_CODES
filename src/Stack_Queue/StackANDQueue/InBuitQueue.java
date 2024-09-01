package Stack_Queue.StackANDQueue;
import java.util.LinkedList;
import java.util.Queue;
public class InBuitQueue {
    public static void main(String[] args) {
        Queue<Integer> que =new LinkedList<>();
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que.peek());
        que.remove();
        System.out.println(que.peek());

    }


}
