/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

/**
 *
 * @author raojha
 */
public class DBConnectionTest {

    public DBConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSubjects method, of class DBConnection.
     */
    @org.junit.Test
    public void testGetSubjects() {
        System.out.println("getSubjects");
        DBConnection instance = new DBConnection();
        ResultSet result = instance.getSubjects();
        try{
            assertTrue(result.isBeforeFirst());
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Error: "+ex);
            fail("SQL error came");
        }
    }

    /**
     * Test of getDetails method, of class DBConnection.
     */
    @org.junit.Test
    public void testGetDetails() {
        System.out.println("getDetails");
        int subject_id = 1;
        DBConnection instance = new DBConnection();
        ResultSet result = instance.getDetails(subject_id);
        try{
            assertTrue(result.isBeforeFirst());
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Error: "+ex);
            fail("SQL error came");
        }
    }
    @org.junit.Test
    public void testGetDetails1() {
        System.out.println("getDetails");
        int subject_id = 0;
        String a="test";
        DBConnection instance = new DBConnection();
        ResultSet result = instance.getDetails(subject_id);
        try{
            assertFalse(result.isBeforeFirst());
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Error: "+ex);
            fail("SQL error came");
        }
    }   
}
