package file_system_problem.storage;

import file_system_problem.interfaces.IFile;

import java.util.ArrayList;
import java.util.List;

public class FileNode extends Node implements IFile {

    private final List<String> contents;

    private final NodeType nodeType = NodeType.FILE;


    public FileNode(String name) {
        super(name);
        this.contents = new ArrayList<>();
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder();

        for(String word : contents) {
            sb.append(word);
        }

        return sb.toString();
    }


    public void appendContents(String word) {
        this.contents.add(word);
    }

    @Override
    public NodeType getType() {
        return nodeType;
    }
}
