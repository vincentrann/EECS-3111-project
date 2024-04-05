package randooptestcases;

import org.junit.jupiter.api.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Visitortestcases {

    public static boolean debug = false;
    
    

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = client5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Models.Visitor visitor3 = new Models.Visitor("", "", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        java.lang.Class<?> wildcardClass8 = client7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Models.Visitor visitor3 = new Models.Visitor("", "", "hi!");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Models.Visitor visitor3 = new Models.Visitor("", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Models.Visitor visitor3 = new Models.Visitor("", "", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = client6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = client5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Models.Visitor visitor3 = new Models.Visitor("", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        Models.Client client11 = visitor3.getClient();
        java.lang.Class<?> wildcardClass12 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        java.lang.Class<?> wildcardClass11 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        java.lang.Class<?> wildcardClass9 = client8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        java.lang.Class<?> wildcardClass11 = client10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        Models.Client client11 = visitor3.getClient();
        Models.Client client12 = visitor3.getClient();
        Models.Client client13 = visitor3.getClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = client6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        java.lang.Class<?> wildcardClass8 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        java.lang.Class<?> wildcardClass10 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        java.lang.Class<?> wildcardClass9 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = client6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        Models.Client client11 = visitor3.getClient();
        java.lang.Class<?> wildcardClass12 = client11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        java.lang.Class<?> wildcardClass8 = client7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        java.lang.Class<?> wildcardClass10 = client9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        java.lang.Class<?> wildcardClass7 = client6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = client5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        java.lang.Class<?> wildcardClass9 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        java.lang.Class<?> wildcardClass8 = client7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        java.lang.Class<?> wildcardClass9 = client8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        java.lang.Class<?> wildcardClass10 = client9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        java.lang.Class<?> wildcardClass11 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        java.lang.Class<?> wildcardClass9 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Models.Visitor visitor3 = new Models.Visitor("", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        java.lang.Class<?> wildcardClass6 = client5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "");
        Models.Client client4 = visitor3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        Models.Client client11 = visitor3.getClient();
        Models.Client client12 = visitor3.getClient();
        java.lang.Class<?> wildcardClass13 = client12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Models.Visitor visitor3 = new Models.Visitor("hi!", "", "hi!");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        Models.Client client10 = visitor3.getClient();
        Models.Client client11 = visitor3.getClient();
        java.lang.Class<?> wildcardClass12 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Models.Visitor visitor3 = new Models.Visitor("", "hi!", "");
        Models.Client client4 = visitor3.getClient();
        Models.Client client5 = visitor3.getClient();
        Models.Client client6 = visitor3.getClient();
        Models.Client client7 = visitor3.getClient();
        Models.Client client8 = visitor3.getClient();
        Models.Client client9 = visitor3.getClient();
        java.lang.Class<?> wildcardClass10 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

