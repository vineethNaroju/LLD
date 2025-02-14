package file_system_problem.storage;

import java.util.HashMap;

public class DirectoryNode extends Node {

    HashMap<String, Node> contents = new HashMap<>();

    public DirectoryNode(String name) {
        super(name);
    }



}
