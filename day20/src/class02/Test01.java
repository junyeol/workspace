package class02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
   public static void main(String[] args) {

      String filePath = "D:\\KIM\\resource\\";
      String originFileName = "test.jpg";
      String copyFileName = "testCopy.jpg";

      try {

         FileInputStream fis = new FileInputStream(filePath+originFileName);
         FileOutputStream fos = new FileOutputStream(filePath+copyFileName);

         byte[] buffer = new byte[1024];
         int content;
         while ((content = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, content);
         }
         fos.close();

      } catch (IOException e) {
         System.out.println("오류발생!");
      }

   }
}
