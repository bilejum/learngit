package Demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\java\\Develop\\githere\\learngit\\learnCode\\src\\assest\\movie480_vp9.webm");

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\Develop\\githere\\learngit\\learnCode\\src\\assest\\copy.webm",true);
        int readlen = 1024*1024*5;
        int len=readlen;
        while (len == readlen) {
            byte[] bytes = new byte[len];
            len=fileInputStream.read(bytes,0,len);

            String str = new String(bytes,0,len);
            System.out.print(str);

            fileOutputStream.write(bytes,0,len);
        }


    }
}
