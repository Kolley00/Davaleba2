
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.logging.Logger;

class FindFile {

    public static final Logger logger = Logger.getLogger(
            FindFile.class.getName());



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file search " );
        String name_find = scan.next();
        System.out.println("Enter the directory ");
        String directory = scan.next();
        File dir = new File(directory);
        FilenameFilter filter = (dir1, name) -> name.contains(name_find);


        String[] dir_list = dir.list(filter);
        if (dir_list == null) {
            System.out.println("Not found");
        } else {
            for (String filename : dir_list) {

                logger.info(filename);
            }
        }
    }

}
