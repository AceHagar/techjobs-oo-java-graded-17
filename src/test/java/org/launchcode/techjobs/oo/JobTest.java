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

        assertTrue(Objects.equals(testJob3.getName(), "Product tester"));
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
}


