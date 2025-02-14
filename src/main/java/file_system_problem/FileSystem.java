package file_system_problem;

import file_system_problem.exceptions.FileNotFoundException;
import file_system_problem.interfaces.IGenericFile;
import file_system_problem.storage.DirectoryNode;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {

    private static final FileSystem instance = new FileSystem();

    private static final DirectoryNode ROOT = new DirectoryNode("/");


    private FileSystem() {

    }

    public static FileSystem getInstance() {
        return instance;
    }


    // CREATE
    public void createDirectory(String path, String name) {

    }

    public void createFile(String path, String name) {

    }

    //READ

    public String getContents(String filePath) throws FileNotFoundException {
        return "";
    }

    public List<IGenericFile> listDirectory(String path) {
        return new ArrayList<>();
    }

    // UPDATE

    public void appendContents(String filePath, String contents) throws FileNotFoundException {

    }



    // DELETE










}
