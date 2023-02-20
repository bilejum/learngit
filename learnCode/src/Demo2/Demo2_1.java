package Demo2;

import java.io.*;

public class Demo2_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\Develop\\githere\\learngit\\learnCode\\src\\Demo2");

//        String str = "hahazheshiwodediyichuanzifu,wuhuwuhum\r\n";//标调符号是可以的
//        byte[] strBytes = str.getBytes();
//        fileOutputStream.write(strBytes);



        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\比乐\\Desktop\\Snipaste_2023-02-20_09-41-55.png");
        int b = 0;
        while ((b = fileInputStream.read()) != -1) {
            fileOutputStream.write(b);

}
        fileInputStream.close();
        fileOutputStream.close();

    }
}
