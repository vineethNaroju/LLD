package file_system_problem.interfaces;

public interface IFile extends IGenericFile {

    public String getContents();

    public void appendContents(String word);
}
