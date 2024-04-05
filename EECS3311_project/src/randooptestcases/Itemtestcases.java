package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Itemtestcases {

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
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        item0.setName("hi!");
        item0.setType("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("");
        item0.setType("");
        java.lang.Class<?> wildcardClass14 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("");
        java.lang.Class<?> wildcardClass12 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        item0.setName("hi!");
        java.lang.String str9 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        java.lang.Class<?> wildcardClass3 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.Class<?> wildcardClass8 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        java.lang.String str9 = item0.getType();
        java.lang.Class<?> wildcardClass10 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getType();
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        item0.setName("");
        item0.setType("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        item0.setName("hi!");
        item0.setType("hi!");
        item0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        item0.setName("hi!");
        java.lang.String str9 = item0.getName();
        java.lang.Class<?> wildcardClass10 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        java.lang.String str9 = item0.getType();
        item0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Models.Item item0 = new Models.Item();
        java.lang.String str1 = item0.getName();
        item0.setName("");
        java.lang.String str4 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Models.Item item0 = new Models.Item();
        item0.setType("hi!");
        java.lang.Class<?> wildcardClass3 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str5 = item0.getType();
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getType();
        item0.setName("");
        java.lang.Class<?> wildcardClass10 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("");
        java.lang.Class<?> wildcardClass10 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        item0.setType("hi!");
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        java.lang.String str11 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        item0.setName("hi!");
        java.lang.Class<?> wildcardClass9 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Models.Item item0 = new Models.Item();
        java.lang.String str1 = item0.getName();
        item0.setName("");
        java.lang.String str4 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        item0.setType("");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Models.Item item0 = new Models.Item();
        java.lang.String str1 = item0.getName();
        item0.setType("");
        java.lang.String str4 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        java.lang.String str10 = item0.getName();
        java.lang.String str11 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        java.lang.String str11 = item0.getType();
        java.lang.Class<?> wildcardClass12 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        java.lang.String str9 = item0.getType();
        java.lang.String str10 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        java.lang.String str10 = item0.getName();
        java.lang.String str11 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Models.Item item0 = new Models.Item();
        item0.setName("");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        java.lang.String str10 = item0.getName();
        item0.setName("hi!");
        item0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Models.Item item0 = new Models.Item();
        item0.setType("hi!");
        item0.setName("");
        item0.setName("");
        item0.setType("");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setName("hi!");
        java.lang.Class<?> wildcardClass12 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        java.lang.String str11 = item0.getType();
        item0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        java.lang.String str10 = item0.getName();
        item0.setType("");
        java.lang.Class<?> wildcardClass13 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        java.lang.String str5 = item0.getType();
        java.lang.String str6 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Models.Item item0 = new Models.Item();
        item0.setType("hi!");
        item0.setName("");
        item0.setName("");
        java.lang.String str7 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str5 = item0.getType();
        java.lang.Class<?> wildcardClass6 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setName("hi!");
        java.lang.String str12 = item0.getName();
        java.lang.String str13 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        item0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Models.Item item0 = new Models.Item();
        java.lang.String str1 = item0.getName();
        java.lang.String str2 = item0.getType();
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str5 = item0.getType();
        java.lang.String str6 = item0.getName();
        java.lang.String str7 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str12 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        java.lang.String str9 = item0.getType();
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("hi!");
        item0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        java.lang.String str9 = item0.getName();
        java.lang.String str10 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("");
        item0.setType("");
        item0.setType("hi!");
        java.lang.String str16 = item0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        java.lang.String str8 = item0.getName();
        item0.setName("");
        item0.setName("hi!");
        java.lang.Class<?> wildcardClass13 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("");
        item0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Models.Item item0 = new Models.Item();
        java.lang.String str1 = item0.getName();
        java.lang.String str2 = item0.getType();
        java.lang.Class<?> wildcardClass3 = item0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str5 = item0.getType();
        java.lang.String str6 = item0.getName();
        item0.setName("");
        java.lang.String str9 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        java.lang.String str10 = item0.getName();
        item0.setName("");
        java.lang.String str13 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("");
        item0.setName("hi!");
        java.lang.String str7 = item0.getName();
        item0.setName("hi!");
        item0.setType("hi!");
        item0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        java.lang.String str3 = item0.getType();
        java.lang.String str4 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Models.Item item0 = new Models.Item();
        item0.setName("hi!");
        item0.setType("hi!");
        java.lang.String str5 = item0.getType();
        java.lang.String str6 = item0.getName();
        item0.setName("");
        item0.setName("");
        java.lang.String str11 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Models.Item item0 = new Models.Item();
        item0.setType("hi!");
        item0.setName("");
        java.lang.String str5 = item0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }
}

