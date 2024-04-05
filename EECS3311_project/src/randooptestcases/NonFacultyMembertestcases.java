package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonFacultyMembertestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("", "hi!", "");
        java.lang.Class<?> wildcardClass4 = nonFacultyMember3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("", "hi!", "");
        Models.Client client4 = nonFacultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("", "hi!", "");
        Models.Client client4 = nonFacultyMember3.getClient();
        Models.Client client5 = nonFacultyMember3.getClient();
        java.lang.Class<?> wildcardClass6 = nonFacultyMember3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("", "hi!", "");
        Models.Client client4 = nonFacultyMember3.getClient();
        Models.Client client5 = nonFacultyMember3.getClient();
        java.lang.Class<?> wildcardClass6 = client5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("", "hi!", "");
        Models.Client client4 = nonFacultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = nonFacultyMember3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Models.NonFacultyMember nonFacultyMember3 = new Models.NonFacultyMember("hi!", "", "hi!");
    }
}
