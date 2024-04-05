package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConcretePhysicalItemtestcases{

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        Models.Client client8 = null;
        concretePhysicalItem3.returnPhysicalItem("hi!", client8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        concretePhysicalItem3.notifyDueDate();
        java.lang.Class<?> wildcardClass9 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (short) -1, "", "", (int) 'a', "", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        java.lang.Class<?> wildcardClass7 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 1, "hi!", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        Models.Client client6 = null;
        concretePhysicalItem3.returnPhysicalItem("hi!", client6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime9, client10);
        java.lang.Class<?> wildcardClass12 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        concretePhysicalItem3.notifyDueDate();
        concretePhysicalItem3.notifyDueDate();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime13, client14);
        int int16 = concretePhysicalItem3.getCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 10, "hi!", false);
        java.time.LocalDateTime localDateTime5 = null;
        Models.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            concretePhysicalItem3.rentPhysicalItem("", localDateTime5, client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        ObserverPattern.PhysicalItemObserver physicalItemObserver12 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) -1, "hi!", true);
        java.lang.Class<?> wildcardClass4 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        int int13 = concretePhysicalItem6.getCopies();
        java.lang.Class<?> wildcardClass14 = concretePhysicalItem6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) -1, "", true);
        java.lang.String str4 = concretePhysicalItem3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        concretePhysicalItem3.notifyDueDate();
        java.time.LocalDateTime localDateTime10 = null;
        Models.Client client11 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime10, client11);
        java.time.LocalDateTime localDateTime14 = null;
        Models.Client client15 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime14, client15);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        Models.Client client5 = null;
        concretePhysicalItem3.returnPhysicalItem("", client5);
        java.lang.Class<?> wildcardClass7 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((-1), "hi!", "hi!", (int) (byte) 10, "hi!", true);
        int int7 = concretePhysicalItem6.getCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        int int7 = concretePhysicalItem3.getCopies();
        ObserverPattern.PhysicalItemObserver physicalItemObserver8 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver8);
        java.lang.Class<?> wildcardClass10 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime13, client14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver16);
        java.lang.Class<?> wildcardClass18 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        Models.Client client13 = null;
        concretePhysicalItem3.returnPhysicalItem("", client13);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        concretePhysicalItem3.notifyDueDate();
        Models.Client client10 = null;
        concretePhysicalItem3.returnPhysicalItem("hi!", client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime13, client14);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem(1, "", "hi!", (int) (short) -1, "", false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 1, "", "", (int) (short) 10, "hi!", true);
        java.lang.Class<?> wildcardClass7 = concretePhysicalItem6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        concretePhysicalItem3.notifyDueDate();
        java.lang.String str9 = concretePhysicalItem3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime13, client14);
        java.lang.Class<?> wildcardClass16 = concretePhysicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) ' ', "hi!", false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        int int13 = concretePhysicalItem6.getCopies();
        java.lang.String str14 = concretePhysicalItem6.getLocation();
        java.time.LocalDateTime localDateTime16 = null;
        Models.Client client17 = null;
        concretePhysicalItem6.rentPhysicalItem("hi!", localDateTime16, client17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "hi!", "", 100, "", false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        Models.Client client6 = null;
        concretePhysicalItem3.returnPhysicalItem("hi!", client6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime9, client10);
        Models.Client client13 = null;
        concretePhysicalItem3.returnPhysicalItem("", client13);
        int int15 = concretePhysicalItem3.getCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", "", 10, "", true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) -1, "", true);
        java.time.LocalDateTime localDateTime5 = null;
        Models.Client client6 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime5, client6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(1, "hi!", false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        int int13 = concretePhysicalItem6.getCopies();
        ObserverPattern.PhysicalItemObserver physicalItemObserver14 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        Models.Client client14 = null;
        concretePhysicalItem6.returnPhysicalItem("", client14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver16);
        concretePhysicalItem6.notifyDueDate();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        ObserverPattern.PhysicalItemObserver physicalItemObserver7 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver7);
        java.lang.String str9 = concretePhysicalItem3.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 100, "hi!", false);
        Models.Client client5 = null;
        concretePhysicalItem3.returnPhysicalItem("hi!", client5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        int int7 = concretePhysicalItem3.getCopies();
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime9, client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) '4', "", false);
        concretePhysicalItem3.notifyDueDate();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime13, client14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver16);
        concretePhysicalItem3.notifyDueDate();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        ObserverPattern.PhysicalItemObserver physicalItemObserver6 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver6);
        java.time.LocalDateTime localDateTime9 = null;
        Models.Client client10 = null;
        concretePhysicalItem3.rentPhysicalItem("", localDateTime9, client10);
        java.time.LocalDateTime localDateTime13 = null;
        Models.Client client14 = null;
        concretePhysicalItem3.rentPhysicalItem("hi!", localDateTime13, client14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver16);
        ObserverPattern.PhysicalItemObserver physicalItemObserver18 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver18);
        ObserverPattern.PhysicalItemObserver physicalItemObserver20 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver20);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 10, "", "hi!", (int) '#', "", false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver4);
        concretePhysicalItem3.notifyDueDate();
        concretePhysicalItem3.notifyDueDate();
        concretePhysicalItem3.notifyDueDate();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "", (int) (short) 0, "hi!", true);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        int int11 = concretePhysicalItem6.getCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        int int13 = concretePhysicalItem6.getCopies();
        java.lang.String str14 = concretePhysicalItem6.getLocation();
        int int15 = concretePhysicalItem6.getCopies();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 10, "", "hi!", (int) (byte) -1, "", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver7 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 100, "hi!", false);
        ObserverPattern.PhysicalItemObserver physicalItemObserver4 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) -1, "hi!", "", (int) (short) 100, "hi!", true);
        concretePhysicalItem6.notifyDueDate();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 10, "hi!", false);
        int int4 = concretePhysicalItem3.getCopies();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "", (int) (short) 0, "hi!", true);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver11);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver5);
        int int7 = concretePhysicalItem3.getCopies();
        ObserverPattern.PhysicalItemObserver physicalItemObserver8 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver8);
        ObserverPattern.PhysicalItemObserver physicalItemObserver10 = null;
        concretePhysicalItem3.addObserver(physicalItemObserver10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem3 = new Bridge_Factory_Pattern.ConcretePhysicalItem(0, "hi!", false);
        concretePhysicalItem3.notifyDueDate();
        ObserverPattern.PhysicalItemObserver physicalItemObserver5 = null;
        concretePhysicalItem3.removeObserver(physicalItemObserver5);
        concretePhysicalItem3.notifyDueDate();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        int int13 = concretePhysicalItem6.getCopies();
        ObserverPattern.PhysicalItemObserver physicalItemObserver14 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver16);
        Models.Client client19 = null;
        concretePhysicalItem6.returnPhysicalItem("", client19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "hi!", "", (int) '4', "", true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) (byte) 1, "", "", (int) (short) 10, "hi!", true);
        ObserverPattern.PhysicalItemObserver physicalItemObserver7 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Bridge_Factory_Pattern.ConcretePhysicalItem concretePhysicalItem6 = new Bridge_Factory_Pattern.ConcretePhysicalItem((int) 'a', "", "hi!", (int) (short) -1, "hi!", false);
        java.time.LocalDateTime localDateTime8 = null;
        Models.Client client9 = null;
        concretePhysicalItem6.rentPhysicalItem("", localDateTime8, client9);
        ObserverPattern.PhysicalItemObserver physicalItemObserver11 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver11);
        Models.Client client14 = null;
        concretePhysicalItem6.returnPhysicalItem("", client14);
        ObserverPattern.PhysicalItemObserver physicalItemObserver16 = null;
        concretePhysicalItem6.addObserver(physicalItemObserver16);
        ObserverPattern.PhysicalItemObserver physicalItemObserver18 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver18);
        ObserverPattern.PhysicalItemObserver physicalItemObserver20 = null;
        concretePhysicalItem6.removeObserver(physicalItemObserver20);
    }
}

