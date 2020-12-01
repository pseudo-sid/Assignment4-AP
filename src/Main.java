import java.util.*;
import java.lang.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask.*;
import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

class Node{
    private long v;
    private Node parent;
    private int deg;
    private ArrayList<Node> Children;
    Node(HashMap<Long, Long> h){
        parent = null;
        Random rand = new Random();
        Children = new ArrayList<>();
        do {
            v = 1 + rand.nextInt(1000000);
        }while(h.remove(v) == null);
        deg = 0;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    void addChild(Node x){
        x.setParent(this);
        Children.add(x);
        deg++;
    }
    public int getDeg() {
        return deg;
    }

}
public class Main {
    static HashMap<Long, Long> uval = new HashMap<>();
    Main(){
        for(long i = 1; i <= 1000000; i++)
            uval.put(i, i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of nodes in tree: ");
        int N = sc.nextInt();
        //Tree creation code
        Node root = new Node(uval);

        //Node check code

    }
}
