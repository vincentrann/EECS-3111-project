package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemFactorytestcases {

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
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        java.lang.Class<?> wildcardClass8 = clientItem7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "hi!", 100, "", false, "hi!", true);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "hi!", 1, "hi!", false, "hi!", true);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", (int) '4', "", true, "", false);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "hi!", (int) (short) 0, "hi!", false, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        java.lang.Class<?> wildcardClass8 = clientItem7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(10, "", "hi!", (int) (byte) 0, "hi!", true);
        java.lang.Class<?> wildcardClass8 = itemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(100, "hi!", "", (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (byte) -1, "", "", "", false, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem((int) (short) -1, "", "", (int) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "", 10, "hi!", false, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (short) 1, "hi!", false);
        java.lang.Class<?> wildcardClass15 = itemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "hi!", "hi!", (int) (byte) -1, "", false, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((-1), "", "", "hi!", false, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", (int) (byte) 10, "", false, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(0, "hi!", "hi!", 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "", false, (double) (byte) -1);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (byte) 100, "", "", 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", (int) ' ', "", false, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) '4', "", "", (int) (short) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((-1), "", "hi!", "", true, (double) (-1L));
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (byte) 0, "hi!", "", "", true, (double) (-1L));
        java.lang.Class<?> wildcardClass29 = itemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "", (int) (byte) 100, "hi!", true, "hi!", false);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((-1), "", "hi!", "", true, (double) (-1L));
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (short) 0, "hi!", "hi!", "", true, (double) (-1.0f));
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getVirtualItem(0, "hi!", "hi!", (int) (byte) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (short) 1, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem(100, "", "", (int) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (byte) 0, "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) '#', "", "hi!", "hi!", false, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "hi!", "", (int) (short) 10, "", false, "hi!", true);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "", (int) (short) 100, "hi!", true, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(10, "", "hi!", (int) (byte) 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem((int) (byte) 1, "", "hi!", (int) '4', "hi!", false);
        java.lang.Class<?> wildcardClass15 = clientItem14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "hi!", (int) '#', "hi!", false, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(10, "", "hi!", (int) (byte) 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) 'a', "hi!", "", "hi!", true, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (byte) 0, "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) '#', "", "", "", false, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) '#', "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(1, "hi!", "hi!", 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((int) 'a', "", "", "", false, (double) 10L);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) 'a', "hi!", "hi!", (int) (byte) -1, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) (short) 100, "", "", "", true, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "", 0, "hi!", false, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (short) 1, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((-1), "hi!", "", "hi!", false, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "hi!", (int) (short) 1, "hi!", false, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", (int) (byte) 0, "hi!", false, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "hi!", (int) (byte) 100, "", false, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "", (int) (short) 0, "", true, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "hi!", true, (double) 0L);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((int) 'a', "hi!", "", (int) '#', "", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (short) 0, "hi!", "hi!", (int) (short) -1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem(0, "", "hi!", "hi!", false, (double) (byte) -1);
        Bridge_Factory_Pattern.ClientItem clientItem42 = itemFactory0.getPhysicalItem((int) (short) 0, "hi!", "", "hi!", true, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem42);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(0, "hi!", "hi!", 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem(0, "hi!", "hi!", "", false, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(10, "", "hi!", (int) (byte) 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "hi!", "", false, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (byte) 0, "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) (short) 0, "", "", "", false, (double) (short) 0);
        Bridge_Factory_Pattern.ClientItem clientItem42 = itemFactory0.getPhysicalItem(100, "", "", "", false, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem42);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "hi!", true, (double) 0L);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((int) 'a', "hi!", "", (int) '#', "", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (short) 0, "hi!", "hi!", (int) (short) -1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) (byte) 1, "hi!", "hi!", "", false, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "hi!", true, (double) 0L);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((-1), "", "hi!", "", true, (double) (-1L));
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (short) 0, "hi!", "hi!", "", true, (double) (-1.0f));
        java.lang.Class<?> wildcardClass29 = clientItem28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "", (int) (byte) -1, "", false, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "", (int) ' ', "", true, "hi!", false);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "hi!", (int) ' ', "", true, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", (int) '4', "hi!", false, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "hi!", true, (double) 0L);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((int) 'a', "hi!", "", (int) '#', "", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (short) 100, "hi!", "", (int) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "", "", (int) (byte) 1, "", true, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "hi!", "", 0, "hi!", true, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) '#', "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem((int) (short) 0, "hi!", "", (int) (short) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((int) (short) -1, "hi!", "hi!", "", false, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getPhysicalItem((-1), "", "hi!", "", true, (double) (-1L));
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (byte) 0, "hi!", "", "", true, (double) (-1L));
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) (short) -1, "hi!", "", "hi!", true, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("hi!", "hi!", "hi!", (int) (short) 0, "", true, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        java.lang.Class<?> wildcardClass15 = clientItem14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (byte) 0, "", "hi!", "", false, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        java.lang.Class<?> wildcardClass8 = itemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "", 10, "", false, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem((int) 'a', "", "", 10, "", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) (byte) -1, "hi!", "", "hi!", true, (double) 0L);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((int) 'a', "hi!", "", (int) '#', "", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getPhysicalItem((int) (byte) 1, "", "", "", false, (double) 1.0f);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getPhysicalItem((int) (byte) 100, "hi!", "", "", true, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "hi!", "hi!", 0, "", false, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "hi!", (-1), "", true, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "", (int) (byte) -1, "", false, "", true);
        java.lang.Class<?> wildcardClass9 = item8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        Models.Item item8 = Bridge_Factory_Pattern.ItemFactory.getItem("", "", "hi!", (int) '4', "hi!", true, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item8);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getPhysicalItem((int) (short) 0, "", "hi!", "hi!", false, 1.0d);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem((int) (byte) 10, "", "hi!", (int) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(100, "hi!", "hi!", (int) (byte) 10, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getVirtualItem(10, "hi!", "", (int) (short) 10, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem21 = itemFactory0.getVirtualItem((-1), "", "", (int) (byte) 100, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem28 = itemFactory0.getVirtualItem((int) (byte) 0, "", "", (int) (short) 1, "", false);
        Bridge_Factory_Pattern.ClientItem clientItem35 = itemFactory0.getVirtualItem((int) (short) 10, "", "", (int) (byte) 0, "hi!", false);
        Bridge_Factory_Pattern.ClientItem clientItem42 = itemFactory0.getPhysicalItem(100, "hi!", "", "", false, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem42);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        Bridge_Factory_Pattern.ItemFactory itemFactory0 = new Bridge_Factory_Pattern.ItemFactory();
        Bridge_Factory_Pattern.ClientItem clientItem7 = itemFactory0.getVirtualItem(10, "", "hi!", (int) (byte) 0, "hi!", true);
        Bridge_Factory_Pattern.ClientItem clientItem14 = itemFactory0.getPhysicalItem((int) '4', "", "hi!", "", false, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientItem14);
    }
}

