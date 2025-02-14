package file_system_problem;

import file_system_problem.interfaces.IDirectory;
import file_system_problem.interfaces.IFile;
import file_system_problem.interfaces.IGenericFile;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showcase();
    }


    public void print(Object o) {
        System.out.println();
    }

    public void showcase() {

        FileSystem fs = FileSystem.getInstance();


        List<IGenericFile> files = fs.listDirectory("/");

        for(IGenericFile file : files) {

            print(file.getName());

            if(file instanceof IDirectory) {
                IDirectory dir = (IDirectory) file;


            } else if (file instanceof IFile) {
              //TODO
            }
        }












    }


}
