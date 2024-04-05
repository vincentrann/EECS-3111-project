package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientDirectortestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        java.lang.Class<?> wildcardClass2 = clientDirector1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            Models.Client client2 = clientDirector1.getProduct();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientDirector1.getEmail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            clientDirector1.construct("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            clientDirector1.construct("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            clientDirector1.construct("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            clientDirector1.construct("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        BuilderPattern.ClientBuilder clientBuilder0 = null;
        BuilderPattern.ClientDirector clientDirector1 = new BuilderPattern.ClientDirector(clientBuilder0);
        // The following exception was thrown during execution in test generation
        try {
            clientDirector1.construct("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

