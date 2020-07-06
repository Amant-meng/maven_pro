package com.ym.module.qrcode;

import com.ym.module.qrcode.util.QRCodeUtil;
import org.junit.Test;

public class QrCodeTest {

    @Test
    public void printQrCode() throws Exception {
        // 存放在二维码中的内容
        String text = "杰哥，帅气迷人";
        // 嵌入二维码的图片路径
        String imgPath = "D:/temp/jiajiao.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:/temp/qrcode/jiao.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }

}
