import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: zheng
 * @Date: 2019/10/29
 * @Description:
 */
public class Stream {
    @Test
    public void a() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\test.txt");
        fileWriter.write("中国");
        fileWriter.close();

        byte[] a = new byte[1024];

        FileOutputStream fileOutputStream = new FileOutputStream("");
        fileOutputStream.write(a);

        FileInputStream fileInputStream = new FileInputStream("");
        fileInputStream.read();

    }

    ;
}
