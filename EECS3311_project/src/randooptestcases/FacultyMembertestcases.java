package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyMembertestcases {

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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        java.lang.Class<?> wildcardClass8 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client6 = facultyMemberBuilder0.build();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("hi!");
        Models.Client client9 = facultyMemberBuilder0.build();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client7 = facultyMemberBuilder0.build();
        java.lang.Class<?> wildcardClass8 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client6 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        java.lang.Class<?> wildcardClass9 = facultyMemberBuilder0.getClass();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        java.lang.Class<?> wildcardClass2 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setPassword("");
        Models.Client client10 = facultyMemberBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        Models.Client client2 = facultyMemberBuilder0.build();
        Models.Client client3 = facultyMemberBuilder0.build();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setUserID("");
        java.lang.Class<?> wildcardClass13 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        Models.Client client2 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass10 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        Models.Client client2 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        java.lang.Class<?> wildcardClass5 = facultyMemberBuilder0.getClass();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        Models.Client client7 = facultyMemberBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("hi!");
        Models.Client client9 = facultyMemberBuilder0.build();
        Models.Client client10 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass9 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setEmail("");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setPassword("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("");
        java.lang.Class<?> wildcardClass13 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setEmail("hi!");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client3 = facultyMemberBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client6 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        Models.Client client8 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client7 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        Models.Client client6 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("hi!");
        Models.Client client9 = facultyMemberBuilder0.build();
        Models.Client client10 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("hi!");
        java.lang.Class<?> wildcardClass4 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setUserID("");
        Models.Client client12 = facultyMemberBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("hi!");
        Models.Client client4 = facultyMemberBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setEmail("hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setEmail("hi!");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("hi!");
        java.lang.Class<?> wildcardClass13 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        java.lang.Class<?> wildcardClass3 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass11 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setPassword("");
        java.lang.Class<?> wildcardClass6 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setUserID("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setUserID("");
        facultyMemberBuilder0.setPassword("hi!");
        Models.Client client7 = facultyMemberBuilder0.build();
        Models.Client client8 = facultyMemberBuilder0.build();
        Models.Client client9 = facultyMemberBuilder0.build();
        java.lang.Class<?> wildcardClass10 = facultyMemberBuilder0.getClass();
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
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        facultyMemberBuilder0.setPassword("hi!");
        facultyMemberBuilder0.setEmail("hi!");
        java.lang.Class<?> wildcardClass5 = facultyMemberBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        BuilderPattern.FacultyMemberBuilder facultyMemberBuilder0 = new BuilderPattern.FacultyMemberBuilder();
        Models.Client client1 = facultyMemberBuilder0.build();
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setEmail("");
        facultyMemberBuilder0.setPassword("");
        facultyMemberBuilder0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(client1);
    }
}

