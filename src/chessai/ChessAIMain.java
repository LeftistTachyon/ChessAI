package chessai;

import java.util.LinkedList;
import java.util.List;

public class ChessAIMain {
    public static void main(String[] args) {
        List<TreeNode> list = new LinkedList<>();
        list.add(null);
        TreeNode tn = new TreeNode(new ChessBoard());
        long start = System.nanoTime();
        ChessFrame cf = new ChessFrame();
        for(int i = 0; i < 1000; i++) {
            System.out.println(i);
            tn.selectAction();
        }
        cf.stop();
        long time = System.nanoTime() - start;
        System.out.println(time + " nanos");
    }
}
