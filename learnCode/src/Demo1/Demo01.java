package Demo1;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个File
        File file = new File("C:\\Users\\比乐\\Desktop\\QQ picture");


        boolean b = haveAVI(file);
        System.out.println(b);

    }

//通过listfile.getname.endsWith判断是否存在.avi结尾文件的方法
    public static boolean haveAVI(File file) {
        for (File listFile : file.listFiles()) {
            if (listFile.isFile() && listFile.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }

}
