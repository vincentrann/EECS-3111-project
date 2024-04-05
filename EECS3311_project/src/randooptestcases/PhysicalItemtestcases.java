package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PhysicalItemtestcases {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "hi!", 1, "hi!", false);
        Models.Client client7 = null;
        physicalItem5.returnPhysicalItem("hi!", client7);
        Models.Client client10 = null;
        physicalItem5.returnPhysicalItem("hi!", client10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "hi!", 1, "hi!", false);
        Models.Client client7 = null;
        physicalItem5.returnPhysicalItem("hi!", client7);
        ObserverPattern.PhysicalItemObserver physicalItemObserver9 = null;
        physicalItem5.removeObserver(physicalItemObserver9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        physicalItem5.setType("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "hi!", 1, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        physicalItem5.removeObserver(physicalItemObserver6);
        int int8 = physicalItem5.getCopies();
        java.lang.Class<?> wildcardClass9 = physicalItem5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        java.lang.String str6 = physicalItem5.getType();
        ObserverPattern.PhysicalItemObserver physicalItemObserver7 = null;
        physicalItem5.removeObserver(physicalItemObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        java.lang.String str6 = physicalItem5.getLocation();
        java.lang.String str7 = physicalItem5.getType();
        ObserverPattern.PhysicalItemObserver physicalItemObserver8 = null;
        physicalItem5.removeObserver(physicalItemObserver8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "hi!", 1, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        physicalItem5.removeObserver(physicalItemObserver6);
        int int8 = physicalItem5.getCopies();
        java.time.LocalDateTime localDateTime10 = null;
        Models.Client client11 = null;
        // The following exception was thrown during execution in test generation
        try {
            physicalItem5.rentPhysicalItem("hi!", localDateTime10, client11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        java.lang.String str6 = physicalItem5.getLocation();
        java.lang.String str7 = physicalItem5.getType();
        java.lang.String str8 = physicalItem5.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "hi!", 1, "hi!", false);
        java.lang.Class<?> wildcardClass6 = physicalItem5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        java.lang.String str6 = physicalItem5.getType();
        physicalItem5.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Models.PhysicalItem physicalItem5 = new Models.PhysicalItem("", "", (int) (byte) 10, "hi!", false);
        Models.Client client7 = null;
        physicalItem5.returnPhysicalItem("", client7);
        java.lang.String str9 = physicalItem5.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }
}

