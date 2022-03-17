package test;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("From_L1_to_L2");
        List<String> files = new ArrayList<>(new ArrayList<>() {
            {
                add("testng.xml");
            }
        });
        xmlSuite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(xmlSuite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
