/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gorka
 */
public class helloTest {
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        hello.main(args);
        //fail("The test case is a prototype.");
    }
    
}
