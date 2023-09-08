import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programm {
    public static void main(String[] args) throws NumberFormatException, IOException {
        final redBlackTree tree = new redBlackTree();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int value = Integer.parseInt(reader.readLine());
            tree.add(value);
            System.out.println("finish");
        }
    }
}
