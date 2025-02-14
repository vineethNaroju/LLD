package file_system_problem.storage;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {


    private final String name;

    public Node(String name) {
        this.name  = name;
    }

    public String getName() {
        return "";
    }


    public List<Node> listContents() {
        return new ArrayList<>();
    }



}
