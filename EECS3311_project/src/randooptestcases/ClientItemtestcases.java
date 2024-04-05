package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientItemtestcases{

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        java.lang.Class<?> wildcardClass2 = clientItem1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            clientItem1.changeItemName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            clientItem1.changeItemName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            clientItem1.changeItemType("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientItem1.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = clientItem1.getUniqueID();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientItem1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        Bridge_Factory_Pattern.ConcreteItem concreteItem0 = null;
        Bridge_Factory_Pattern.ClientItem clientItem1 = new Bridge_Factory_Pattern.ClientItem(concreteItem0);
        // The following exception was thrown during execution in test generation
        try {
            clientItem1.changeItemType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

