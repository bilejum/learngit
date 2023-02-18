package Demo1;

import java.io.File;
import java.util.ArrayList;

public class Demo1_2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\比乐\\Desktop\\QQ picture");
        findFile(file,".jpg");
    }

    public static void findFile(File file,String keyword) {
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()) {
//                System.out.println(listFile);
                if (listFile.getName().endsWith(keyword)) {
                    System.out.println(listFile.getName());
                    listFile.delete();
                }
            } else {
                findFile(listFile,keyword);
            }
        }
    }
}
