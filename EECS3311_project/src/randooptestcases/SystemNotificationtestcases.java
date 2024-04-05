package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemNotificationtestcases {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.Class<?> wildcardClass1 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass2 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass2 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass3 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass5 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass4 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass7 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass4 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass9 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Procuring book if possible" + "'", str9.equals("Procuring book if possible"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass10 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass3 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass3 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass8 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass7 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass6 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass4 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.unavailableTextbook();
        java.lang.String str11 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass12 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Procuring book if possible" + "'", str10.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Procuring book if possible" + "'", str9.equals("Procuring book if possible"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.String str8 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Procuring book if possible" + "'", str8.equals("Procuring book if possible"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass3 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass8 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass9 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass6 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.unavailableTextbook();
        java.lang.String str11 = systemNotification0.unavailableTextbook();
        java.lang.String str12 = systemNotification0.unavailableTextbook();
        java.lang.String str13 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Procuring book if possible" + "'", str10.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Procuring book if possible" + "'", str11.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Procuring book if possible" + "'", str12.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass5 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.Class<?> wildcardClass5 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass8 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.unavailableTextbook();
        java.lang.String str9 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Procuring book if possible" + "'", str8.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Procuring book if possible" + "'", str9.equals("Procuring book if possible"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.registrationFailed();
        java.lang.String str11 = systemNotification0.registrationFailed();
        java.lang.String str12 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass13 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Procuring book if possible" + "'", str12.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.String str5 = systemNotification0.registrationFailed();
        java.lang.String str6 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.unavailableTextbook();
        java.lang.String str9 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Procuring book if possible" + "'", str8.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.String str5 = systemNotification0.registrationFailed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.unavailableTextbook();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Procuring book if possible" + "'", str1.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.unavailableTextbook();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Procuring book if possible" + "'", str2.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.unavailableTextbook();
        java.lang.String str7 = systemNotification0.registrationFailed();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Procuring book if possible" + "'", str6.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Procuring book if possible" + "'", str10.equals("Procuring book if possible"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.String str6 = systemNotification0.registrationFailed();
        java.lang.String str7 = systemNotification0.unavailableTextbook();
        java.lang.String str8 = systemNotification0.registrationFailed();
        java.lang.String str9 = systemNotification0.registrationFailed();
        java.lang.String str10 = systemNotification0.registrationFailed();
        java.lang.String str11 = systemNotification0.unavailableTextbook();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Procuring book if possible" + "'", str7.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Procuring book if possible" + "'", str11.equals("Procuring book if possible"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.unavailableTextbook();
        java.lang.String str4 = systemNotification0.registrationFailed();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass6 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Procuring book if possible" + "'", str3.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Models.SystemNotification systemNotification0 = Models.SystemNotification.getInstance();
        java.lang.String str1 = systemNotification0.registrationFailed();
        java.lang.String str2 = systemNotification0.registrationFailed();
        java.lang.String str3 = systemNotification0.registrationFailed();
        java.lang.String str4 = systemNotification0.unavailableTextbook();
        java.lang.String str5 = systemNotification0.unavailableTextbook();
        java.lang.Class<?> wildcardClass6 = systemNotification0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(systemNotification0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Procuring book if possible" + "'", str4.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Procuring book if possible" + "'", str5.equals("Procuring book if possible"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

