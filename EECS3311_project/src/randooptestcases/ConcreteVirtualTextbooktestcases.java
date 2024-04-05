package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConcreteVirtualTextbooktestcases {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        java.lang.String str7 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        java.lang.Class<?> wildcardClass7 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook0 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", true, 0.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 10, "", "", "", false, 35.0d);
        java.lang.Class<?> wildcardClass7 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "", "", false, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        java.lang.Class<?> wildcardClass7 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "hi!", "hi!", true, 0.0d);
        java.lang.String str7 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        double double7 = concreteVirtualTextbook6.getPriority();
        double double8 = concreteVirtualTextbook6.getPriority();
        java.lang.String str9 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        java.lang.String str7 = concreteVirtualTextbook6.getEdition();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        double double7 = concreteVirtualTextbook6.getPriority();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        java.lang.Class<?> wildcardClass9 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", true, (double) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) ' ');
        java.lang.String str4 = concreteVirtualTextbook3.getEdition();
        boolean boolean5 = concreteVirtualTextbook3.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", true, (-1.0d));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, 35.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", true, (double) (short) 1);
        java.lang.String str4 = concreteVirtualTextbook3.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "hi!", "", "", false, 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) 'a');
        double double4 = concreteVirtualTextbook3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "", "", false, 0.0d);
        java.lang.Class<?> wildcardClass7 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 10, "", "hi!", "hi!", false, (double) (byte) 10);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 1, "hi!", "", "hi!", false, (double) 100.0f);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(10, "", "", "", true, (double) 10.0f);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        boolean boolean9 = concreteVirtualTextbook6.isAvailability();
        boolean boolean10 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) (-1L));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 10, "", "hi!", "", true, 0.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "", "", false, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        double double8 = concreteVirtualTextbook6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) (byte) -1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 100, "", "", "hi!", true, 97.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "hi!", "", true, (double) (byte) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        double double7 = concreteVirtualTextbook6.getPriority();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        double double8 = concreteVirtualTextbook6.getPriority();
        boolean boolean9 = concreteVirtualTextbook6.isAvailability();
        java.lang.Class<?> wildcardClass10 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) (short) 100);
        boolean boolean4 = concreteVirtualTextbook3.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((-1), "", "hi!", "", false, (double) ' ');
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        java.lang.Class<?> wildcardClass8 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = concreteVirtualTextbook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", false, (double) (-1L));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(10, "", "", "", true, 97.0d);
        java.lang.Class<?> wildcardClass7 = concreteVirtualTextbook6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", true, (double) 0);
        java.lang.Class<?> wildcardClass4 = concreteVirtualTextbook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((-1), "", "hi!", "", false, (double) ' ');
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        double double8 = concreteVirtualTextbook6.getPriority();
        java.lang.String str9 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "hi!", "hi!", true, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        double double7 = concreteVirtualTextbook6.getPriority();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        double double9 = concreteVirtualTextbook6.getPriority();
        double double10 = concreteVirtualTextbook6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        double double7 = concreteVirtualTextbook6.getPriority();
        double double8 = concreteVirtualTextbook6.getPriority();
        java.lang.String str9 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 1, "", "", "", true, (double) 0L);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) -1, "hi!", "", "hi!", false, (double) '#');
        java.lang.String str7 = concreteVirtualTextbook6.getEdition();
        boolean boolean8 = concreteVirtualTextbook6.isAvailability();
        java.lang.String str9 = concreteVirtualTextbook6.getEdition();
        double double10 = concreteVirtualTextbook6.getPriority();
        double double11 = concreteVirtualTextbook6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("", true, (double) 'a');
        boolean boolean4 = concreteVirtualTextbook3.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 100, "", "hi!", "", true, (double) '4');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((-1), "hi!", "", "hi!", true, (double) 0L);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", false, (double) (byte) 1);
        java.lang.String str4 = concreteVirtualTextbook3.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", true, (double) 1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook(1, "hi!", "", "", false, 0.0d);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        double double8 = concreteVirtualTextbook6.getPriority();
        boolean boolean9 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", true, (double) 1.0f);
        double double4 = concreteVirtualTextbook3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook3 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook("hi!", true, 97.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (byte) 1, "", "", "", false, 0.0d);
        boolean boolean7 = concreteVirtualTextbook6.isAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Bridge_Factory_Pattern.ConcreteVirtualTextbook concreteVirtualTextbook6 = new Bridge_Factory_Pattern.ConcreteVirtualTextbook((int) (short) 10, "", "hi!", "hi!", false, (double) (byte) 10);
        java.lang.String str7 = concreteVirtualTextbook6.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }
}

