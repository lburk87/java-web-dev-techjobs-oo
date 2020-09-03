package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
    public void toStringStartsWithBlankLine() {
        assertEquals(test_job1.toString().indexOf("\n"), 0);
    }

    @Test
    public void testToString() {
        assertEquals(test_job1.toString(), "\nID: "+test_job1.getId()+"\nName: "+test_job1.getName()+"\nEmployer: "+test_job1.getEmployer()+"\nLocation: "+test_job1.getLocation()+"\nPosition Type: "+test_job1.getPositionType()+"\nCore Competency: "+test_job1.getCoreCompetency()+"\n");
    }

}
