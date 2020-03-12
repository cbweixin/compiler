package com.weixin.xml;

import com.weixin.listeners.json2xml.JSON2XMLDom;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDedeuplication {

  private static final Set<String> jars = new HashSet<>();

  public static void readXML(String filePath) {
    try {
      File XmlFile = new File(filePath);
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = null;
      dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(XmlFile);
//      doc.getDocumentElement().normalize();

      //Get all the XML elements from the file
      NodeList list = doc.getElementsByTagName("dependency");
      System.out.println("list.getLength() = " + list.getLength());

      List<Element> needToRemove = new ArrayList<>();

      for (int i = 0; i < list.getLength(); i++) {

        Element element = (Element) list.item(i);
        String groupId = element.getElementsByTagName("groupId").item(0).getFirstChild()
            .getNodeValue();
        String aId = element.getElementsByTagName("artifactId").item(0).getFirstChild()
            .getNodeValue();
        NodeList versions = element.getElementsByTagName("version");
        String version = "";
        if (versions != null && versions.getLength() > 0) {
          version = versions.item(0).getFirstChild().getNodeValue();
        }

        System.out.println("element at " + i);
        String coordinates = groupId + ":" + aId + ":" + version;
        System.out.println("coordinates = " + coordinates);
        if (jars.contains(coordinates)) {
          needToRemove.add(element);
//          element.getParentNode().removeChild(element);
        } else {
          jars.add(coordinates);
        }
//        System.out.println("groupId = " + groupId);
//        System.out.println("aId = " + aId);
//        System.out.println("version = " + version);
//        System.out.println("XMLDedeuplication.readXML");
      }

      for (Element e : needToRemove) {
        e.getParentNode().removeChild(e);
      }

      String xmlDoc = documentToString(doc);
      System.out.println(xmlDoc);


    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String documentToString(Document document) {
    try {
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer trans = tf.newTransformer(new StreamSource(
          "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/strip-space.xsl"));
      trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      trans.setOutputProperty(OutputKeys.METHOD, "xml");
      trans.setOutputProperty(OutputKeys.INDENT, "yes");
      trans.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
      trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      StringWriter sw = new StringWriter();
      trans.transform(new DOMSource(document), new StreamResult(sw));
      return sw.toString();
    } catch (TransformerException tEx) {
      tEx.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    readXML("/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/pom.xml");

  }


}
