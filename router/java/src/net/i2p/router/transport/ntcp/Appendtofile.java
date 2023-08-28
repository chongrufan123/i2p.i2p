package net.i2p.router.transport.ntcp;

import java.io.FileWriter;
import java.io.IOException;

public class Appendtofile {
    public static void write(String args) {
        String filePath = "/root/aimafan.log"; // 替换为你的文件路径

        try {
            FileWriter writer = new FileWriter(filePath, true); // 使用 true 参数表示以追加模式打开文件
            writer.write(args); 
            // writer.write("\n");
            writer.close();
            // System.out.println("文本已成功添加到文件中。");
        } catch (IOException e) {
            System.out.println("发生错误：" + e.getMessage());
        }
    }
}