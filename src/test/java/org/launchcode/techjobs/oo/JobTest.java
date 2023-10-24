package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;


import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob3.getName() instanceof String);
        assertEquals(testJob3.getName(), "Product tester");

        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertEquals(testJob3.getEmployer().getValue(), "ACME");

        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals(testJob3.getLocation().getValue(), "Desert");

        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertEquals(testJob3.getPositionType().getValue(), "Quality control");

        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob3.equals(testJob4));
    }

//    @Test
//    public void testToStringStartsAndEndsWithNewLine() {
//        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        int lengthOfJob3 = testJob3.toString().length();
//        assertEquals(testJob3.toString().charAt(0), "\r\n");
//       // assertEquals(testJob3.toString().charAt(lengthOfJob3 -1), " ");
//    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobToString = testJob3.toString();

        // Check if the string starts and ends with a newline character
        assertTrue(jobToString.startsWith(System.lineSeparator()));
        assertTrue(jobToString.endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobToString = testJob3.toString();
        assertTrue(jobToString.contains("ID: " + testJob3.getId()));
        assertTrue(jobToString.contains("Name: " + testJob3.getName()));
        assertTrue(jobToString.contains("Employer: " + testJob3.getEmployer()));
        assertTrue(jobToString.contains("Location: " + testJob3.getLocation()));
        assertTrue(jobToString.contains("Position Type: " + testJob3.getPositionType()));
        assertTrue(jobToString.contains("Core Competency: " + testJob3.getCoreCompetency()));
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobToString = testJob.toString();

        assertTrue(jobToString.contains("Name: Data not available"));
        assertTrue(jobToString.contains("Employer: Data not available"));
        assertTrue(jobToString.contains("Location: Data not available"));
        assertTrue(jobToString.contains("Position Type: Data not available"));
        assertTrue(jobToString.contains("Core Competency: Data not available"));
    }

}






