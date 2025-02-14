package file_system_problem.interfaces;

import java.util.List;

public interface IDirectory extends IGenericFile {


    public List<IGenericFile> listContents();
}
