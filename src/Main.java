import java.util.*;

class Node{
    private long v;
    private int deg;
    private ArrayList<Node> Children;
    Node(){
        Random rand = new Random();
        Children = new ArrayList<>();
        v = 1 + rand.nextInt(1000000);
        deg = 0;
    }
    void addChild(Node x){
        Children.add(x);
        deg++;
    }
    public int getDeg() {
        return deg;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of nodes in tree: ");
        int N = sc.nextInt();
        //Tree creation code

        //Node check code

    }
}
