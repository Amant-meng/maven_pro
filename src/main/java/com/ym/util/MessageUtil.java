package com.ym.util;

import com.thoughtworks.xstream.XStream;
import com.ym.entity.message.TextMessage;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName:
 * @Auther: Meng.yang
 * @Description: XML文本转换实体类
 * @Date: 2020/07/20
 */
public class MessageUtil {

    /**
     * 将XML文本格式转换为Map
     * @param request
     * @return
     */
    public static Map<String, String> xmlToMap(HttpServletRequest request) {
        Map<String, String> resultMap = new HashMap<String, String>();
        try {
            InputStream inputStream = request.getInputStream();
            //创建解析器
            SAXReader sax = new SAXReader();
            //创建对应的Document对象
            Document doc = sax.read(inputStream);
            //获取XML文档的根节点对象
            Element root = doc.getRootElement();
            //获取根节点下的所有的子节点
            List<Element> list = root.elements();
            //遍历根节点下的所有子节点并将其放入MAP对象中
            for (Element ele : list) {
                resultMap.put(ele.getName(), ele.getText());
            }

            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return resultMap;

    }

    /**
     * 将对象转化为xml
     * @param testMessage
     * @return
     */
    public static String textMessageToXml(TextMessage testMessage){
        XStream xstream = new XStream();
        xstream.alias("xml",testMessage.getClass());
        return xstream.toXML(testMessage);
    }

}