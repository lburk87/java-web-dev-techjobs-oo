package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.io.StringReader;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;

    @Before
    public void jobObjects() {
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1 instanceof Job);
        assertEquals(test_job1.getName(), "Product tester");
        assertEquals(test_job1.getEmployer().toString(), "ACME");
        assertEquals(test_job1.getLocation().toString(), "Desert");
        assertEquals(test_job1.getPositionType().toString(), "Quality control");
        assertEquals(test_job1.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void toStringStartsWithBlankLine() {
        assertEquals(test_job1.toString().indexOf("\n"), 0);
    }

    @Test
    public void toStringEndsWithBlankLine() {
        assertEquals(test_job1.toString().substring(test_job1.toString().length()-1),"\n");
    }

    @Test
    public void toStringPrintsId() {
        assertTrue(test_job1.toString().contains("ID: "+test_job1.getId()));
    }

    @Test
    public void toStringPrintsName() {
        assertTrue(test_job1.toString().contains("Name: "+test_job1.getName()));
    }

    @Test
    public void toStringPrintsEmployer() {
        assertTrue(test_job1.toString().contains("Employer: "+test_job1.getEmployer()));
    }

    @Test
    public void toStringPrintsLocation() {
        assertTrue(test_job1.toString().contains("Location: "+test_job1.getLocation()));
    }

    @Test
    public void toStringPrintsPositionType() {
        assertTrue(test_job1.toString().contains("Position Type: "+test_job1.getPositionType()));
    }

    @Test
    public void toStringPrintsCoreCompetency() {
        assertTrue(test_job1.toString().contains("Core Competency: "+test_job1.getCoreCompetency()));
    }

    @Test
    public void toStringPrintsCorrectly() {
        assertEquals(test_job1.toString(), "\nID: "+test_job1.getId()+"\nName: "+test_job1.getName()+"\nEmployer: "+test_job1.getEmployer()+"\nLocation: "+test_job1.getLocation()+"\nPosition Type: "+test_job1.getPositionType()+"\nCore Competency: "+test_job1.getCoreCompetency()+"\n");
    }

}
