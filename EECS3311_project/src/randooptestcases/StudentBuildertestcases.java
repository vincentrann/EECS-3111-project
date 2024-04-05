package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentBuildertestcases {

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
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        Models.Client client7 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass8 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        Models.Client client6 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass7 = client6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("hi!");
        Models.Client client7 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("hi!");
        Models.Client client9 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass10 = client9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("");
        Models.Client client7 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass8 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        Models.Client client6 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        java.lang.Class<?> wildcardClass9 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass2 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setPassword("");
        Models.Client client10 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        Models.Client client2 = studentBuilder0.build();
        Models.Client client3 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setPassword("");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setUserID("");
        java.lang.Class<?> wildcardClass13 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        Models.Client client2 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass10 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        Models.Client client2 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        java.lang.Class<?> wildcardClass5 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        Models.Client client7 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("hi!");
        Models.Client client9 = studentBuilder0.build();
        Models.Client client10 = studentBuilder0.build();
        studentBuilder0.setPassword("");
        studentBuilder0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass9 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setEmail("");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setPassword("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
        studentBuilder0.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setPassword("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("");
        java.lang.Class<?> wildcardClass13 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("");
        studentBuilder0.setEmail("hi!");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        Models.Client client3 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        Models.Client client6 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        Models.Client client7 = studentBuilder0.build();
        Models.Client client8 = studentBuilder0.build();
        studentBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("");
        Models.Client client7 = studentBuilder0.build();
        studentBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        Models.Client client7 = studentBuilder0.build();
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        Models.Client client6 = studentBuilder0.build();
        studentBuilder0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("hi!");
        Models.Client client9 = studentBuilder0.build();
        Models.Client client10 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("hi!");
        java.lang.Class<?> wildcardClass4 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        Models.Client client7 = studentBuilder0.build();
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setUserID("");
        Models.Client client12 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("hi!");
        Models.Client client4 = studentBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setPassword("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setEmail("hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("");
        studentBuilder0.setEmail("hi!");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("hi!");
        java.lang.Class<?> wildcardClass13 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        java.lang.Class<?> wildcardClass3 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass11 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass6 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setPassword("");
        studentBuilder0.setUserID("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setUserID("");
        studentBuilder0.setPassword("hi!");
        Models.Client client7 = studentBuilder0.build();
        Models.Client client8 = studentBuilder0.build();
        Models.Client client9 = studentBuilder0.build();
        java.lang.Class<?> wildcardClass10 = studentBuilder0.getClass();
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        studentBuilder0.setPassword("hi!");
        studentBuilder0.setEmail("hi!");
        java.lang.Class<?> wildcardClass5 = studentBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BuilderPattern.StudentBuilder studentBuilder0 = new BuilderPattern.StudentBuilder();
        Models.Client client1 = studentBuilder0.build();
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setEmail("");
        studentBuilder0.setPassword("");
        studentBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }
}

