package com.JppStore;

import com.JppStore.common.utils.FastDFSClient;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws Exception {
        FastDFSClient fastDFSClient = new FastDFSClient("C:\\Users\\Nelsoner\\IdeaProjects\\JpStore\\jppstore-manager-web\\src\\main\\resources\\conf\\client.conf");
        String string = fastDFSClient.uploadFile("C:\\Users\\Nelsoner\\Pictures\\Camera Roll\\764082.jpg");
        System.out.println(string);
        assertTrue( true );
    }
}
