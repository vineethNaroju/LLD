package file_system_problem.exceptions;

public class FileNotFoundException extends RuntimeException {

    private  final String filePath, fileName;

    public FileNotFoundException(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public String toString() {
        return String.format("File name[%s] not found at path[%s]", fileName, filePath);
    }
}
