package randooptestcases;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextbookInfortestcases {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test001");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.Class<?> wildcardClass7 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test002");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test003");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        java.lang.String str12 = textbookInfo9.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test004");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        java.lang.Class<?> wildcardClass28 = textbookInfo17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test005");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        int int58 = textbookInfo45.getEdition();
        Models.TextbookInfo textbookInfo59 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = textbookInfo45.newEdition(textbookInfo59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test006");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        java.lang.Class<?> wildcardClass34 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test007");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        java.lang.String str8 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass9 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test008");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        java.lang.Class<?> wildcardClass58 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test009");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        java.lang.Class<?> wildcardClass27 = textbookInfo17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test010");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.Class<?> wildcardClass40 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test011");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass8 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test012");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass4 = textbookInfo2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test013");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        java.lang.String str28 = textbookInfo17.getTextbook();
        java.lang.String str29 = textbookInfo17.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test014");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo22.getTextbook();
        int int25 = textbookInfo22.getEdition();
        boolean boolean26 = textbookInfo5.newEdition(textbookInfo22);
        java.lang.Class<?> wildcardClass27 = textbookInfo22.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test015");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        java.lang.Class<?> wildcardClass18 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test016");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.Class<?> wildcardClass62 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test017");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test018");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test019");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (-1));
        int int3 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass4 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test020");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        java.lang.Class<?> wildcardClass27 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test021");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo14.newEdition(textbookInfo18);
        int int20 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        java.lang.String str34 = textbookInfo26.getTextbook();
        boolean boolean35 = textbookInfo18.newEdition(textbookInfo26);
        int int36 = textbookInfo26.getEdition();
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo26);
        java.lang.Class<?> wildcardClass38 = textbookInfo26.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test022");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        java.lang.Class<?> wildcardClass88 = textbookInfo64.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test023");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        int int34 = textbookInfo5.getEdition();
        java.lang.Class<?> wildcardClass35 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test024");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.Class<?> wildcardClass37 = textbookInfo30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test025");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) 'a');
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        java.lang.String str24 = textbookInfo8.getTextbook();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo8.newEdition(textbookInfo48);
        int int61 = textbookInfo48.getEdition();
        java.lang.String str62 = textbookInfo48.getTextbook();
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo68 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean69 = textbookInfo65.newEdition(textbookInfo68);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo78 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean79 = textbookInfo75.newEdition(textbookInfo78);
        java.lang.String str80 = textbookInfo75.getTextbook();
        java.lang.String str81 = textbookInfo75.getTextbook();
        boolean boolean82 = textbookInfo72.newEdition(textbookInfo75);
        boolean boolean83 = textbookInfo68.newEdition(textbookInfo75);
        Models.TextbookInfo textbookInfo86 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo89 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo92 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean93 = textbookInfo89.newEdition(textbookInfo92);
        java.lang.String str94 = textbookInfo89.getTextbook();
        java.lang.String str95 = textbookInfo89.getTextbook();
        boolean boolean96 = textbookInfo86.newEdition(textbookInfo89);
        boolean boolean97 = textbookInfo68.newEdition(textbookInfo86);
        boolean boolean98 = textbookInfo48.newEdition(textbookInfo68);
        boolean boolean99 = textbookInfo2.newEdition(textbookInfo68);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test026");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = textbookInfo17.newEdition(textbookInfo34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test027");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = textbookInfo5.newEdition(textbookInfo62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test028");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test029");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.Class<?> wildcardClass11 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test030");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) ' ');
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test031");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass4 = textbookInfo2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test032");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        int int58 = textbookInfo45.getEdition();
        java.lang.String str59 = textbookInfo45.getTextbook();
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean66 = textbookInfo62.newEdition(textbookInfo65);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean76 = textbookInfo72.newEdition(textbookInfo75);
        java.lang.String str77 = textbookInfo72.getTextbook();
        java.lang.String str78 = textbookInfo72.getTextbook();
        boolean boolean79 = textbookInfo69.newEdition(textbookInfo72);
        boolean boolean80 = textbookInfo65.newEdition(textbookInfo72);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo86 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo89 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean90 = textbookInfo86.newEdition(textbookInfo89);
        java.lang.String str91 = textbookInfo86.getTextbook();
        java.lang.String str92 = textbookInfo86.getTextbook();
        boolean boolean93 = textbookInfo83.newEdition(textbookInfo86);
        boolean boolean94 = textbookInfo65.newEdition(textbookInfo83);
        boolean boolean95 = textbookInfo45.newEdition(textbookInfo65);
        int int96 = textbookInfo65.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test033");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        boolean boolean49 = textbookInfo27.newEdition(textbookInfo33);
        boolean boolean50 = textbookInfo2.newEdition(textbookInfo27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test034");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = textbookInfo15.newEdition(textbookInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test035");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '4');
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test036");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo12.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", (int) (byte) 10);
        int int25 = textbookInfo24.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo28.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo38.getTextbook();
        java.lang.String str44 = textbookInfo38.getTextbook();
        boolean boolean45 = textbookInfo35.newEdition(textbookInfo38);
        boolean boolean46 = textbookInfo31.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        java.lang.String str57 = textbookInfo52.getTextbook();
        java.lang.String str58 = textbookInfo52.getTextbook();
        boolean boolean59 = textbookInfo49.newEdition(textbookInfo52);
        boolean boolean60 = textbookInfo31.newEdition(textbookInfo49);
        boolean boolean61 = textbookInfo24.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean68 = textbookInfo64.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo71 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean78 = textbookInfo74.newEdition(textbookInfo77);
        java.lang.String str79 = textbookInfo74.getTextbook();
        java.lang.String str80 = textbookInfo74.getTextbook();
        boolean boolean81 = textbookInfo71.newEdition(textbookInfo74);
        boolean boolean82 = textbookInfo67.newEdition(textbookInfo74);
        java.lang.String str83 = textbookInfo74.getTextbook();
        boolean boolean84 = textbookInfo31.newEdition(textbookInfo74);
        boolean boolean85 = textbookInfo12.newEdition(textbookInfo31);
        int int86 = textbookInfo12.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test037");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test038");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        java.lang.String str3 = textbookInfo2.getTextbook();
        int int4 = textbookInfo2.getEdition();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test039");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        java.lang.Class<?> wildcardClass36 = textbookInfo25.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test040");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        Models.TextbookInfo textbookInfo88 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = textbookInfo5.newEdition(textbookInfo88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test041");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.Class<?> wildcardClass49 = textbookInfo18.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test042");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo12.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", (int) (byte) 10);
        int int25 = textbookInfo24.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo28.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo38.getTextbook();
        java.lang.String str44 = textbookInfo38.getTextbook();
        boolean boolean45 = textbookInfo35.newEdition(textbookInfo38);
        boolean boolean46 = textbookInfo31.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        java.lang.String str57 = textbookInfo52.getTextbook();
        java.lang.String str58 = textbookInfo52.getTextbook();
        boolean boolean59 = textbookInfo49.newEdition(textbookInfo52);
        boolean boolean60 = textbookInfo31.newEdition(textbookInfo49);
        boolean boolean61 = textbookInfo24.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean68 = textbookInfo64.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo71 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean78 = textbookInfo74.newEdition(textbookInfo77);
        java.lang.String str79 = textbookInfo74.getTextbook();
        java.lang.String str80 = textbookInfo74.getTextbook();
        boolean boolean81 = textbookInfo71.newEdition(textbookInfo74);
        boolean boolean82 = textbookInfo67.newEdition(textbookInfo74);
        java.lang.String str83 = textbookInfo74.getTextbook();
        boolean boolean84 = textbookInfo31.newEdition(textbookInfo74);
        boolean boolean85 = textbookInfo12.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo86 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = textbookInfo31.newEdition(textbookInfo86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test043");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo12.getTextbook();
        int int22 = textbookInfo12.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test044");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        int int22 = textbookInfo5.getEdition();
        int int23 = textbookInfo5.getEdition();
        java.lang.Class<?> wildcardClass24 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test045");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test046");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        int int25 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean35 = textbookInfo31.newEdition(textbookInfo34);
        java.lang.String str36 = textbookInfo31.getTextbook();
        java.lang.String str37 = textbookInfo31.getTextbook();
        boolean boolean38 = textbookInfo28.newEdition(textbookInfo31);
        java.lang.String str39 = textbookInfo31.getTextbook();
        boolean boolean40 = textbookInfo2.newEdition(textbookInfo31);
        int int41 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass42 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test047");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.Class<?> wildcardClass17 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test048");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        java.lang.String str27 = textbookInfo9.getTextbook();
        java.lang.Class<?> wildcardClass28 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test049");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str13 = textbookInfo5.getTextbook();
        java.lang.Class<?> wildcardClass14 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test050");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.String str25 = textbookInfo8.getTextbook();
        int int26 = textbookInfo8.getEdition();
        java.lang.Class<?> wildcardClass27 = textbookInfo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test051");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        java.lang.String str41 = textbookInfo9.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test052");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        int int8 = textbookInfo5.getEdition();
        int int9 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test053");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test054");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("", (int) (byte) 10);
        int int11 = textbookInfo10.getEdition();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo10);
        java.lang.Class<?> wildcardClass13 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test055");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        int int25 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean35 = textbookInfo31.newEdition(textbookInfo34);
        java.lang.String str36 = textbookInfo31.getTextbook();
        java.lang.String str37 = textbookInfo31.getTextbook();
        boolean boolean38 = textbookInfo28.newEdition(textbookInfo31);
        java.lang.String str39 = textbookInfo31.getTextbook();
        boolean boolean40 = textbookInfo2.newEdition(textbookInfo31);
        java.lang.Class<?> wildcardClass41 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test056");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.String str37 = textbookInfo30.getTextbook();
        java.lang.String str38 = textbookInfo30.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test057");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str19 = textbookInfo14.getTextbook();
        java.lang.String str20 = textbookInfo14.getTextbook();
        boolean boolean21 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo27.newEdition(textbookInfo31);
        int int33 = textbookInfo27.getEdition();
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean40 = textbookInfo36.newEdition(textbookInfo39);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean50 = textbookInfo46.newEdition(textbookInfo49);
        java.lang.String str51 = textbookInfo46.getTextbook();
        java.lang.String str52 = textbookInfo46.getTextbook();
        boolean boolean53 = textbookInfo43.newEdition(textbookInfo46);
        boolean boolean54 = textbookInfo39.newEdition(textbookInfo46);
        boolean boolean55 = textbookInfo27.newEdition(textbookInfo39);
        int int56 = textbookInfo27.getEdition();
        boolean boolean57 = textbookInfo11.newEdition(textbookInfo27);
        boolean boolean58 = textbookInfo2.newEdition(textbookInfo11);
        int int59 = textbookInfo11.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test058");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass5 = textbookInfo2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test059");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        java.lang.Class<?> wildcardClass58 = textbookInfo45.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test060");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 10);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test061");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        int int12 = textbookInfo9.getEdition();
        int int13 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) 'a');
        boolean boolean17 = textbookInfo9.newEdition(textbookInfo16);
        int int18 = textbookInfo16.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test062");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) '4');
        java.lang.String str3 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test063");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        java.lang.String str12 = textbookInfo9.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test064");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test065");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        int int10 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test066");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str62 = textbookInfo5.getTextbook();
        java.lang.String str63 = textbookInfo5.getTextbook();
        int int64 = textbookInfo5.getEdition();
        java.lang.String str65 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test067");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo41.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("", (int) (byte) 10);
        int int60 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo76 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean77 = textbookInfo73.newEdition(textbookInfo76);
        java.lang.String str78 = textbookInfo73.getTextbook();
        java.lang.String str79 = textbookInfo73.getTextbook();
        boolean boolean80 = textbookInfo70.newEdition(textbookInfo73);
        boolean boolean81 = textbookInfo66.newEdition(textbookInfo73);
        Models.TextbookInfo textbookInfo84 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo87 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo90 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean91 = textbookInfo87.newEdition(textbookInfo90);
        java.lang.String str92 = textbookInfo87.getTextbook();
        java.lang.String str93 = textbookInfo87.getTextbook();
        boolean boolean94 = textbookInfo84.newEdition(textbookInfo87);
        boolean boolean95 = textbookInfo66.newEdition(textbookInfo84);
        boolean boolean96 = textbookInfo59.newEdition(textbookInfo66);
        boolean boolean97 = textbookInfo41.newEdition(textbookInfo59);
        boolean boolean98 = textbookInfo2.newEdition(textbookInfo59);
        java.lang.Class<?> wildcardClass99 = textbookInfo59.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test068");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.String str37 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo46.getTextbook();
        java.lang.String str49 = textbookInfo46.getTextbook();
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo67.getTextbook();
        java.lang.String str73 = textbookInfo67.getTextbook();
        boolean boolean74 = textbookInfo64.newEdition(textbookInfo67);
        java.lang.String str75 = textbookInfo67.getTextbook();
        boolean boolean76 = textbookInfo59.newEdition(textbookInfo67);
        int int77 = textbookInfo67.getEdition();
        boolean boolean78 = textbookInfo46.newEdition(textbookInfo67);
        boolean boolean79 = textbookInfo40.newEdition(textbookInfo67);
        int int80 = textbookInfo67.getEdition();
        boolean boolean81 = textbookInfo17.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo84 = new Models.TextbookInfo("", (int) (short) 0);
        boolean boolean85 = textbookInfo17.newEdition(textbookInfo84);
        java.lang.String str86 = textbookInfo84.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test069");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test070");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("", (int) (byte) 10);
        int int61 = textbookInfo60.getEdition();
        boolean boolean62 = textbookInfo45.newEdition(textbookInfo60);
        java.lang.Class<?> wildcardClass63 = textbookInfo60.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test071");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        int int18 = textbookInfo14.getEdition();
        java.lang.String str19 = textbookInfo14.getTextbook();
        java.lang.Class<?> wildcardClass20 = textbookInfo14.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test072");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo14.newEdition(textbookInfo18);
        int int20 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        java.lang.String str34 = textbookInfo26.getTextbook();
        boolean boolean35 = textbookInfo18.newEdition(textbookInfo26);
        int int36 = textbookInfo26.getEdition();
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo26);
        int int38 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test073");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo12.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", (int) (byte) 10);
        int int25 = textbookInfo24.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo28.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo38.getTextbook();
        java.lang.String str44 = textbookInfo38.getTextbook();
        boolean boolean45 = textbookInfo35.newEdition(textbookInfo38);
        boolean boolean46 = textbookInfo31.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        java.lang.String str57 = textbookInfo52.getTextbook();
        java.lang.String str58 = textbookInfo52.getTextbook();
        boolean boolean59 = textbookInfo49.newEdition(textbookInfo52);
        boolean boolean60 = textbookInfo31.newEdition(textbookInfo49);
        boolean boolean61 = textbookInfo24.newEdition(textbookInfo31);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean68 = textbookInfo64.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo71 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean78 = textbookInfo74.newEdition(textbookInfo77);
        java.lang.String str79 = textbookInfo74.getTextbook();
        java.lang.String str80 = textbookInfo74.getTextbook();
        boolean boolean81 = textbookInfo71.newEdition(textbookInfo74);
        boolean boolean82 = textbookInfo67.newEdition(textbookInfo74);
        java.lang.String str83 = textbookInfo74.getTextbook();
        boolean boolean84 = textbookInfo31.newEdition(textbookInfo74);
        boolean boolean85 = textbookInfo12.newEdition(textbookInfo31);
        java.lang.String str86 = textbookInfo12.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test074");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.Class<?> wildcardClass8 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test075");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", (int) (byte) 10);
        int int6 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        java.lang.String str38 = textbookInfo33.getTextbook();
        java.lang.String str39 = textbookInfo33.getTextbook();
        boolean boolean40 = textbookInfo30.newEdition(textbookInfo33);
        boolean boolean41 = textbookInfo12.newEdition(textbookInfo30);
        boolean boolean42 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean59 = textbookInfo55.newEdition(textbookInfo58);
        java.lang.String str60 = textbookInfo55.getTextbook();
        java.lang.String str61 = textbookInfo55.getTextbook();
        boolean boolean62 = textbookInfo52.newEdition(textbookInfo55);
        boolean boolean63 = textbookInfo48.newEdition(textbookInfo55);
        java.lang.String str64 = textbookInfo55.getTextbook();
        boolean boolean65 = textbookInfo12.newEdition(textbookInfo55);
        boolean boolean66 = textbookInfo2.newEdition(textbookInfo12);
        java.lang.Class<?> wildcardClass67 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test076");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.String str37 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo46.getTextbook();
        java.lang.String str49 = textbookInfo46.getTextbook();
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo67.getTextbook();
        java.lang.String str73 = textbookInfo67.getTextbook();
        boolean boolean74 = textbookInfo64.newEdition(textbookInfo67);
        java.lang.String str75 = textbookInfo67.getTextbook();
        boolean boolean76 = textbookInfo59.newEdition(textbookInfo67);
        int int77 = textbookInfo67.getEdition();
        boolean boolean78 = textbookInfo46.newEdition(textbookInfo67);
        boolean boolean79 = textbookInfo40.newEdition(textbookInfo67);
        int int80 = textbookInfo67.getEdition();
        boolean boolean81 = textbookInfo17.newEdition(textbookInfo67);
        java.lang.Class<?> wildcardClass82 = textbookInfo67.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test077");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        int int58 = textbookInfo45.getEdition();
        java.lang.String str59 = textbookInfo45.getTextbook();
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean66 = textbookInfo62.newEdition(textbookInfo65);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean76 = textbookInfo72.newEdition(textbookInfo75);
        java.lang.String str77 = textbookInfo72.getTextbook();
        java.lang.String str78 = textbookInfo72.getTextbook();
        boolean boolean79 = textbookInfo69.newEdition(textbookInfo72);
        boolean boolean80 = textbookInfo65.newEdition(textbookInfo72);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo86 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo89 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean90 = textbookInfo86.newEdition(textbookInfo89);
        java.lang.String str91 = textbookInfo86.getTextbook();
        java.lang.String str92 = textbookInfo86.getTextbook();
        boolean boolean93 = textbookInfo83.newEdition(textbookInfo86);
        boolean boolean94 = textbookInfo65.newEdition(textbookInfo83);
        boolean boolean95 = textbookInfo45.newEdition(textbookInfo65);
        java.lang.String str96 = textbookInfo45.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test078");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        boolean boolean26 = textbookInfo11.newEdition(textbookInfo18);
        boolean boolean27 = textbookInfo5.newEdition(textbookInfo11);
        int int28 = textbookInfo11.getEdition();
        boolean boolean29 = textbookInfo2.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        int int37 = textbookInfo32.getEdition();
        int int38 = textbookInfo32.getEdition();
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean45 = textbookInfo41.newEdition(textbookInfo44);
        java.lang.String str46 = textbookInfo44.getTextbook();
        java.lang.String str47 = textbookInfo44.getTextbook();
        int int48 = textbookInfo44.getEdition();
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo54.newEdition(textbookInfo57);
        java.lang.String str59 = textbookInfo54.getTextbook();
        java.lang.String str60 = textbookInfo54.getTextbook();
        boolean boolean61 = textbookInfo51.newEdition(textbookInfo54);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean68 = textbookInfo64.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo71 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean72 = textbookInfo67.newEdition(textbookInfo71);
        java.lang.String str73 = textbookInfo71.getTextbook();
        int int74 = textbookInfo71.getEdition();
        boolean boolean75 = textbookInfo54.newEdition(textbookInfo71);
        boolean boolean76 = textbookInfo44.newEdition(textbookInfo54);
        boolean boolean77 = textbookInfo32.newEdition(textbookInfo54);
        int int78 = textbookInfo32.getEdition();
        int int79 = textbookInfo32.getEdition();
        boolean boolean80 = textbookInfo11.newEdition(textbookInfo32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test079");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        boolean boolean26 = textbookInfo11.newEdition(textbookInfo18);
        boolean boolean27 = textbookInfo5.newEdition(textbookInfo11);
        int int28 = textbookInfo11.getEdition();
        boolean boolean29 = textbookInfo2.newEdition(textbookInfo11);
        java.lang.String str30 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass31 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test080");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("", (int) (short) 0);
        java.lang.String str43 = textbookInfo42.getTextbook();
        boolean boolean44 = textbookInfo9.newEdition(textbookInfo42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test081");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        int int21 = textbookInfo12.getEdition();
        java.lang.Class<?> wildcardClass22 = textbookInfo12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test082");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test083");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo14.newEdition(textbookInfo18);
        int int20 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        java.lang.String str34 = textbookInfo26.getTextbook();
        boolean boolean35 = textbookInfo18.newEdition(textbookInfo26);
        int int36 = textbookInfo26.getEdition();
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo26);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo43.getTextbook();
        java.lang.String str46 = textbookInfo43.getTextbook();
        int int47 = textbookInfo43.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean57 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str58 = textbookInfo53.getTextbook();
        java.lang.String str59 = textbookInfo53.getTextbook();
        boolean boolean60 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo66.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo70.getTextbook();
        int int73 = textbookInfo70.getEdition();
        boolean boolean74 = textbookInfo53.newEdition(textbookInfo70);
        boolean boolean75 = textbookInfo43.newEdition(textbookInfo53);
        int int76 = textbookInfo53.getEdition();
        Models.TextbookInfo textbookInfo79 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo82 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean83 = textbookInfo79.newEdition(textbookInfo82);
        int int84 = textbookInfo79.getEdition();
        boolean boolean85 = textbookInfo53.newEdition(textbookInfo79);
        boolean boolean86 = textbookInfo5.newEdition(textbookInfo53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test084");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.Class<?> wildcardClass21 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test085");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        int int22 = textbookInfo5.getEdition();
        java.lang.String str23 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo29.getTextbook();
        java.lang.String str32 = textbookInfo29.getTextbook();
        int int33 = textbookInfo29.getEdition();
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean43 = textbookInfo39.newEdition(textbookInfo42);
        java.lang.String str44 = textbookInfo39.getTextbook();
        java.lang.String str45 = textbookInfo39.getTextbook();
        boolean boolean46 = textbookInfo36.newEdition(textbookInfo39);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean53 = textbookInfo49.newEdition(textbookInfo52);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean57 = textbookInfo52.newEdition(textbookInfo56);
        java.lang.String str58 = textbookInfo56.getTextbook();
        int int59 = textbookInfo56.getEdition();
        boolean boolean60 = textbookInfo39.newEdition(textbookInfo56);
        boolean boolean61 = textbookInfo29.newEdition(textbookInfo39);
        int int62 = textbookInfo39.getEdition();
        boolean boolean63 = textbookInfo5.newEdition(textbookInfo39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test086");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo8.getTextbook();
        java.lang.String str11 = textbookInfo8.getTextbook();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo17.newEdition(textbookInfo21);
        int int23 = textbookInfo21.getEdition();
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo29.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo29.getTextbook();
        java.lang.String str35 = textbookInfo29.getTextbook();
        boolean boolean36 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str37 = textbookInfo29.getTextbook();
        boolean boolean38 = textbookInfo21.newEdition(textbookInfo29);
        int int39 = textbookInfo29.getEdition();
        boolean boolean40 = textbookInfo8.newEdition(textbookInfo29);
        boolean boolean41 = textbookInfo2.newEdition(textbookInfo29);
        java.lang.String str42 = textbookInfo2.getTextbook();
        java.lang.String str43 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test087");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test088");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        int int62 = textbookInfo5.getEdition();
        java.lang.String str63 = textbookInfo5.getTextbook();
        java.lang.Class<?> wildcardClass64 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test089");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        int int40 = textbookInfo2.getEdition();
        int int41 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass42 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test090");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        int int5 = textbookInfo2.getEdition();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test091");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        int int8 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("", 10);
        int int12 = textbookInfo11.getEdition();
        boolean boolean13 = textbookInfo5.newEdition(textbookInfo11);
        java.lang.String str14 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test092");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        java.lang.String str28 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("", (int) (byte) 10);
        int int32 = textbookInfo31.getEdition();
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean39 = textbookInfo35.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        java.lang.String str50 = textbookInfo45.getTextbook();
        java.lang.String str51 = textbookInfo45.getTextbook();
        boolean boolean52 = textbookInfo42.newEdition(textbookInfo45);
        boolean boolean53 = textbookInfo38.newEdition(textbookInfo45);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean63 = textbookInfo59.newEdition(textbookInfo62);
        java.lang.String str64 = textbookInfo59.getTextbook();
        java.lang.String str65 = textbookInfo59.getTextbook();
        boolean boolean66 = textbookInfo56.newEdition(textbookInfo59);
        boolean boolean67 = textbookInfo38.newEdition(textbookInfo56);
        boolean boolean68 = textbookInfo31.newEdition(textbookInfo38);
        java.lang.String str69 = textbookInfo38.getTextbook();
        int int70 = textbookInfo38.getEdition();
        java.lang.String str71 = textbookInfo38.getTextbook();
        boolean boolean72 = textbookInfo17.newEdition(textbookInfo38);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test093");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 52);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test094");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        int int38 = textbookInfo15.getEdition();
        java.lang.Class<?> wildcardClass39 = textbookInfo15.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test095");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        java.lang.String str12 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test096");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test097");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        boolean boolean34 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str35 = textbookInfo23.getTextbook();
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean46 = textbookInfo41.newEdition(textbookInfo45);
        int int47 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean64 = textbookInfo60.newEdition(textbookInfo63);
        java.lang.String str65 = textbookInfo60.getTextbook();
        java.lang.String str66 = textbookInfo60.getTextbook();
        boolean boolean67 = textbookInfo57.newEdition(textbookInfo60);
        boolean boolean68 = textbookInfo53.newEdition(textbookInfo60);
        boolean boolean69 = textbookInfo41.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean73 = textbookInfo41.newEdition(textbookInfo72);
        boolean boolean74 = textbookInfo23.newEdition(textbookInfo72);
        java.lang.Class<?> wildcardClass75 = textbookInfo23.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test098");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        int int9 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass10 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test099");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) -1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test100");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.String str49 = textbookInfo18.getTextbook();
        int int50 = textbookInfo18.getEdition();
        java.lang.String str51 = textbookInfo18.getTextbook();
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo54.newEdition(textbookInfo57);
        java.lang.String str59 = textbookInfo54.getTextbook();
        java.lang.String str60 = textbookInfo54.getTextbook();
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        java.lang.String str68 = textbookInfo66.getTextbook();
        boolean boolean69 = textbookInfo54.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", 100);
        boolean boolean73 = textbookInfo54.newEdition(textbookInfo72);
        boolean boolean74 = textbookInfo18.newEdition(textbookInfo54);
        int int75 = textbookInfo54.getEdition();
        java.lang.String str76 = textbookInfo54.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test101");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass4 = textbookInfo2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test102");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        boolean boolean49 = textbookInfo27.newEdition(textbookInfo33);
        int int50 = textbookInfo27.getEdition();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo56.newEdition(textbookInfo59);
        java.lang.String str61 = textbookInfo56.getTextbook();
        java.lang.String str62 = textbookInfo56.getTextbook();
        boolean boolean63 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str64 = textbookInfo56.getTextbook();
        boolean boolean65 = textbookInfo27.newEdition(textbookInfo56);
        int int66 = textbookInfo27.getEdition();
        boolean boolean67 = textbookInfo8.newEdition(textbookInfo27);
        java.lang.String str68 = textbookInfo8.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test103");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass5 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test104");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        java.lang.String str36 = textbookInfo2.getTextbook();
        java.lang.String str37 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test105");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        java.lang.String str36 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass37 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test106");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        boolean boolean34 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str35 = textbookInfo23.getTextbook();
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean46 = textbookInfo41.newEdition(textbookInfo45);
        int int47 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean64 = textbookInfo60.newEdition(textbookInfo63);
        java.lang.String str65 = textbookInfo60.getTextbook();
        java.lang.String str66 = textbookInfo60.getTextbook();
        boolean boolean67 = textbookInfo57.newEdition(textbookInfo60);
        boolean boolean68 = textbookInfo53.newEdition(textbookInfo60);
        boolean boolean69 = textbookInfo41.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean73 = textbookInfo41.newEdition(textbookInfo72);
        boolean boolean74 = textbookInfo23.newEdition(textbookInfo72);
        java.lang.String str75 = textbookInfo23.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test107");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '4');
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean10 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("", 52);
        boolean boolean14 = textbookInfo5.newEdition(textbookInfo13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test108");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        int int37 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo43.getTextbook();
        java.lang.String str49 = textbookInfo43.getTextbook();
        boolean boolean50 = textbookInfo40.newEdition(textbookInfo43);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean57 = textbookInfo53.newEdition(textbookInfo56);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean61 = textbookInfo56.newEdition(textbookInfo60);
        int int62 = textbookInfo56.getEdition();
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo68 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean69 = textbookInfo65.newEdition(textbookInfo68);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo78 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean79 = textbookInfo75.newEdition(textbookInfo78);
        java.lang.String str80 = textbookInfo75.getTextbook();
        java.lang.String str81 = textbookInfo75.getTextbook();
        boolean boolean82 = textbookInfo72.newEdition(textbookInfo75);
        boolean boolean83 = textbookInfo68.newEdition(textbookInfo75);
        boolean boolean84 = textbookInfo56.newEdition(textbookInfo68);
        int int85 = textbookInfo56.getEdition();
        boolean boolean86 = textbookInfo40.newEdition(textbookInfo56);
        boolean boolean87 = textbookInfo17.newEdition(textbookInfo40);
        java.lang.Class<?> wildcardClass88 = textbookInfo17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test109");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.String str49 = textbookInfo18.getTextbook();
        java.lang.String str50 = textbookInfo18.getTextbook();
        java.lang.String str51 = textbookInfo18.getTextbook();
        java.lang.String str52 = textbookInfo18.getTextbook();
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("", (int) (byte) 10);
        int int56 = textbookInfo55.getEdition();
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean63 = textbookInfo59.newEdition(textbookInfo62);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean73 = textbookInfo69.newEdition(textbookInfo72);
        java.lang.String str74 = textbookInfo69.getTextbook();
        java.lang.String str75 = textbookInfo69.getTextbook();
        boolean boolean76 = textbookInfo66.newEdition(textbookInfo69);
        boolean boolean77 = textbookInfo62.newEdition(textbookInfo69);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo86 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean87 = textbookInfo83.newEdition(textbookInfo86);
        java.lang.String str88 = textbookInfo83.getTextbook();
        java.lang.String str89 = textbookInfo83.getTextbook();
        boolean boolean90 = textbookInfo80.newEdition(textbookInfo83);
        boolean boolean91 = textbookInfo62.newEdition(textbookInfo80);
        boolean boolean92 = textbookInfo55.newEdition(textbookInfo62);
        boolean boolean93 = textbookInfo18.newEdition(textbookInfo62);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test110");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test111");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("", (int) (byte) 10);
        int int11 = textbookInfo10.getEdition();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo22.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        java.lang.String str38 = textbookInfo30.getTextbook();
        boolean boolean39 = textbookInfo22.newEdition(textbookInfo30);
        int int40 = textbookInfo30.getEdition();
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        int int48 = textbookInfo43.getEdition();
        boolean boolean49 = textbookInfo30.newEdition(textbookInfo43);
        java.lang.String str50 = textbookInfo30.getTextbook();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo56.newEdition(textbookInfo59);
        java.lang.String str61 = textbookInfo59.getTextbook();
        java.lang.String str62 = textbookInfo59.getTextbook();
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo68 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean69 = textbookInfo65.newEdition(textbookInfo68);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean73 = textbookInfo68.newEdition(textbookInfo72);
        int int74 = textbookInfo72.getEdition();
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean84 = textbookInfo80.newEdition(textbookInfo83);
        java.lang.String str85 = textbookInfo80.getTextbook();
        java.lang.String str86 = textbookInfo80.getTextbook();
        boolean boolean87 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str88 = textbookInfo80.getTextbook();
        boolean boolean89 = textbookInfo72.newEdition(textbookInfo80);
        int int90 = textbookInfo80.getEdition();
        boolean boolean91 = textbookInfo59.newEdition(textbookInfo80);
        boolean boolean92 = textbookInfo53.newEdition(textbookInfo80);
        int int93 = textbookInfo80.getEdition();
        boolean boolean94 = textbookInfo30.newEdition(textbookInfo80);
        boolean boolean95 = textbookInfo2.newEdition(textbookInfo30);
        java.lang.String str96 = textbookInfo30.getTextbook();
        java.lang.String str97 = textbookInfo30.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test112");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", 0);
        boolean boolean37 = textbookInfo17.newEdition(textbookInfo36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test113");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        java.lang.String str8 = textbookInfo2.getTextbook();
        int int9 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test114");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        java.lang.String str9 = textbookInfo2.getTextbook();
        java.lang.Class<?> wildcardClass10 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test115");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (-1));
        java.lang.String str3 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test116");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str13 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        boolean boolean34 = textbookInfo19.newEdition(textbookInfo26);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("", (int) (byte) 10);
        int int38 = textbookInfo37.getEdition();
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean45 = textbookInfo41.newEdition(textbookInfo44);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo44.newEdition(textbookInfo51);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo68 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean69 = textbookInfo65.newEdition(textbookInfo68);
        java.lang.String str70 = textbookInfo65.getTextbook();
        java.lang.String str71 = textbookInfo65.getTextbook();
        boolean boolean72 = textbookInfo62.newEdition(textbookInfo65);
        boolean boolean73 = textbookInfo44.newEdition(textbookInfo62);
        boolean boolean74 = textbookInfo37.newEdition(textbookInfo44);
        boolean boolean75 = textbookInfo19.newEdition(textbookInfo37);
        java.lang.String str76 = textbookInfo19.getTextbook();
        java.lang.String str77 = textbookInfo19.getTextbook();
        int int78 = textbookInfo19.getEdition();
        boolean boolean79 = textbookInfo2.newEdition(textbookInfo19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test117");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        java.lang.String str37 = textbookInfo32.getTextbook();
        java.lang.String str38 = textbookInfo32.getTextbook();
        boolean boolean39 = textbookInfo29.newEdition(textbookInfo32);
        boolean boolean40 = textbookInfo25.newEdition(textbookInfo32);
        boolean boolean41 = textbookInfo19.newEdition(textbookInfo25);
        java.lang.String str42 = textbookInfo25.getTextbook();
        boolean boolean43 = textbookInfo5.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = textbookInfo25.newEdition(textbookInfo44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test118");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str13 = textbookInfo5.getTextbook();
        java.lang.String str14 = textbookInfo5.getTextbook();
        java.lang.String str15 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test119");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) 'a');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test120");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) '#');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test121");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str62 = textbookInfo5.getTextbook();
        int int63 = textbookInfo5.getEdition();
        java.lang.String str64 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test122");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo41.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("", (int) (byte) 10);
        int int60 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo76 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean77 = textbookInfo73.newEdition(textbookInfo76);
        java.lang.String str78 = textbookInfo73.getTextbook();
        java.lang.String str79 = textbookInfo73.getTextbook();
        boolean boolean80 = textbookInfo70.newEdition(textbookInfo73);
        boolean boolean81 = textbookInfo66.newEdition(textbookInfo73);
        Models.TextbookInfo textbookInfo84 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo87 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo90 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean91 = textbookInfo87.newEdition(textbookInfo90);
        java.lang.String str92 = textbookInfo87.getTextbook();
        java.lang.String str93 = textbookInfo87.getTextbook();
        boolean boolean94 = textbookInfo84.newEdition(textbookInfo87);
        boolean boolean95 = textbookInfo66.newEdition(textbookInfo84);
        boolean boolean96 = textbookInfo59.newEdition(textbookInfo66);
        boolean boolean97 = textbookInfo41.newEdition(textbookInfo59);
        boolean boolean98 = textbookInfo2.newEdition(textbookInfo59);
        int int99 = textbookInfo59.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 10 + "'", int99 == 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test123");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("", (int) (byte) 10);
        int int11 = textbookInfo10.getEdition();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo22.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        java.lang.String str38 = textbookInfo30.getTextbook();
        boolean boolean39 = textbookInfo22.newEdition(textbookInfo30);
        int int40 = textbookInfo30.getEdition();
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        int int48 = textbookInfo43.getEdition();
        boolean boolean49 = textbookInfo30.newEdition(textbookInfo43);
        java.lang.String str50 = textbookInfo30.getTextbook();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo56.newEdition(textbookInfo59);
        java.lang.String str61 = textbookInfo59.getTextbook();
        java.lang.String str62 = textbookInfo59.getTextbook();
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo68 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean69 = textbookInfo65.newEdition(textbookInfo68);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean73 = textbookInfo68.newEdition(textbookInfo72);
        int int74 = textbookInfo72.getEdition();
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean84 = textbookInfo80.newEdition(textbookInfo83);
        java.lang.String str85 = textbookInfo80.getTextbook();
        java.lang.String str86 = textbookInfo80.getTextbook();
        boolean boolean87 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str88 = textbookInfo80.getTextbook();
        boolean boolean89 = textbookInfo72.newEdition(textbookInfo80);
        int int90 = textbookInfo80.getEdition();
        boolean boolean91 = textbookInfo59.newEdition(textbookInfo80);
        boolean boolean92 = textbookInfo53.newEdition(textbookInfo80);
        int int93 = textbookInfo80.getEdition();
        boolean boolean94 = textbookInfo30.newEdition(textbookInfo80);
        boolean boolean95 = textbookInfo2.newEdition(textbookInfo30);
        java.lang.String str96 = textbookInfo30.getTextbook();
        int int97 = textbookInfo30.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test124");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo34.getTextbook();
        java.lang.String str40 = textbookInfo34.getTextbook();
        boolean boolean41 = textbookInfo31.newEdition(textbookInfo34);
        boolean boolean42 = textbookInfo27.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo27.newEdition(textbookInfo45);
        boolean boolean57 = textbookInfo5.newEdition(textbookInfo45);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean70 = textbookInfo66.newEdition(textbookInfo69);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo76 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo79 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean80 = textbookInfo76.newEdition(textbookInfo79);
        java.lang.String str81 = textbookInfo76.getTextbook();
        java.lang.String str82 = textbookInfo76.getTextbook();
        boolean boolean83 = textbookInfo73.newEdition(textbookInfo76);
        boolean boolean84 = textbookInfo69.newEdition(textbookInfo76);
        boolean boolean85 = textbookInfo63.newEdition(textbookInfo69);
        int int86 = textbookInfo69.getEdition();
        boolean boolean87 = textbookInfo60.newEdition(textbookInfo69);
        boolean boolean88 = textbookInfo45.newEdition(textbookInfo69);
        int int89 = textbookInfo69.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test125");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test126");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        int int88 = textbookInfo64.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test127");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.String str37 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo46.getTextbook();
        java.lang.String str49 = textbookInfo46.getTextbook();
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo67.getTextbook();
        java.lang.String str73 = textbookInfo67.getTextbook();
        boolean boolean74 = textbookInfo64.newEdition(textbookInfo67);
        java.lang.String str75 = textbookInfo67.getTextbook();
        boolean boolean76 = textbookInfo59.newEdition(textbookInfo67);
        int int77 = textbookInfo67.getEdition();
        boolean boolean78 = textbookInfo46.newEdition(textbookInfo67);
        boolean boolean79 = textbookInfo40.newEdition(textbookInfo67);
        int int80 = textbookInfo67.getEdition();
        boolean boolean81 = textbookInfo17.newEdition(textbookInfo67);
        java.lang.String str82 = textbookInfo17.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test128");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test129");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        java.lang.String str37 = textbookInfo32.getTextbook();
        java.lang.String str38 = textbookInfo32.getTextbook();
        boolean boolean39 = textbookInfo29.newEdition(textbookInfo32);
        boolean boolean40 = textbookInfo25.newEdition(textbookInfo32);
        boolean boolean41 = textbookInfo19.newEdition(textbookInfo25);
        java.lang.String str42 = textbookInfo25.getTextbook();
        boolean boolean43 = textbookInfo5.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) 0);
        boolean boolean47 = textbookInfo5.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test130");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        boolean boolean56 = textbookInfo41.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("", (int) (byte) 10);
        int int60 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo76 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean77 = textbookInfo73.newEdition(textbookInfo76);
        java.lang.String str78 = textbookInfo73.getTextbook();
        java.lang.String str79 = textbookInfo73.getTextbook();
        boolean boolean80 = textbookInfo70.newEdition(textbookInfo73);
        boolean boolean81 = textbookInfo66.newEdition(textbookInfo73);
        Models.TextbookInfo textbookInfo84 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo87 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo90 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean91 = textbookInfo87.newEdition(textbookInfo90);
        java.lang.String str92 = textbookInfo87.getTextbook();
        java.lang.String str93 = textbookInfo87.getTextbook();
        boolean boolean94 = textbookInfo84.newEdition(textbookInfo87);
        boolean boolean95 = textbookInfo66.newEdition(textbookInfo84);
        boolean boolean96 = textbookInfo59.newEdition(textbookInfo66);
        boolean boolean97 = textbookInfo41.newEdition(textbookInfo59);
        boolean boolean98 = textbookInfo2.newEdition(textbookInfo59);
        int int99 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test131");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        int int38 = textbookInfo15.getEdition();
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean45 = textbookInfo41.newEdition(textbookInfo44);
        int int46 = textbookInfo41.getEdition();
        int int47 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean57 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str58 = textbookInfo53.getTextbook();
        java.lang.String str59 = textbookInfo53.getTextbook();
        boolean boolean60 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean67 = textbookInfo63.newEdition(textbookInfo66);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo66.newEdition(textbookInfo70);
        int int72 = textbookInfo66.getEdition();
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo78 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean79 = textbookInfo75.newEdition(textbookInfo78);
        Models.TextbookInfo textbookInfo82 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo85 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo88 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean89 = textbookInfo85.newEdition(textbookInfo88);
        java.lang.String str90 = textbookInfo85.getTextbook();
        java.lang.String str91 = textbookInfo85.getTextbook();
        boolean boolean92 = textbookInfo82.newEdition(textbookInfo85);
        boolean boolean93 = textbookInfo78.newEdition(textbookInfo85);
        boolean boolean94 = textbookInfo66.newEdition(textbookInfo78);
        int int95 = textbookInfo66.getEdition();
        boolean boolean96 = textbookInfo50.newEdition(textbookInfo66);
        boolean boolean97 = textbookInfo41.newEdition(textbookInfo50);
        boolean boolean98 = textbookInfo15.newEdition(textbookInfo50);
        java.lang.String str99 = textbookInfo15.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test132");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean10 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.Class<?> wildcardClass11 = textbookInfo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test133");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        java.lang.String str38 = textbookInfo15.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test134");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo14.newEdition(textbookInfo18);
        int int20 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        java.lang.String str34 = textbookInfo26.getTextbook();
        boolean boolean35 = textbookInfo18.newEdition(textbookInfo26);
        int int36 = textbookInfo26.getEdition();
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo26);
        int int38 = textbookInfo26.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test135");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        java.lang.String str18 = textbookInfo14.getTextbook();
        java.lang.Class<?> wildcardClass19 = textbookInfo14.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test136");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", 100);
        boolean boolean21 = textbookInfo2.newEdition(textbookInfo20);
        int int22 = textbookInfo2.getEdition();
        int int23 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = textbookInfo2.newEdition(textbookInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test137");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        int int25 = textbookInfo8.getEdition();
        java.lang.String str26 = textbookInfo8.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test138");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '#');
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean11 = textbookInfo7.newEdition(textbookInfo10);
        java.lang.String str12 = textbookInfo10.getTextbook();
        java.lang.String str13 = textbookInfo10.getTextbook();
        int int14 = textbookInfo10.getEdition();
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean24 = textbookInfo20.newEdition(textbookInfo23);
        java.lang.String str25 = textbookInfo20.getTextbook();
        java.lang.String str26 = textbookInfo20.getTextbook();
        boolean boolean27 = textbookInfo17.newEdition(textbookInfo20);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo33.newEdition(textbookInfo37);
        java.lang.String str39 = textbookInfo37.getTextbook();
        int int40 = textbookInfo37.getEdition();
        boolean boolean41 = textbookInfo20.newEdition(textbookInfo37);
        boolean boolean42 = textbookInfo10.newEdition(textbookInfo20);
        int int43 = textbookInfo20.getEdition();
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean50 = textbookInfo46.newEdition(textbookInfo49);
        int int51 = textbookInfo46.getEdition();
        boolean boolean52 = textbookInfo20.newEdition(textbookInfo46);
        boolean boolean53 = textbookInfo2.newEdition(textbookInfo20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test139");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        java.lang.String str17 = textbookInfo14.getTextbook();
        int int18 = textbookInfo14.getEdition();
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo37.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo41.getTextbook();
        int int44 = textbookInfo41.getEdition();
        boolean boolean45 = textbookInfo24.newEdition(textbookInfo41);
        boolean boolean46 = textbookInfo14.newEdition(textbookInfo24);
        boolean boolean47 = textbookInfo2.newEdition(textbookInfo24);
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo53.newEdition(textbookInfo57);
        int int59 = textbookInfo53.getEdition();
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean66 = textbookInfo62.newEdition(textbookInfo65);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean76 = textbookInfo72.newEdition(textbookInfo75);
        java.lang.String str77 = textbookInfo72.getTextbook();
        java.lang.String str78 = textbookInfo72.getTextbook();
        boolean boolean79 = textbookInfo69.newEdition(textbookInfo72);
        boolean boolean80 = textbookInfo65.newEdition(textbookInfo72);
        boolean boolean81 = textbookInfo53.newEdition(textbookInfo65);
        boolean boolean82 = textbookInfo24.newEdition(textbookInfo65);
        java.lang.Class<?> wildcardClass83 = textbookInfo24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test140");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean46 = textbookInfo42.newEdition(textbookInfo45);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        java.lang.String str57 = textbookInfo52.getTextbook();
        java.lang.String str58 = textbookInfo52.getTextbook();
        boolean boolean59 = textbookInfo49.newEdition(textbookInfo52);
        boolean boolean60 = textbookInfo45.newEdition(textbookInfo52);
        java.lang.String str61 = textbookInfo52.getTextbook();
        boolean boolean62 = textbookInfo9.newEdition(textbookInfo52);
        int int63 = textbookInfo9.getEdition();
        int int64 = textbookInfo9.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test141");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        java.lang.String str37 = textbookInfo32.getTextbook();
        java.lang.String str38 = textbookInfo32.getTextbook();
        boolean boolean39 = textbookInfo29.newEdition(textbookInfo32);
        boolean boolean40 = textbookInfo25.newEdition(textbookInfo32);
        boolean boolean41 = textbookInfo19.newEdition(textbookInfo25);
        java.lang.String str42 = textbookInfo25.getTextbook();
        boolean boolean43 = textbookInfo5.newEdition(textbookInfo25);
        java.lang.String str44 = textbookInfo25.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test142");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 0);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", 1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        boolean boolean26 = textbookInfo11.newEdition(textbookInfo18);
        java.lang.String str27 = textbookInfo11.getTextbook();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo54.newEdition(textbookInfo57);
        java.lang.String str59 = textbookInfo54.getTextbook();
        java.lang.String str60 = textbookInfo54.getTextbook();
        boolean boolean61 = textbookInfo51.newEdition(textbookInfo54);
        boolean boolean62 = textbookInfo33.newEdition(textbookInfo51);
        boolean boolean63 = textbookInfo11.newEdition(textbookInfo51);
        int int64 = textbookInfo51.getEdition();
        boolean boolean65 = textbookInfo5.newEdition(textbookInfo51);
        boolean boolean66 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str67 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test143");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        int int34 = textbookInfo5.getEdition();
        java.lang.String str35 = textbookInfo5.getTextbook();
        int int36 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean59 = textbookInfo55.newEdition(textbookInfo58);
        java.lang.String str60 = textbookInfo55.getTextbook();
        java.lang.String str61 = textbookInfo55.getTextbook();
        boolean boolean62 = textbookInfo52.newEdition(textbookInfo55);
        boolean boolean63 = textbookInfo48.newEdition(textbookInfo55);
        boolean boolean64 = textbookInfo42.newEdition(textbookInfo48);
        int int65 = textbookInfo48.getEdition();
        boolean boolean66 = textbookInfo39.newEdition(textbookInfo48);
        boolean boolean67 = textbookInfo5.newEdition(textbookInfo48);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test144");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test145");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        int int49 = textbookInfo18.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test146");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) '4');
        int int20 = textbookInfo19.getEdition();
        boolean boolean21 = textbookInfo5.newEdition(textbookInfo19);
        int int22 = textbookInfo5.getEdition();
        java.lang.Class<?> wildcardClass23 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test147");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        java.lang.String str37 = textbookInfo32.getTextbook();
        java.lang.String str38 = textbookInfo32.getTextbook();
        boolean boolean39 = textbookInfo29.newEdition(textbookInfo32);
        boolean boolean40 = textbookInfo25.newEdition(textbookInfo32);
        boolean boolean41 = textbookInfo19.newEdition(textbookInfo25);
        java.lang.String str42 = textbookInfo25.getTextbook();
        boolean boolean43 = textbookInfo5.newEdition(textbookInfo25);
        int int44 = textbookInfo25.getEdition();
        int int45 = textbookInfo25.getEdition();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test148");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        boolean boolean34 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str35 = textbookInfo23.getTextbook();
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean46 = textbookInfo41.newEdition(textbookInfo45);
        int int47 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean64 = textbookInfo60.newEdition(textbookInfo63);
        java.lang.String str65 = textbookInfo60.getTextbook();
        java.lang.String str66 = textbookInfo60.getTextbook();
        boolean boolean67 = textbookInfo57.newEdition(textbookInfo60);
        boolean boolean68 = textbookInfo53.newEdition(textbookInfo60);
        boolean boolean69 = textbookInfo41.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean73 = textbookInfo41.newEdition(textbookInfo72);
        boolean boolean74 = textbookInfo23.newEdition(textbookInfo72);
        java.lang.Class<?> wildcardClass75 = textbookInfo72.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test149");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        java.lang.String str28 = textbookInfo12.getTextbook();
        boolean boolean29 = textbookInfo5.newEdition(textbookInfo12);
        int int30 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test150");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 0);
        int int3 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test151");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        int int41 = textbookInfo9.getEdition();
        java.lang.String str42 = textbookInfo9.getTextbook();
        int int43 = textbookInfo9.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test152");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str16 = textbookInfo8.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.String str18 = textbookInfo8.getTextbook();
        java.lang.String str19 = textbookInfo8.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test153");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (-1));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test154");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo2.getTextbook();
        java.lang.String str41 = textbookInfo2.getTextbook();
        java.lang.String str42 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test155");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        int int41 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean48 = textbookInfo44.newEdition(textbookInfo47);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo47.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo51.getTextbook();
        int int54 = textbookInfo51.getEdition();
        int int55 = textbookInfo51.getEdition();
        boolean boolean56 = textbookInfo9.newEdition(textbookInfo51);
        int int57 = textbookInfo9.getEdition();
        java.lang.Class<?> wildcardClass58 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test156");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str17 = textbookInfo5.getTextbook();
        java.lang.Class<?> wildcardClass18 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test157");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        int int8 = textbookInfo5.getEdition();
        java.lang.Class<?> wildcardClass9 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test158");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) -1);
        java.lang.String str3 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test159");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        int int25 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) '4');
        int int29 = textbookInfo28.getEdition();
        boolean boolean30 = textbookInfo2.newEdition(textbookInfo28);
        java.lang.String str31 = textbookInfo28.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test160");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.String str25 = textbookInfo8.getTextbook();
        int int26 = textbookInfo8.getEdition();
        int int27 = textbookInfo8.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test161");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("", 100);
        int int43 = textbookInfo42.getEdition();
        int int44 = textbookInfo42.getEdition();
        boolean boolean45 = textbookInfo9.newEdition(textbookInfo42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test162");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str16 = textbookInfo8.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.String str18 = textbookInfo8.getTextbook();
        int int19 = textbookInfo8.getEdition();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test163");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", (int) (byte) 10);
        int int6 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        java.lang.String str38 = textbookInfo33.getTextbook();
        java.lang.String str39 = textbookInfo33.getTextbook();
        boolean boolean40 = textbookInfo30.newEdition(textbookInfo33);
        boolean boolean41 = textbookInfo12.newEdition(textbookInfo30);
        boolean boolean42 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean59 = textbookInfo55.newEdition(textbookInfo58);
        java.lang.String str60 = textbookInfo55.getTextbook();
        java.lang.String str61 = textbookInfo55.getTextbook();
        boolean boolean62 = textbookInfo52.newEdition(textbookInfo55);
        boolean boolean63 = textbookInfo48.newEdition(textbookInfo55);
        java.lang.String str64 = textbookInfo55.getTextbook();
        boolean boolean65 = textbookInfo12.newEdition(textbookInfo55);
        boolean boolean66 = textbookInfo2.newEdition(textbookInfo12);
        int int67 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass68 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test164");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        java.lang.String str17 = textbookInfo14.getTextbook();
        int int18 = textbookInfo14.getEdition();
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo37.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo41.getTextbook();
        int int44 = textbookInfo41.getEdition();
        boolean boolean45 = textbookInfo24.newEdition(textbookInfo41);
        boolean boolean46 = textbookInfo14.newEdition(textbookInfo24);
        boolean boolean47 = textbookInfo2.newEdition(textbookInfo24);
        int int48 = textbookInfo2.getEdition();
        int int49 = textbookInfo2.getEdition();
        int int50 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test165");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        int int49 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test166");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        int int25 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("", 100);
        int int29 = textbookInfo28.getEdition();
        boolean boolean30 = textbookInfo2.newEdition(textbookInfo28);
        java.lang.Class<?> wildcardClass31 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test167");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        int int41 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean48 = textbookInfo44.newEdition(textbookInfo47);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo47.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo51.getTextbook();
        int int54 = textbookInfo51.getEdition();
        int int55 = textbookInfo51.getEdition();
        boolean boolean56 = textbookInfo9.newEdition(textbookInfo51);
        java.lang.Class<?> wildcardClass57 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test168");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean24 = textbookInfo20.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo23.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("", (int) (byte) 10);
        int int42 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean59 = textbookInfo55.newEdition(textbookInfo58);
        java.lang.String str60 = textbookInfo55.getTextbook();
        java.lang.String str61 = textbookInfo55.getTextbook();
        boolean boolean62 = textbookInfo52.newEdition(textbookInfo55);
        boolean boolean63 = textbookInfo48.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean73 = textbookInfo69.newEdition(textbookInfo72);
        java.lang.String str74 = textbookInfo69.getTextbook();
        java.lang.String str75 = textbookInfo69.getTextbook();
        boolean boolean76 = textbookInfo66.newEdition(textbookInfo69);
        boolean boolean77 = textbookInfo48.newEdition(textbookInfo66);
        boolean boolean78 = textbookInfo41.newEdition(textbookInfo48);
        boolean boolean79 = textbookInfo23.newEdition(textbookInfo41);
        java.lang.String str80 = textbookInfo23.getTextbook();
        int int81 = textbookInfo23.getEdition();
        boolean boolean82 = textbookInfo2.newEdition(textbookInfo23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test169");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean14 = textbookInfo10.newEdition(textbookInfo13);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo13.newEdition(textbookInfo17);
        int int19 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str30 = textbookInfo25.getTextbook();
        java.lang.String str31 = textbookInfo25.getTextbook();
        boolean boolean32 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str33 = textbookInfo25.getTextbook();
        boolean boolean34 = textbookInfo17.newEdition(textbookInfo25);
        boolean boolean35 = textbookInfo2.newEdition(textbookInfo25);
        int int36 = textbookInfo25.getEdition();
        java.lang.Class<?> wildcardClass37 = textbookInfo25.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test170");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '4');
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean10 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.Class<?> wildcardClass11 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test171");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        boolean boolean26 = textbookInfo11.newEdition(textbookInfo18);
        boolean boolean27 = textbookInfo5.newEdition(textbookInfo11);
        int int28 = textbookInfo11.getEdition();
        boolean boolean29 = textbookInfo2.newEdition(textbookInfo11);
        int int30 = textbookInfo2.getEdition();
        int int31 = textbookInfo2.getEdition();
        java.lang.String str32 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test172");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean11 = textbookInfo7.newEdition(textbookInfo10);
        int int12 = textbookInfo7.getEdition();
        int int13 = textbookInfo7.getEdition();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo29.newEdition(textbookInfo32);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo32.newEdition(textbookInfo36);
        int int38 = textbookInfo32.getEdition();
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean45 = textbookInfo41.newEdition(textbookInfo44);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo44.newEdition(textbookInfo51);
        boolean boolean60 = textbookInfo32.newEdition(textbookInfo44);
        int int61 = textbookInfo32.getEdition();
        boolean boolean62 = textbookInfo16.newEdition(textbookInfo32);
        boolean boolean63 = textbookInfo7.newEdition(textbookInfo16);
        boolean boolean64 = textbookInfo2.newEdition(textbookInfo16);
        java.lang.Class<?> wildcardClass65 = textbookInfo16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test173");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        java.lang.String str28 = textbookInfo12.getTextbook();
        boolean boolean29 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean39 = textbookInfo35.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo42 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean49 = textbookInfo45.newEdition(textbookInfo48);
        java.lang.String str50 = textbookInfo45.getTextbook();
        java.lang.String str51 = textbookInfo45.getTextbook();
        boolean boolean52 = textbookInfo42.newEdition(textbookInfo45);
        boolean boolean53 = textbookInfo38.newEdition(textbookInfo45);
        boolean boolean54 = textbookInfo32.newEdition(textbookInfo38);
        int int55 = textbookInfo32.getEdition();
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) '4');
        int int59 = textbookInfo58.getEdition();
        boolean boolean60 = textbookInfo32.newEdition(textbookInfo58);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo32);
        int int62 = textbookInfo32.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test174");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("", (int) (short) 0);
        java.lang.String str52 = textbookInfo51.getTextbook();
        boolean boolean53 = textbookInfo18.newEdition(textbookInfo51);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (-1));
        boolean boolean57 = textbookInfo51.newEdition(textbookInfo56);
        java.lang.String str58 = textbookInfo56.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test175");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        int int34 = textbookInfo5.getEdition();
        java.lang.String str35 = textbookInfo5.getTextbook();
        int int36 = textbookInfo5.getEdition();
        java.lang.String str37 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test176");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo8.newEdition(textbookInfo12);
        int int14 = textbookInfo8.getEdition();
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        java.lang.String str32 = textbookInfo27.getTextbook();
        java.lang.String str33 = textbookInfo27.getTextbook();
        boolean boolean34 = textbookInfo24.newEdition(textbookInfo27);
        boolean boolean35 = textbookInfo20.newEdition(textbookInfo27);
        boolean boolean36 = textbookInfo8.newEdition(textbookInfo20);
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean40 = textbookInfo8.newEdition(textbookInfo39);
        java.lang.String str41 = textbookInfo39.getTextbook();
        boolean boolean42 = textbookInfo2.newEdition(textbookInfo39);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("", (int) (byte) 10);
        int int46 = textbookInfo45.getEdition();
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean53 = textbookInfo49.newEdition(textbookInfo52);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean63 = textbookInfo59.newEdition(textbookInfo62);
        java.lang.String str64 = textbookInfo59.getTextbook();
        java.lang.String str65 = textbookInfo59.getTextbook();
        boolean boolean66 = textbookInfo56.newEdition(textbookInfo59);
        boolean boolean67 = textbookInfo52.newEdition(textbookInfo59);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo76 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean77 = textbookInfo73.newEdition(textbookInfo76);
        java.lang.String str78 = textbookInfo73.getTextbook();
        java.lang.String str79 = textbookInfo73.getTextbook();
        boolean boolean80 = textbookInfo70.newEdition(textbookInfo73);
        boolean boolean81 = textbookInfo52.newEdition(textbookInfo70);
        boolean boolean82 = textbookInfo45.newEdition(textbookInfo52);
        int int83 = textbookInfo45.getEdition();
        java.lang.String str84 = textbookInfo45.getTextbook();
        int int85 = textbookInfo45.getEdition();
        boolean boolean86 = textbookInfo39.newEdition(textbookInfo45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test177");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo36);
        int int38 = textbookInfo36.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test178");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        java.lang.String str9 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        int int17 = textbookInfo12.getEdition();
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("", (int) (byte) 10);
        int int21 = textbookInfo20.getEdition();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo20);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo28.newEdition(textbookInfo31);
        java.lang.String str33 = textbookInfo28.getTextbook();
        java.lang.String str34 = textbookInfo28.getTextbook();
        boolean boolean35 = textbookInfo25.newEdition(textbookInfo28);
        java.lang.String str36 = textbookInfo25.getTextbook();
        int int37 = textbookInfo25.getEdition();
        boolean boolean38 = textbookInfo12.newEdition(textbookInfo25);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test179");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        java.lang.Class<?> wildcardClass38 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test180");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '4');
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        java.lang.String str5 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test181");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        boolean boolean49 = textbookInfo27.newEdition(textbookInfo33);
        int int50 = textbookInfo27.getEdition();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo56.newEdition(textbookInfo59);
        java.lang.String str61 = textbookInfo56.getTextbook();
        java.lang.String str62 = textbookInfo56.getTextbook();
        boolean boolean63 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str64 = textbookInfo56.getTextbook();
        boolean boolean65 = textbookInfo27.newEdition(textbookInfo56);
        int int66 = textbookInfo27.getEdition();
        boolean boolean67 = textbookInfo8.newEdition(textbookInfo27);
        int int68 = textbookInfo27.getEdition();
        java.lang.Class<?> wildcardClass69 = textbookInfo27.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test182");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean30 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str31 = textbookInfo26.getTextbook();
        java.lang.String str32 = textbookInfo26.getTextbook();
        boolean boolean33 = textbookInfo23.newEdition(textbookInfo26);
        boolean boolean34 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str35 = textbookInfo23.getTextbook();
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean46 = textbookInfo41.newEdition(textbookInfo45);
        int int47 = textbookInfo41.getEdition();
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean64 = textbookInfo60.newEdition(textbookInfo63);
        java.lang.String str65 = textbookInfo60.getTextbook();
        java.lang.String str66 = textbookInfo60.getTextbook();
        boolean boolean67 = textbookInfo57.newEdition(textbookInfo60);
        boolean boolean68 = textbookInfo53.newEdition(textbookInfo60);
        boolean boolean69 = textbookInfo41.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean73 = textbookInfo41.newEdition(textbookInfo72);
        boolean boolean74 = textbookInfo23.newEdition(textbookInfo72);
        int int75 = textbookInfo23.getEdition();
        java.lang.Class<?> wildcardClass76 = textbookInfo23.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test183");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo2.getTextbook();
        int int41 = textbookInfo2.getEdition();
        java.lang.String str42 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = textbookInfo2.newEdition(textbookInfo43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test184");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        java.lang.Class<?> wildcardClass22 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test185");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.String str49 = textbookInfo18.getTextbook();
        java.lang.String str50 = textbookInfo18.getTextbook();
        java.lang.String str51 = textbookInfo18.getTextbook();
        java.lang.String str52 = textbookInfo18.getTextbook();
        java.lang.Class<?> wildcardClass53 = textbookInfo18.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test186");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str19 = textbookInfo14.getTextbook();
        java.lang.String str20 = textbookInfo14.getTextbook();
        boolean boolean21 = textbookInfo11.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean32 = textbookInfo27.newEdition(textbookInfo31);
        int int33 = textbookInfo27.getEdition();
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean40 = textbookInfo36.newEdition(textbookInfo39);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean50 = textbookInfo46.newEdition(textbookInfo49);
        java.lang.String str51 = textbookInfo46.getTextbook();
        java.lang.String str52 = textbookInfo46.getTextbook();
        boolean boolean53 = textbookInfo43.newEdition(textbookInfo46);
        boolean boolean54 = textbookInfo39.newEdition(textbookInfo46);
        boolean boolean55 = textbookInfo27.newEdition(textbookInfo39);
        int int56 = textbookInfo27.getEdition();
        boolean boolean57 = textbookInfo11.newEdition(textbookInfo27);
        boolean boolean58 = textbookInfo2.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo61 = new Models.TextbookInfo("", 100);
        int int62 = textbookInfo61.getEdition();
        boolean boolean63 = textbookInfo2.newEdition(textbookInfo61);
        java.lang.String str64 = textbookInfo61.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test187");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        int int12 = textbookInfo9.getEdition();
        int int13 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean24 = textbookInfo19.newEdition(textbookInfo23);
        java.lang.String str25 = textbookInfo23.getTextbook();
        int int26 = textbookInfo23.getEdition();
        int int27 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) 'a');
        boolean boolean31 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean32 = textbookInfo9.newEdition(textbookInfo30);
        java.lang.Class<?> wildcardClass33 = textbookInfo30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test188");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        int int8 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        java.lang.String str17 = textbookInfo14.getTextbook();
        int int18 = textbookInfo14.getEdition();
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean38 = textbookInfo34.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo37.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo41.getTextbook();
        int int44 = textbookInfo41.getEdition();
        boolean boolean45 = textbookInfo24.newEdition(textbookInfo41);
        boolean boolean46 = textbookInfo14.newEdition(textbookInfo24);
        boolean boolean47 = textbookInfo2.newEdition(textbookInfo24);
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo53.newEdition(textbookInfo57);
        int int59 = textbookInfo53.getEdition();
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean66 = textbookInfo62.newEdition(textbookInfo65);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean76 = textbookInfo72.newEdition(textbookInfo75);
        java.lang.String str77 = textbookInfo72.getTextbook();
        java.lang.String str78 = textbookInfo72.getTextbook();
        boolean boolean79 = textbookInfo69.newEdition(textbookInfo72);
        boolean boolean80 = textbookInfo65.newEdition(textbookInfo72);
        boolean boolean81 = textbookInfo53.newEdition(textbookInfo65);
        boolean boolean82 = textbookInfo24.newEdition(textbookInfo65);
        java.lang.String str83 = textbookInfo24.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test189");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str27 = textbookInfo22.getTextbook();
        java.lang.String str28 = textbookInfo22.getTextbook();
        boolean boolean29 = textbookInfo19.newEdition(textbookInfo22);
        boolean boolean30 = textbookInfo15.newEdition(textbookInfo22);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo36.newEdition(textbookInfo40);
        int int42 = textbookInfo40.getEdition();
        Models.TextbookInfo textbookInfo45 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        java.lang.String str53 = textbookInfo48.getTextbook();
        java.lang.String str54 = textbookInfo48.getTextbook();
        boolean boolean55 = textbookInfo45.newEdition(textbookInfo48);
        java.lang.String str56 = textbookInfo48.getTextbook();
        boolean boolean57 = textbookInfo40.newEdition(textbookInfo48);
        int int58 = textbookInfo48.getEdition();
        boolean boolean59 = textbookInfo22.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo5.newEdition(textbookInfo22);
        int int61 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test190");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str13 = textbookInfo2.getTextbook();
        java.lang.String str14 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test191");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 0);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", 1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        boolean boolean26 = textbookInfo11.newEdition(textbookInfo18);
        java.lang.String str27 = textbookInfo11.getTextbook();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo57 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean58 = textbookInfo54.newEdition(textbookInfo57);
        java.lang.String str59 = textbookInfo54.getTextbook();
        java.lang.String str60 = textbookInfo54.getTextbook();
        boolean boolean61 = textbookInfo51.newEdition(textbookInfo54);
        boolean boolean62 = textbookInfo33.newEdition(textbookInfo51);
        boolean boolean63 = textbookInfo11.newEdition(textbookInfo51);
        int int64 = textbookInfo51.getEdition();
        boolean boolean65 = textbookInfo5.newEdition(textbookInfo51);
        boolean boolean66 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.Class<?> wildcardClass67 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test192");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        int int40 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass41 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test193");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo22.getTextbook();
        int int25 = textbookInfo22.getEdition();
        boolean boolean26 = textbookInfo5.newEdition(textbookInfo22);
        java.lang.String str27 = textbookInfo22.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test194");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 0);
        int int3 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test195");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test196");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        int int41 = textbookInfo9.getEdition();
        java.lang.String str42 = textbookInfo9.getTextbook();
        java.lang.Class<?> wildcardClass43 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test197");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 52);
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test198");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        Models.TextbookInfo textbookInfo90 = new Models.TextbookInfo("", 35);
        boolean boolean91 = textbookInfo64.newEdition(textbookInfo90);
        java.lang.String str92 = textbookInfo64.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test199");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        java.lang.String str3 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test200");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo8.getTextbook();
        java.lang.String str11 = textbookInfo8.getTextbook();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo17.newEdition(textbookInfo21);
        int int23 = textbookInfo21.getEdition();
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo29.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo29.getTextbook();
        java.lang.String str35 = textbookInfo29.getTextbook();
        boolean boolean36 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str37 = textbookInfo29.getTextbook();
        boolean boolean38 = textbookInfo21.newEdition(textbookInfo29);
        int int39 = textbookInfo29.getEdition();
        boolean boolean40 = textbookInfo8.newEdition(textbookInfo29);
        boolean boolean41 = textbookInfo2.newEdition(textbookInfo29);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("", 52);
        boolean boolean45 = textbookInfo2.newEdition(textbookInfo44);
        java.lang.String str46 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test201");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str13 = textbookInfo5.getTextbook();
        java.lang.String str14 = textbookInfo5.getTextbook();
        int int15 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test202");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        int int17 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean24 = textbookInfo20.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo23.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean48 = textbookInfo44.newEdition(textbookInfo47);
        java.lang.String str49 = textbookInfo44.getTextbook();
        java.lang.String str50 = textbookInfo44.getTextbook();
        boolean boolean51 = textbookInfo41.newEdition(textbookInfo44);
        boolean boolean52 = textbookInfo23.newEdition(textbookInfo41);
        boolean boolean53 = textbookInfo2.newEdition(textbookInfo41);
        java.lang.Class<?> wildcardClass54 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test203");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.Class<?> wildcardClass49 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test204");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        java.lang.String str62 = textbookInfo23.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test205");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", (int) (byte) 10);
        int int6 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        java.lang.String str38 = textbookInfo33.getTextbook();
        java.lang.String str39 = textbookInfo33.getTextbook();
        boolean boolean40 = textbookInfo30.newEdition(textbookInfo33);
        boolean boolean41 = textbookInfo12.newEdition(textbookInfo30);
        boolean boolean42 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str43 = textbookInfo12.getTextbook();
        int int44 = textbookInfo12.getEdition();
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean51 = textbookInfo47.newEdition(textbookInfo50);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo50.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo54.getTextbook();
        int int57 = textbookInfo54.getEdition();
        int int58 = textbookInfo54.getEdition();
        boolean boolean59 = textbookInfo12.newEdition(textbookInfo54);
        boolean boolean60 = textbookInfo2.newEdition(textbookInfo54);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test206");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 100);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        int int5 = textbookInfo2.getEdition();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test207");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) ' ');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test208");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        int int38 = textbookInfo15.getEdition();
        int int39 = textbookInfo15.getEdition();
        java.lang.Class<?> wildcardClass40 = textbookInfo15.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test209");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (-1));
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test210");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean17 = textbookInfo13.newEdition(textbookInfo16);
        java.lang.String str18 = textbookInfo13.getTextbook();
        java.lang.String str19 = textbookInfo13.getTextbook();
        boolean boolean20 = textbookInfo10.newEdition(textbookInfo13);
        boolean boolean21 = textbookInfo7.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo24.newEdition(textbookInfo30);
        java.lang.String str47 = textbookInfo30.getTextbook();
        boolean boolean48 = textbookInfo10.newEdition(textbookInfo30);
        boolean boolean49 = textbookInfo2.newEdition(textbookInfo10);
        int int50 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test211");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo8.newEdition(textbookInfo12);
        int int14 = textbookInfo12.getEdition();
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean24 = textbookInfo20.newEdition(textbookInfo23);
        java.lang.String str25 = textbookInfo20.getTextbook();
        java.lang.String str26 = textbookInfo20.getTextbook();
        boolean boolean27 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str28 = textbookInfo20.getTextbook();
        boolean boolean29 = textbookInfo12.newEdition(textbookInfo20);
        int int30 = textbookInfo20.getEdition();
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        int int38 = textbookInfo33.getEdition();
        boolean boolean39 = textbookInfo20.newEdition(textbookInfo33);
        java.lang.String str40 = textbookInfo20.getTextbook();
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo49 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean50 = textbookInfo46.newEdition(textbookInfo49);
        java.lang.String str51 = textbookInfo49.getTextbook();
        java.lang.String str52 = textbookInfo49.getTextbook();
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean59 = textbookInfo55.newEdition(textbookInfo58);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean63 = textbookInfo58.newEdition(textbookInfo62);
        int int64 = textbookInfo62.getEdition();
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean74 = textbookInfo70.newEdition(textbookInfo73);
        java.lang.String str75 = textbookInfo70.getTextbook();
        java.lang.String str76 = textbookInfo70.getTextbook();
        boolean boolean77 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str78 = textbookInfo70.getTextbook();
        boolean boolean79 = textbookInfo62.newEdition(textbookInfo70);
        int int80 = textbookInfo70.getEdition();
        boolean boolean81 = textbookInfo49.newEdition(textbookInfo70);
        boolean boolean82 = textbookInfo43.newEdition(textbookInfo70);
        int int83 = textbookInfo70.getEdition();
        boolean boolean84 = textbookInfo20.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo87 = new Models.TextbookInfo("", (int) (short) 0);
        boolean boolean88 = textbookInfo20.newEdition(textbookInfo87);
        boolean boolean89 = textbookInfo2.newEdition(textbookInfo87);
        int int90 = textbookInfo2.getEdition();
        int int91 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test212");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test213");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        int int35 = textbookInfo30.getEdition();
        boolean boolean36 = textbookInfo17.newEdition(textbookInfo30);
        java.lang.String str37 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean47 = textbookInfo43.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo46.getTextbook();
        java.lang.String str49 = textbookInfo46.getTextbook();
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo67.getTextbook();
        java.lang.String str73 = textbookInfo67.getTextbook();
        boolean boolean74 = textbookInfo64.newEdition(textbookInfo67);
        java.lang.String str75 = textbookInfo67.getTextbook();
        boolean boolean76 = textbookInfo59.newEdition(textbookInfo67);
        int int77 = textbookInfo67.getEdition();
        boolean boolean78 = textbookInfo46.newEdition(textbookInfo67);
        boolean boolean79 = textbookInfo40.newEdition(textbookInfo67);
        int int80 = textbookInfo67.getEdition();
        boolean boolean81 = textbookInfo17.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo84 = new Models.TextbookInfo("", (int) (short) 0);
        boolean boolean85 = textbookInfo17.newEdition(textbookInfo84);
        int int86 = textbookInfo84.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test214");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 1);
        int int3 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test215");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) '#');
        int int3 = textbookInfo2.getEdition();
        int int4 = textbookInfo2.getEdition();
        java.lang.String str5 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test216");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean17 = textbookInfo13.newEdition(textbookInfo16);
        java.lang.String str18 = textbookInfo13.getTextbook();
        java.lang.String str19 = textbookInfo13.getTextbook();
        boolean boolean20 = textbookInfo10.newEdition(textbookInfo13);
        boolean boolean21 = textbookInfo7.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo24.newEdition(textbookInfo30);
        java.lang.String str47 = textbookInfo30.getTextbook();
        boolean boolean48 = textbookInfo10.newEdition(textbookInfo30);
        boolean boolean49 = textbookInfo2.newEdition(textbookInfo10);
        int int50 = textbookInfo10.getEdition();
        java.lang.Class<?> wildcardClass51 = textbookInfo10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test217");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", (int) (byte) 10);
        int int6 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean13 = textbookInfo9.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo19.newEdition(textbookInfo22);
        java.lang.String str24 = textbookInfo19.getTextbook();
        java.lang.String str25 = textbookInfo19.getTextbook();
        boolean boolean26 = textbookInfo16.newEdition(textbookInfo19);
        boolean boolean27 = textbookInfo12.newEdition(textbookInfo19);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean37 = textbookInfo33.newEdition(textbookInfo36);
        java.lang.String str38 = textbookInfo33.getTextbook();
        java.lang.String str39 = textbookInfo33.getTextbook();
        boolean boolean40 = textbookInfo30.newEdition(textbookInfo33);
        boolean boolean41 = textbookInfo12.newEdition(textbookInfo30);
        boolean boolean42 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str43 = textbookInfo12.getTextbook();
        boolean boolean44 = textbookInfo2.newEdition(textbookInfo12);
        int int45 = textbookInfo12.getEdition();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test218");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean27 = textbookInfo23.newEdition(textbookInfo26);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo26.newEdition(textbookInfo30);
        int int32 = textbookInfo30.getEdition();
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo38.getTextbook();
        java.lang.String str44 = textbookInfo38.getTextbook();
        boolean boolean45 = textbookInfo35.newEdition(textbookInfo38);
        java.lang.String str46 = textbookInfo38.getTextbook();
        boolean boolean47 = textbookInfo30.newEdition(textbookInfo38);
        int int48 = textbookInfo38.getEdition();
        boolean boolean49 = textbookInfo12.newEdition(textbookInfo38);
        java.lang.String str50 = textbookInfo38.getTextbook();
        java.lang.String str51 = textbookInfo38.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test219");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", 10);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo8.getTextbook();
        java.lang.String str11 = textbookInfo8.getTextbook();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo17.newEdition(textbookInfo21);
        int int23 = textbookInfo21.getEdition();
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo29.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo29.getTextbook();
        java.lang.String str35 = textbookInfo29.getTextbook();
        boolean boolean36 = textbookInfo26.newEdition(textbookInfo29);
        java.lang.String str37 = textbookInfo29.getTextbook();
        boolean boolean38 = textbookInfo21.newEdition(textbookInfo29);
        int int39 = textbookInfo29.getEdition();
        boolean boolean40 = textbookInfo8.newEdition(textbookInfo29);
        boolean boolean41 = textbookInfo2.newEdition(textbookInfo29);
        int int42 = textbookInfo29.getEdition();
        java.lang.Class<?> wildcardClass43 = textbookInfo29.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test220");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", 100);
        boolean boolean21 = textbookInfo2.newEdition(textbookInfo20);
        int int22 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        boolean boolean34 = textbookInfo2.newEdition(textbookInfo32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test221");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        boolean boolean24 = textbookInfo2.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        java.lang.String str45 = textbookInfo40.getTextbook();
        java.lang.String str46 = textbookInfo40.getTextbook();
        boolean boolean47 = textbookInfo37.newEdition(textbookInfo40);
        boolean boolean48 = textbookInfo33.newEdition(textbookInfo40);
        boolean boolean49 = textbookInfo27.newEdition(textbookInfo33);
        int int50 = textbookInfo27.getEdition();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo56.newEdition(textbookInfo59);
        java.lang.String str61 = textbookInfo56.getTextbook();
        java.lang.String str62 = textbookInfo56.getTextbook();
        boolean boolean63 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str64 = textbookInfo56.getTextbook();
        boolean boolean65 = textbookInfo27.newEdition(textbookInfo56);
        int int66 = textbookInfo27.getEdition();
        boolean boolean67 = textbookInfo8.newEdition(textbookInfo27);
        java.lang.Class<?> wildcardClass68 = textbookInfo27.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test222");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo6 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo6.newEdition(textbookInfo9);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean20 = textbookInfo16.newEdition(textbookInfo19);
        java.lang.String str21 = textbookInfo16.getTextbook();
        java.lang.String str22 = textbookInfo16.getTextbook();
        boolean boolean23 = textbookInfo13.newEdition(textbookInfo16);
        boolean boolean24 = textbookInfo9.newEdition(textbookInfo16);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean34 = textbookInfo30.newEdition(textbookInfo33);
        java.lang.String str35 = textbookInfo30.getTextbook();
        java.lang.String str36 = textbookInfo30.getTextbook();
        boolean boolean37 = textbookInfo27.newEdition(textbookInfo30);
        boolean boolean38 = textbookInfo9.newEdition(textbookInfo27);
        boolean boolean39 = textbookInfo2.newEdition(textbookInfo9);
        java.lang.String str40 = textbookInfo9.getTextbook();
        int int41 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean48 = textbookInfo44.newEdition(textbookInfo47);
        java.lang.String str49 = textbookInfo44.getTextbook();
        java.lang.String str50 = textbookInfo44.getTextbook();
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean57 = textbookInfo53.newEdition(textbookInfo56);
        java.lang.String str58 = textbookInfo56.getTextbook();
        boolean boolean59 = textbookInfo44.newEdition(textbookInfo56);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", 100);
        boolean boolean63 = textbookInfo44.newEdition(textbookInfo62);
        int int64 = textbookInfo44.getEdition();
        boolean boolean65 = textbookInfo9.newEdition(textbookInfo44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test223");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        int int34 = textbookInfo17.getEdition();
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("", (int) (byte) 100);
        int int38 = textbookInfo37.getEdition();
        boolean boolean39 = textbookInfo17.newEdition(textbookInfo37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test224");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.Class<?> wildcardClass11 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test225");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        java.lang.String str8 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean15 = textbookInfo11.newEdition(textbookInfo14);
        java.lang.String str16 = textbookInfo14.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo14);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", 100);
        boolean boolean21 = textbookInfo2.newEdition(textbookInfo20);
        Models.TextbookInfo textbookInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = textbookInfo20.newEdition(textbookInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.TextbookInfo.getTextbook()\" because \"textbook\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test226");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        java.lang.String str88 = textbookInfo5.getTextbook();
        int int89 = textbookInfo5.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test227");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        java.lang.String str21 = textbookInfo5.getTextbook();
        int int22 = textbookInfo5.getEdition();
        int int23 = textbookInfo5.getEdition();
        java.lang.String str24 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test228");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 52);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("", 97);
        java.lang.String str8 = textbookInfo7.getTextbook();
        boolean boolean9 = textbookInfo2.newEdition(textbookInfo7);
        java.lang.String str10 = textbookInfo7.getTextbook();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test229");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        int int3 = textbookInfo2.getEdition();
        java.lang.Class<?> wildcardClass4 = textbookInfo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test230");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = textbookInfo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test231");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        java.lang.String str8 = textbookInfo5.getTextbook();
        int int9 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo28 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean29 = textbookInfo25.newEdition(textbookInfo28);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean33 = textbookInfo28.newEdition(textbookInfo32);
        java.lang.String str34 = textbookInfo32.getTextbook();
        int int35 = textbookInfo32.getEdition();
        boolean boolean36 = textbookInfo15.newEdition(textbookInfo32);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo43 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean44 = textbookInfo40.newEdition(textbookInfo43);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo53 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean54 = textbookInfo50.newEdition(textbookInfo53);
        java.lang.String str55 = textbookInfo50.getTextbook();
        java.lang.String str56 = textbookInfo50.getTextbook();
        boolean boolean57 = textbookInfo47.newEdition(textbookInfo50);
        boolean boolean58 = textbookInfo43.newEdition(textbookInfo50);
        java.lang.String str59 = textbookInfo43.getTextbook();
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo65 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean66 = textbookInfo62.newEdition(textbookInfo65);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo75 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean76 = textbookInfo72.newEdition(textbookInfo75);
        java.lang.String str77 = textbookInfo72.getTextbook();
        java.lang.String str78 = textbookInfo72.getTextbook();
        boolean boolean79 = textbookInfo69.newEdition(textbookInfo72);
        boolean boolean80 = textbookInfo65.newEdition(textbookInfo72);
        Models.TextbookInfo textbookInfo83 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo86 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo89 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean90 = textbookInfo86.newEdition(textbookInfo89);
        java.lang.String str91 = textbookInfo86.getTextbook();
        java.lang.String str92 = textbookInfo86.getTextbook();
        boolean boolean93 = textbookInfo83.newEdition(textbookInfo86);
        boolean boolean94 = textbookInfo65.newEdition(textbookInfo83);
        boolean boolean95 = textbookInfo43.newEdition(textbookInfo83);
        int int96 = textbookInfo83.getEdition();
        boolean boolean97 = textbookInfo5.newEdition(textbookInfo83);
        int int98 = textbookInfo5.getEdition();
        java.lang.String str99 = textbookInfo5.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test232");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo29 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo32 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean36 = textbookInfo32.newEdition(textbookInfo35);
        java.lang.String str37 = textbookInfo32.getTextbook();
        java.lang.String str38 = textbookInfo32.getTextbook();
        boolean boolean39 = textbookInfo29.newEdition(textbookInfo32);
        boolean boolean40 = textbookInfo25.newEdition(textbookInfo32);
        boolean boolean41 = textbookInfo19.newEdition(textbookInfo25);
        java.lang.String str42 = textbookInfo25.getTextbook();
        boolean boolean43 = textbookInfo5.newEdition(textbookInfo25);
        Models.TextbookInfo textbookInfo46 = new Models.TextbookInfo("hi!", (int) (short) 0);
        boolean boolean47 = textbookInfo5.newEdition(textbookInfo46);
        java.lang.String str48 = textbookInfo46.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test233");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        int int3 = textbookInfo2.getEdition();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo13 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean17 = textbookInfo13.newEdition(textbookInfo16);
        java.lang.String str18 = textbookInfo13.getTextbook();
        java.lang.String str19 = textbookInfo13.getTextbook();
        boolean boolean20 = textbookInfo10.newEdition(textbookInfo13);
        boolean boolean21 = textbookInfo7.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo24.newEdition(textbookInfo30);
        java.lang.String str47 = textbookInfo30.getTextbook();
        boolean boolean48 = textbookInfo10.newEdition(textbookInfo30);
        boolean boolean49 = textbookInfo2.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        java.lang.String str57 = textbookInfo55.getTextbook();
        int int58 = textbookInfo55.getEdition();
        Models.TextbookInfo textbookInfo61 = new Models.TextbookInfo("", 10);
        int int62 = textbookInfo61.getEdition();
        boolean boolean63 = textbookInfo55.newEdition(textbookInfo61);
        java.lang.String str64 = textbookInfo61.getTextbook();
        boolean boolean65 = textbookInfo2.newEdition(textbookInfo61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test234");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean10 = textbookInfo2.newEdition(textbookInfo8);
        int int11 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test235");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo23.newEdition(textbookInfo30);
        boolean boolean61 = textbookInfo5.newEdition(textbookInfo23);
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("", 100);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo80 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean81 = textbookInfo77.newEdition(textbookInfo80);
        java.lang.String str82 = textbookInfo77.getTextbook();
        java.lang.String str83 = textbookInfo77.getTextbook();
        boolean boolean84 = textbookInfo74.newEdition(textbookInfo77);
        boolean boolean85 = textbookInfo70.newEdition(textbookInfo77);
        boolean boolean86 = textbookInfo64.newEdition(textbookInfo70);
        boolean boolean87 = textbookInfo5.newEdition(textbookInfo64);
        Models.TextbookInfo textbookInfo90 = new Models.TextbookInfo("", 52);
        boolean boolean91 = textbookInfo64.newEdition(textbookInfo90);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test236");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        int int12 = textbookInfo9.getEdition();
        int int13 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) 'a');
        boolean boolean17 = textbookInfo9.newEdition(textbookInfo16);
        int int18 = textbookInfo9.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test237");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean10 = textbookInfo2.newEdition(textbookInfo8);
        java.lang.String str11 = textbookInfo2.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test238");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        int int27 = textbookInfo17.getEdition();
        java.lang.String str28 = textbookInfo17.getTextbook();
        Models.TextbookInfo textbookInfo31 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean35 = textbookInfo31.newEdition(textbookInfo34);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean45 = textbookInfo41.newEdition(textbookInfo44);
        java.lang.String str46 = textbookInfo41.getTextbook();
        java.lang.String str47 = textbookInfo41.getTextbook();
        boolean boolean48 = textbookInfo38.newEdition(textbookInfo41);
        boolean boolean49 = textbookInfo34.newEdition(textbookInfo41);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo59.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean71 = textbookInfo67.newEdition(textbookInfo70);
        java.lang.String str72 = textbookInfo67.getTextbook();
        java.lang.String str73 = textbookInfo67.getTextbook();
        boolean boolean74 = textbookInfo64.newEdition(textbookInfo67);
        java.lang.String str75 = textbookInfo67.getTextbook();
        boolean boolean76 = textbookInfo59.newEdition(textbookInfo67);
        int int77 = textbookInfo67.getEdition();
        boolean boolean78 = textbookInfo41.newEdition(textbookInfo67);
        boolean boolean79 = textbookInfo17.newEdition(textbookInfo67);
        java.lang.Class<?> wildcardClass80 = textbookInfo67.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test239");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        int int7 = textbookInfo2.getEdition();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("", (int) (byte) 10);
        int int11 = textbookInfo10.getEdition();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo10);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean22 = textbookInfo18.newEdition(textbookInfo21);
        java.lang.String str23 = textbookInfo18.getTextbook();
        java.lang.String str24 = textbookInfo18.getTextbook();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str26 = textbookInfo15.getTextbook();
        int int27 = textbookInfo15.getEdition();
        boolean boolean28 = textbookInfo2.newEdition(textbookInfo15);
        int int29 = textbookInfo2.getEdition();
        int int30 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test240");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo36);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("", (int) (byte) 100);
        java.lang.String str41 = textbookInfo40.getTextbook();
        Models.TextbookInfo textbookInfo44 = new Models.TextbookInfo("", 1);
        Models.TextbookInfo textbookInfo47 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo50 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean51 = textbookInfo47.newEdition(textbookInfo50);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo50.newEdition(textbookInfo54);
        int int56 = textbookInfo50.getEdition();
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo62 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean63 = textbookInfo59.newEdition(textbookInfo62);
        Models.TextbookInfo textbookInfo66 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo69 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo72 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean73 = textbookInfo69.newEdition(textbookInfo72);
        java.lang.String str74 = textbookInfo69.getTextbook();
        java.lang.String str75 = textbookInfo69.getTextbook();
        boolean boolean76 = textbookInfo66.newEdition(textbookInfo69);
        boolean boolean77 = textbookInfo62.newEdition(textbookInfo69);
        boolean boolean78 = textbookInfo50.newEdition(textbookInfo62);
        Models.TextbookInfo textbookInfo81 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean82 = textbookInfo50.newEdition(textbookInfo81);
        java.lang.String str83 = textbookInfo81.getTextbook();
        boolean boolean84 = textbookInfo44.newEdition(textbookInfo81);
        boolean boolean85 = textbookInfo40.newEdition(textbookInfo81);
        boolean boolean86 = textbookInfo5.newEdition(textbookInfo81);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test241");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 10);
        java.lang.String str3 = textbookInfo2.getTextbook();
        java.lang.String str4 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo7 = new Models.TextbookInfo("", (int) (short) -1);
        boolean boolean8 = textbookInfo2.newEdition(textbookInfo7);
        java.lang.Class<?> wildcardClass9 = textbookInfo2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test242");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        java.lang.String str20 = textbookInfo15.getTextbook();
        java.lang.String str21 = textbookInfo15.getTextbook();
        boolean boolean22 = textbookInfo12.newEdition(textbookInfo15);
        boolean boolean23 = textbookInfo8.newEdition(textbookInfo15);
        java.lang.String str24 = textbookInfo8.getTextbook();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo54 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean55 = textbookInfo51.newEdition(textbookInfo54);
        java.lang.String str56 = textbookInfo51.getTextbook();
        java.lang.String str57 = textbookInfo51.getTextbook();
        boolean boolean58 = textbookInfo48.newEdition(textbookInfo51);
        boolean boolean59 = textbookInfo30.newEdition(textbookInfo48);
        boolean boolean60 = textbookInfo8.newEdition(textbookInfo48);
        int int61 = textbookInfo48.getEdition();
        boolean boolean62 = textbookInfo2.newEdition(textbookInfo48);
        java.lang.String str63 = textbookInfo48.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test243");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        int int17 = textbookInfo2.getEdition();
        java.lang.String str18 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("", 97);
        boolean boolean22 = textbookInfo2.newEdition(textbookInfo21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test244");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo5.getTextbook();
        int int8 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("", 10);
        int int12 = textbookInfo11.getEdition();
        boolean boolean13 = textbookInfo5.newEdition(textbookInfo11);
        int int14 = textbookInfo11.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test245");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str16 = textbookInfo8.getTextbook();
        boolean boolean17 = textbookInfo2.newEdition(textbookInfo8);
        int int18 = textbookInfo2.getEdition();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test246");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo20 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean21 = textbookInfo17.newEdition(textbookInfo20);
        java.lang.String str22 = textbookInfo17.getTextbook();
        java.lang.String str23 = textbookInfo17.getTextbook();
        boolean boolean24 = textbookInfo14.newEdition(textbookInfo17);
        java.lang.String str25 = textbookInfo17.getTextbook();
        boolean boolean26 = textbookInfo9.newEdition(textbookInfo17);
        java.lang.String str27 = textbookInfo17.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test247");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 52);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("", (int) (byte) 10);
        int int9 = textbookInfo8.getEdition();
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        java.lang.String str27 = textbookInfo22.getTextbook();
        java.lang.String str28 = textbookInfo22.getTextbook();
        boolean boolean29 = textbookInfo19.newEdition(textbookInfo22);
        boolean boolean30 = textbookInfo15.newEdition(textbookInfo22);
        Models.TextbookInfo textbookInfo33 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo39 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean40 = textbookInfo36.newEdition(textbookInfo39);
        java.lang.String str41 = textbookInfo36.getTextbook();
        java.lang.String str42 = textbookInfo36.getTextbook();
        boolean boolean43 = textbookInfo33.newEdition(textbookInfo36);
        boolean boolean44 = textbookInfo15.newEdition(textbookInfo33);
        boolean boolean45 = textbookInfo8.newEdition(textbookInfo15);
        Models.TextbookInfo textbookInfo48 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean52 = textbookInfo48.newEdition(textbookInfo51);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo58 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo61 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean62 = textbookInfo58.newEdition(textbookInfo61);
        java.lang.String str63 = textbookInfo58.getTextbook();
        java.lang.String str64 = textbookInfo58.getTextbook();
        boolean boolean65 = textbookInfo55.newEdition(textbookInfo58);
        boolean boolean66 = textbookInfo51.newEdition(textbookInfo58);
        java.lang.String str67 = textbookInfo58.getTextbook();
        boolean boolean68 = textbookInfo15.newEdition(textbookInfo58);
        boolean boolean69 = textbookInfo5.newEdition(textbookInfo15);
        java.lang.String str70 = textbookInfo15.getTextbook();
        boolean boolean71 = textbookInfo2.newEdition(textbookInfo15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test248");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo12 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean16 = textbookInfo12.newEdition(textbookInfo15);
        java.lang.String str17 = textbookInfo12.getTextbook();
        java.lang.String str18 = textbookInfo12.getTextbook();
        boolean boolean19 = textbookInfo9.newEdition(textbookInfo12);
        boolean boolean20 = textbookInfo5.newEdition(textbookInfo12);
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo26 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean27 = textbookInfo23.newEdition(textbookInfo26);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo26.newEdition(textbookInfo30);
        int int32 = textbookInfo30.getEdition();
        Models.TextbookInfo textbookInfo35 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo38 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo41 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean42 = textbookInfo38.newEdition(textbookInfo41);
        java.lang.String str43 = textbookInfo38.getTextbook();
        java.lang.String str44 = textbookInfo38.getTextbook();
        boolean boolean45 = textbookInfo35.newEdition(textbookInfo38);
        java.lang.String str46 = textbookInfo38.getTextbook();
        boolean boolean47 = textbookInfo30.newEdition(textbookInfo38);
        int int48 = textbookInfo38.getEdition();
        boolean boolean49 = textbookInfo12.newEdition(textbookInfo38);
        Models.TextbookInfo textbookInfo52 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo55 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean56 = textbookInfo52.newEdition(textbookInfo55);
        Models.TextbookInfo textbookInfo59 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean60 = textbookInfo55.newEdition(textbookInfo59);
        int int61 = textbookInfo55.getEdition();
        Models.TextbookInfo textbookInfo64 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean68 = textbookInfo64.newEdition(textbookInfo67);
        Models.TextbookInfo textbookInfo71 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo74 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo77 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean78 = textbookInfo74.newEdition(textbookInfo77);
        java.lang.String str79 = textbookInfo74.getTextbook();
        java.lang.String str80 = textbookInfo74.getTextbook();
        boolean boolean81 = textbookInfo71.newEdition(textbookInfo74);
        boolean boolean82 = textbookInfo67.newEdition(textbookInfo74);
        boolean boolean83 = textbookInfo55.newEdition(textbookInfo67);
        boolean boolean84 = textbookInfo12.newEdition(textbookInfo67);
        int int85 = textbookInfo12.getEdition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test249");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        int int11 = textbookInfo5.getEdition();
        Models.TextbookInfo textbookInfo14 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo17 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean18 = textbookInfo14.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo21 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo24 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean28 = textbookInfo24.newEdition(textbookInfo27);
        java.lang.String str29 = textbookInfo24.getTextbook();
        java.lang.String str30 = textbookInfo24.getTextbook();
        boolean boolean31 = textbookInfo21.newEdition(textbookInfo24);
        boolean boolean32 = textbookInfo17.newEdition(textbookInfo24);
        boolean boolean33 = textbookInfo5.newEdition(textbookInfo17);
        Models.TextbookInfo textbookInfo36 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        boolean boolean37 = textbookInfo5.newEdition(textbookInfo36);
        java.lang.Class<?> wildcardClass38 = textbookInfo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test250");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        java.lang.String str49 = textbookInfo18.getTextbook();
        int int50 = textbookInfo18.getEdition();
        java.lang.String str51 = textbookInfo18.getTextbook();
        int int52 = textbookInfo18.getEdition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test251");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", (int) (byte) 0);
        java.lang.String str3 = textbookInfo2.getTextbook();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test252");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        java.lang.String str7 = textbookInfo2.getTextbook();
        Models.TextbookInfo textbookInfo10 = new Models.TextbookInfo("hi!", 10);
        boolean boolean11 = textbookInfo2.newEdition(textbookInfo10);
        java.lang.String str12 = textbookInfo10.getTextbook();
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        int int20 = textbookInfo15.getEdition();
        Models.TextbookInfo textbookInfo23 = new Models.TextbookInfo("", (int) (byte) 10);
        int int24 = textbookInfo23.getEdition();
        boolean boolean25 = textbookInfo15.newEdition(textbookInfo23);
        boolean boolean26 = textbookInfo10.newEdition(textbookInfo23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test253");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean9 = textbookInfo5.newEdition(textbookInfo8);
        java.lang.String str10 = textbookInfo5.getTextbook();
        java.lang.String str11 = textbookInfo5.getTextbook();
        boolean boolean12 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo15 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo18 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean19 = textbookInfo15.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean23 = textbookInfo18.newEdition(textbookInfo22);
        int int24 = textbookInfo18.getEdition();
        Models.TextbookInfo textbookInfo27 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo30 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean31 = textbookInfo27.newEdition(textbookInfo30);
        Models.TextbookInfo textbookInfo34 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo37 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo40 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean41 = textbookInfo37.newEdition(textbookInfo40);
        java.lang.String str42 = textbookInfo37.getTextbook();
        java.lang.String str43 = textbookInfo37.getTextbook();
        boolean boolean44 = textbookInfo34.newEdition(textbookInfo37);
        boolean boolean45 = textbookInfo30.newEdition(textbookInfo37);
        boolean boolean46 = textbookInfo18.newEdition(textbookInfo30);
        int int47 = textbookInfo18.getEdition();
        boolean boolean48 = textbookInfo2.newEdition(textbookInfo18);
        Models.TextbookInfo textbookInfo51 = new Models.TextbookInfo("", (int) (short) 0);
        java.lang.String str52 = textbookInfo51.getTextbook();
        boolean boolean53 = textbookInfo18.newEdition(textbookInfo51);
        Models.TextbookInfo textbookInfo56 = new Models.TextbookInfo("hi!", (-1));
        boolean boolean57 = textbookInfo51.newEdition(textbookInfo56);
        Models.TextbookInfo textbookInfo60 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo63 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean64 = textbookInfo60.newEdition(textbookInfo63);
        Models.TextbookInfo textbookInfo67 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo70 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo73 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean74 = textbookInfo70.newEdition(textbookInfo73);
        java.lang.String str75 = textbookInfo70.getTextbook();
        java.lang.String str76 = textbookInfo70.getTextbook();
        boolean boolean77 = textbookInfo67.newEdition(textbookInfo70);
        boolean boolean78 = textbookInfo63.newEdition(textbookInfo70);
        java.lang.String str79 = textbookInfo70.getTextbook();
        java.lang.String str80 = textbookInfo70.getTextbook();
        int int81 = textbookInfo70.getEdition();
        boolean boolean82 = textbookInfo56.newEdition(textbookInfo70);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test254");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("", 35);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo8 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo11 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean12 = textbookInfo8.newEdition(textbookInfo11);
        java.lang.String str13 = textbookInfo8.getTextbook();
        java.lang.String str14 = textbookInfo8.getTextbook();
        boolean boolean15 = textbookInfo5.newEdition(textbookInfo8);
        boolean boolean16 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo19 = new Models.TextbookInfo("hi!", (int) (byte) 1);
        Models.TextbookInfo textbookInfo22 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo25 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean26 = textbookInfo22.newEdition(textbookInfo25);
        boolean boolean27 = textbookInfo19.newEdition(textbookInfo25);
        boolean boolean28 = textbookInfo2.newEdition(textbookInfo25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test255");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        int int12 = textbookInfo9.getEdition();
        int int13 = textbookInfo9.getEdition();
        Models.TextbookInfo textbookInfo16 = new Models.TextbookInfo("hi!", (int) (short) -1);
        java.lang.String str17 = textbookInfo16.getTextbook();
        boolean boolean18 = textbookInfo9.newEdition(textbookInfo16);
        int int19 = textbookInfo9.getEdition();
        java.lang.String str20 = textbookInfo9.getTextbook();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TextbookInfortestcases0.test256");
        Models.TextbookInfo textbookInfo2 = new Models.TextbookInfo("hi!", (int) (short) -1);
        Models.TextbookInfo textbookInfo5 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean6 = textbookInfo2.newEdition(textbookInfo5);
        Models.TextbookInfo textbookInfo9 = new Models.TextbookInfo("hi!", (int) (short) -1);
        boolean boolean10 = textbookInfo5.newEdition(textbookInfo9);
        java.lang.String str11 = textbookInfo9.getTextbook();
        int int12 = textbookInfo9.getEdition();
        int int13 = textbookInfo9.getEdition();
        java.lang.Class<?> wildcardClass14 = textbookInfo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

