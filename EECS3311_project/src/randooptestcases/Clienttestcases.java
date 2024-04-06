package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Clienttestcases {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test001");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test002");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test003");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.Class<?> wildcardClass9 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test004");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.lang.Class<?> wildcardClass13 = client4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test005");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str9 = client4.getType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str9, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test006");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.lang.String str10 = client4.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test007");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.time.LocalDateTime localDateTime7 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime7);
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test008");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        int int8 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test009");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client4.notifyDueDate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test010");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setUserID("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test011");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.addRentedItem("hi!", localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test012");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.time.LocalDateTime localDateTime7 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test013");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.getPassword();
        java.lang.String str10 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test014");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.lang.String str13 = client4.getUserID();
        java.lang.Class<?> wildcardClass14 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test015");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.util.List<java.lang.String> strList11 = client4.notifyDueDate();
        java.lang.Class<?> wildcardClass12 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test016");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test017");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.Class<?> wildcardClass8 = client4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test018");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test019");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        client4.setRentCount();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test020");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.time.LocalDateTime localDateTime13 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test021");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime14 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test022");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime10);
        int int12 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test023");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime9);
        int int11 = client4.getRentCount();
        java.time.LocalDateTime localDateTime13 = null;
        client4.update("", localDateTime13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test024");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        client4.setPassword("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test025");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        client4.setRentCount();
        java.lang.String str7 = client4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test026");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setEmail("");
        java.time.LocalDateTime localDateTime18 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test027");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        int int5 = client4.getRentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test028");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("hi!");
        java.lang.Class<?> wildcardClass16 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test029");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        java.lang.String str14 = client4.getType();
        int int15 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str14, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test030");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str12 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test031");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.time.LocalDateTime localDateTime7 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime7);
        java.lang.Class<?> wildcardClass9 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test032");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.Class<?> wildcardClass9 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test033");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test034");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test035");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        client4.setPassword("hi!");
        java.lang.String str15 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str15, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test036");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test037");
        Models.Client client4 = new Models.Client("hi!", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test038");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int5 = client4.getRentCount();
        Models.Newsletter newsletter6 = null;
        client4.unsubscribe(newsletter6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test039");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getPassword();
        Models.Newsletter newsletter6 = null;
        client4.unsubscribe(newsletter6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str5, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test040");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime10);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap12 = client4.displayRentedBooks();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test041");
        Models.Client client4 = new Models.Client("hi!", "hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test042");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        java.lang.String str14 = client4.getType();
        java.time.LocalDateTime localDateTime16 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime16);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str14, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test043");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int5 = client4.getRentCount();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test044");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test045");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap8 = client4.displayRentedBooks();
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test046");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setRentCount();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test047");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.lang.String str6 = client4.getType();
        client4.setRentCount();
        int int8 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test048");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.String str6 = client4.getUserID();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        java.lang.String str9 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str9, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test049");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test050");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test051");
        Models.Client client4 = new Models.Client("hi!", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap5 = client4.displayRentedBooks();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test052");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setUserID("hi!");
        java.lang.String str8 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test053");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setEmail("hi!");
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test054");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.util.List<java.lang.String> strList9 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test055");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap10 = client4.displayRentedBooks();
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test056");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test057");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test058");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.String str6 = client4.getUserID();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        client4.setRentCount();
        java.lang.String str10 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test059");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str13 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test060");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setEmail("");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test061");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setUserID("hi!");
        java.lang.String str8 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test062");
        Models.Client client4 = new Models.Client("hi!", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test063");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.toString();
        client4.setUserID("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str11, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test064");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.getEmail();
        java.lang.String str11 = client4.getUserID();
        java.lang.String str12 = client4.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str12, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test065");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test066");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.lang.String str6 = client4.getType();
        java.lang.String str7 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test067");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.toString();
        java.util.List<java.lang.String> strList11 = client4.notifyDueDate();
        java.time.LocalDateTime localDateTime13 = null;
        client4.addRentedItem("", localDateTime13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test068");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test069");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test070");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.time.LocalDateTime localDateTime7 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime7);
        java.lang.Class<?> wildcardClass9 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test071");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap14 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime16);
        int int18 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test072");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap5 = client4.displayRentedBooks();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test073");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test074");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test075");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test076");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setRentCount();
        java.time.LocalDateTime localDateTime13 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime13);
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test077");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        client4.setRentCount();
        java.lang.String str11 = client4.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test078");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("hi!");
        client4.setRentCount();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test079");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap13 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test080");
        Models.Client client4 = new Models.Client("hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test081");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.util.List<java.lang.String> strList5 = client4.notifyDueDate();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test082");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        Models.Newsletter newsletter12 = null;
        client4.unsubscribe(newsletter12);
        int int14 = client4.getRentCount();
        Models.Newsletter newsletter15 = null;
        client4.unsubscribe(newsletter15);
        java.lang.Class<?> wildcardClass17 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test083");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setEmail("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int8 = client4.getRentCount();
        java.time.LocalDateTime localDateTime10 = null;
        client4.addRentedItem("hi!", localDateTime10);
        java.lang.String str12 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str12, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test084");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.Class<?> wildcardClass11 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test085");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.lang.String str6 = client4.toString();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str6, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test086");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        int int14 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test087");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!");
        java.lang.String str5 = client4.getPassword();
        Models.Newsletter newsletter6 = null;
        client4.unsubscribe(newsletter6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test088");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        java.lang.String str14 = client4.getEmail();
        java.util.List<java.lang.String> strList15 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test089");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        java.lang.String str10 = client4.getPassword();
        int int11 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test090");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.toString();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str11, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test091");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        java.lang.String str6 = client4.getPassword();
        java.lang.String str7 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str9 = client4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test092");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.lang.String str10 = client4.getUserID();
        java.lang.String str11 = client4.getType();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.Class<?> wildcardClass14 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test093");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        client4.setEmail("");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test094");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setUserID("hi!");
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        java.lang.Class<?> wildcardClass10 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test095");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int7 = client4.getRentCount();
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        java.time.LocalDateTime localDateTime11 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime11);
        Models.Newsletter newsletter13 = null;
        client4.unsubscribe(newsletter13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test096");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test097");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.lang.String str10 = client4.getUserID();
        java.lang.String str11 = client4.getType();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        Models.Newsletter newsletter14 = null;
        client4.unsubscribe(newsletter14);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test098");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime9);
        int int11 = client4.getRentCount();
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test099");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int11 = client4.getRentCount();
        java.lang.String str12 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str12, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test100");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getEmail();
        java.lang.String str10 = client4.getEmail();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test101");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.Class<?> wildcardClass6 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test102");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setEmail("hi!");
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap10 = client4.displayRentedBooks();
        java.lang.Class<?> wildcardClass11 = client4.getClass();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test103");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "hi!");
        int int5 = client4.getRentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test104");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        Models.Newsletter newsletter12 = null;
        client4.unsubscribe(newsletter12);
        java.lang.String str14 = client4.getEmail();
        java.util.List<java.lang.String> strList15 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test105");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setEmail("hi!");
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap10 = client4.displayRentedBooks();
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.Class<?> wildcardClass13 = client4.getClass();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test106");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.Class<?> wildcardClass8 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test107");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int5 = client4.getRentCount();
        java.time.LocalDateTime localDateTime7 = null;
        client4.addRentedItem("hi!", localDateTime7);
        java.lang.String str9 = client4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test108");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.String str9 = client4.getEmail();
        int int10 = client4.getRentCount();
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test109");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test110");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int7 = client4.getRentCount();
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        java.time.LocalDateTime localDateTime11 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test111");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int7 = client4.getRentCount();
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        java.lang.Class<?> wildcardClass10 = client4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test112");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test113");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.time.LocalDateTime localDateTime7 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime7);
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test114");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test115");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str5, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test116");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.String str9 = client4.getEmail();
        java.util.List<java.lang.String> strList10 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test117");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        client4.setEmail("");
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test118");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        client4.setEmail("");
        java.lang.String str10 = client4.getUserID();
        java.lang.String str11 = client4.getType();
        java.time.LocalDateTime localDateTime13 = null;
        client4.addRentedItem("", localDateTime13);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test119");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str7 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str7, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test120");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        client4.setRentCount();
        java.lang.String str10 = client4.getType();
        java.lang.String str11 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test121");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setRentCount();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test122");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.util.List<java.lang.String> strList11 = client4.notifyDueDate();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test123");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        java.lang.String str6 = client4.getPassword();
        java.lang.String str7 = client4.getPassword();
        client4.setRentCount();
        int int9 = client4.getRentCount();
        java.lang.String str10 = client4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test124");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "hi!", "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test125");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        java.time.LocalDateTime localDateTime13 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test126");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.lang.Class<?> wildcardClass12 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test127");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        Models.Newsletter newsletter10 = null;
        client4.unsubscribe(newsletter10);
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test128");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str5, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test129");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        java.lang.String str14 = client4.getType();
        client4.setUserID("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str14, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test130");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test131");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getEmail();
        java.lang.String str10 = client4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test132");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime10);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap12 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime14);
        int int16 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test133");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.String str6 = client4.getUserID();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        client4.setRentCount();
        java.lang.String str10 = client4.getPassword();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test134");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test135");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str10 = client4.getEmail();
        java.lang.String str11 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str11, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test136");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.getPassword();
        int int10 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test137");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str9 = client4.getEmail();
        java.time.LocalDateTime localDateTime11 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime11);
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test138");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str9 = client4.getEmail();
        java.time.LocalDateTime localDateTime11 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime11);
        java.lang.String str13 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test139");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.lang.String str12 = client4.getType();
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str12, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test140");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.lang.String str13 = client4.getUserID();
        java.time.LocalDateTime localDateTime15 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test141");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        java.lang.String str14 = client4.getEmail();
        int int15 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test142");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!");
        java.lang.String str5 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test143");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test144");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.util.List<java.lang.String> strList16 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap17 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test145");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        java.lang.String str6 = client4.getPassword();
        client4.setRentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test146");
        Models.Client client4 = new Models.Client("hi!", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.lang.String str5 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test147");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        int int9 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test148");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        client4.setUserID("");
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("hi!", localDateTime16);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test149");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test150");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.lang.String str5 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str5, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test151");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        java.util.List<java.lang.String> strList6 = client4.notifyDueDate();
        int int7 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test152");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        java.util.List<java.lang.String> strList6 = client4.notifyDueDate();
        java.util.List<java.lang.String> strList7 = client4.notifyDueDate();
        java.lang.String str8 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test153");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test154");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.String str6 = client4.getUserID();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test155");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.util.List<java.lang.String> strList10 = client4.notifyDueDate();
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        java.lang.String str14 = client4.toString();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}" + "'", str14, "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test156");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setEmail("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test157");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.String str9 = client4.getEmail();
        int int10 = client4.getRentCount();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int13 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test158");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime10);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap12 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("hi!", localDateTime14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test159");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.update("", localDateTime9);
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test160");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str10 = client4.getEmail();
        java.lang.Class<?> wildcardClass11 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test161");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("hi!", localDateTime14);
        client4.setEmail("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test162");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap13 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test163");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str7, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test164");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test165");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test166");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap11 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test167");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test168");
        Models.Client client4 = new Models.Client("hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "hi!");
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test169");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.lang.String str6 = client4.toString();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        java.lang.String str9 = client4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str6, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test170");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        client4.setPassword("");
        java.lang.String str12 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test171");
        Models.Client client4 = new Models.Client("hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        client4.setRentCount();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test172");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.toString();
        java.util.List<java.lang.String> strList11 = client4.notifyDueDate();
        client4.setPassword("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test173");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.util.List<java.lang.String> strList15 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test174");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        java.lang.String str6 = client4.toString();
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test175");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        Models.Newsletter newsletter12 = null;
        client4.unsubscribe(newsletter12);
        int int14 = client4.getRentCount();
        Models.Newsletter newsletter15 = null;
        client4.unsubscribe(newsletter15);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap17 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test176");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.String str9 = client4.toString();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str9, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test177");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setUserID("");
        java.util.List<java.lang.String> strList8 = client4.notifyDueDate();
        java.lang.String str9 = client4.getEmail();
        int int10 = client4.getRentCount();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test178");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime8 = null;
        client4.update("", localDateTime8);
        java.util.List<java.lang.String> strList10 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap11 = client4.displayRentedBooks();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test179");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        java.lang.String str10 = client4.getPassword();
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("hi!", localDateTime12);
        java.lang.String str14 = client4.getPassword();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test180");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int5 = client4.getRentCount();
        int int6 = client4.getRentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test181");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap14 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime19);
        java.lang.String str21 = client4.getType();
        client4.setPassword("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str21, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test182");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.addRentedItem("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", localDateTime6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test183");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        java.lang.String str6 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test184");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime8 = null;
        client4.update("hi!", localDateTime8);
        java.lang.String str10 = client4.toString();
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        Models.Newsletter newsletter14 = null;
        client4.unsubscribe(newsletter14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test185");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.addRentedItem("", localDateTime6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test186");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        java.lang.String str10 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test187");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.toString();
        client4.setEmail("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test188");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        client4.setRentCount();
        java.lang.String str10 = client4.getType();
        Models.Newsletter newsletter11 = null;
        client4.unsubscribe(newsletter11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test189");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test190");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str16 = client4.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str16, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test191");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test192");
        Models.Client client4 = new Models.Client("hi!", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.lang.String str5 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test193");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap15 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test194");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        client4.setEmail("");
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str9, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test195");
        Models.Client client4 = new Models.Client("hi!", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test196");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
        java.lang.String str5 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test197");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        int int5 = client4.getRentCount();
        client4.setRentCount();
        int int7 = client4.getRentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test198");
        Models.Client client4 = new Models.Client("hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test199");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getEmail();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str12 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str12, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test200");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
        java.lang.String str7 = client4.getEmail();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str10 = client4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str7, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}" + "'", str10, "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test201");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "");
        java.lang.String str5 = client4.getType();
        java.lang.String str6 = client4.getUserID();
        java.lang.String str7 = client4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=}" + "'", str7, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=}");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test202");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getEmail();
        java.lang.String str10 = client4.getEmail();
        int int11 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test203");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        client4.setEmail("");
        java.lang.String str7 = client4.getType();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap8 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test204");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.lang.String str13 = client4.getUserID();
        java.time.LocalDateTime localDateTime15 = null;
        client4.update("", localDateTime15);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap17 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test205");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        client4.setUserID("");
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("hi!", localDateTime16);
        java.lang.String str18 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str18, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test206");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        client4.setRentCount();
        java.lang.String str15 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test207");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        int int15 = client4.getRentCount();
        client4.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test208");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("", localDateTime9);
        client4.setPassword("");
        java.lang.String str13 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test209");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.lang.String str6 = client4.getType();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime9);
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test210");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setUserID("hi!");
        Models.Newsletter newsletter8 = null;
        client4.unsubscribe(newsletter8);
        int int10 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test211");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!");
        java.lang.String str5 = client4.getUserID();
        java.time.LocalDateTime localDateTime7 = null;
        client4.addRentedItem("hi!", localDateTime7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test212");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.util.List<java.lang.String> strList6 = client4.notifyDueDate();
        java.lang.String str7 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test213");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test214");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str16 = client4.getEmail();
        java.lang.String str17 = client4.getUserID();
        java.lang.String str18 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str17, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test215");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter16 = null;
        client4.unsubscribe(newsletter16);
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test216");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.update("", localDateTime9);
        java.lang.String str11 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str11, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test217");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter13 = null;
        client4.unsubscribe(newsletter13);
        int int15 = client4.getRentCount();
        client4.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test218");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test219");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.lang.String str13 = client4.getUserID();
        java.time.LocalDateTime localDateTime15 = null;
        client4.update("", localDateTime15);
        java.util.List<java.lang.String> strList17 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test220");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        client4.setRentCount();
        java.lang.String str11 = client4.getPassword();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        client4.setUserID("");
        java.lang.String str15 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test221");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.lang.String str7 = client4.getPassword();
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime10);
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test222");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str8 = client4.getType();
        java.lang.String str9 = client4.getPassword();
        java.time.LocalDateTime localDateTime11 = null;
        client4.addRentedItem("hi!", localDateTime11);
        java.lang.String str13 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str13, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test223");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        java.time.LocalDateTime localDateTime13 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime13);
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test224");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("hi!", localDateTime14);
        client4.setEmail("");
        java.lang.String str18 = client4.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str18, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test225");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test226");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setRentCount();
        java.lang.String str12 = client4.getPassword();
        java.lang.String str13 = client4.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test227");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.lang.String str6 = client4.getType();
        client4.setRentCount();
        java.lang.String str8 = client4.getPassword();
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", localDateTime10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test228");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap14 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", localDateTime16);
        int int18 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test229");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setEmail("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int8 = client4.getRentCount();
        java.time.LocalDateTime localDateTime10 = null;
        client4.addRentedItem("hi!", localDateTime10);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap12 = client4.displayRentedBooks();
        java.lang.Class<?> wildcardClass13 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test230");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        java.lang.String str14 = client4.getType();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str14, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test231");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime8 = null;
        client4.update("hi!", localDateTime8);
        java.lang.String str10 = client4.toString();
        int int11 = client4.getRentCount();
        java.lang.String str12 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test232");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test233");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap14 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime16 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime19);
        client4.setPassword("");
        Models.Newsletter newsletter23 = null;
        client4.unsubscribe(newsletter23);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test234");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test235");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test236");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime16 = null;
        client4.update("hi!", localDateTime16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test237");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "hi!");
        java.util.List<java.lang.String> strList5 = client4.notifyDueDate();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test238");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test239");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
        java.lang.String str7 = client4.getEmail();
        client4.setUserID("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str7, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test240");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.getUserID();
        int int11 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test241");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test242");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime8 = null;
        client4.update("hi!", localDateTime8);
        java.lang.String str10 = client4.toString();
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test243");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.lang.String str9 = client4.toString();
        Models.Newsletter newsletter10 = null;
        client4.unsubscribe(newsletter10);
        client4.setRentCount();
        java.lang.Class<?> wildcardClass13 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str9, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test244");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.lang.String str6 = client4.getType();
        int int7 = client4.getRentCount();
        client4.setRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test245");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        client4.addRentedItem("hi!", localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.addRentedItem("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        java.lang.String str14 = client4.getType();
        java.lang.String str15 = client4.getUserID();
        java.time.LocalDateTime localDateTime17 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=}", localDateTime20);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str14, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str15, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test246");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str7 = client4.getPassword();
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str10 = client4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test247");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getPassword();
        java.lang.String str9 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str9, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test248");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getUserID();
        Models.Newsletter newsletter12 = null;
        client4.unsubscribe(newsletter12);
        int int14 = client4.getRentCount();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.Class<?> wildcardClass17 = client4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test249");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setRentCount();
        client4.setPassword("");
        java.lang.String str12 = client4.getUserID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str12, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test250");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter5 = null;
        client4.unsubscribe(newsletter5);
        java.time.LocalDateTime localDateTime8 = null;
        client4.addRentedItem("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", localDateTime8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test251");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setRentCount();
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        int int9 = client4.getRentCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test252");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("");
        Models.Newsletter newsletter7 = null;
        client4.unsubscribe(newsletter7);
        java.time.LocalDateTime localDateTime10 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test253");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime12);
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter16 = null;
        client4.unsubscribe(newsletter16);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test254");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getEmail();
        java.lang.String str6 = client4.getPassword();
        java.lang.String str7 = client4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str6, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str7, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test255");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int11 = client4.getRentCount();
        Models.Newsletter newsletter12 = null;
        client4.unsubscribe(newsletter12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test256");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=}", "", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test257");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.getUserID();
        client4.setEmail("Client{type=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        Models.Newsletter newsletter13 = null;
        client4.unsubscribe(newsletter13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str10, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test258");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getUserID();
        java.time.LocalDateTime localDateTime7 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime7);
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap9 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test259");
        Models.Client client4 = new Models.Client("hi!", "hi!", "hi!", "");
        java.lang.String str5 = client4.toString();
        client4.setEmail("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime9 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str5, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test260");
        Models.Client client4 = new Models.Client("hi!", "hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        int int5 = client4.getRentCount();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test261");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.lang.String str10 = client4.toString();
        java.util.List<java.lang.String> strList11 = client4.notifyDueDate();
        java.util.List<java.lang.String> strList12 = client4.notifyDueDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str10, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test262");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setPassword("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        client4.setUserID("Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        java.lang.String str11 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str11, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test263");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.util.List<java.lang.String> strList10 = client4.notifyDueDate();
        java.time.LocalDateTime localDateTime12 = null;
        client4.update("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", localDateTime12);
        int int14 = client4.getRentCount();
        java.lang.String str15 = client4.getPassword();
        int int16 = client4.getRentCount();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str15, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test264");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        java.time.LocalDateTime localDateTime10 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test265");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.getUserID();
        Models.Newsletter newsletter9 = null;
        client4.unsubscribe(newsletter9);
        client4.setUserID("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=hi!\\email=hi!\\password=hi!\\userID=}" + "'", str8, "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test266");
        Models.Client client4 = new Models.Client("hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        int int5 = client4.getRentCount();
        java.lang.String str6 = client4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str6, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test267");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.lang.String str5 = client4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str5, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test268");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        client4.setRentCount();
        client4.setPassword("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test269");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.lang.String str5 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap6 = client4.displayRentedBooks();
        java.time.LocalDateTime localDateTime8 = null;
        client4.addRentedItem("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\userID=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}}", localDateTime8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test270");
        Models.Client client4 = new Models.Client("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("hi!", localDateTime6);
        client4.setUserID("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("hi!", localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        client4.update("Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", localDateTime14);
        java.util.List<java.lang.String> strList16 = client4.notifyDueDate();
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test271");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.lang.String str14 = client4.getPassword();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap15 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test272");
        Models.Client client4 = new Models.Client("", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}", "hi!", "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        client4.setRentCount();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Clienttestcases0.test273");
        Models.Client client4 = new Models.Client("Client{type=hi!\\email=hi!\\password=hi!\\userID=}", "hi!", "", "Client{type=hi!\\email=hi!\\password=hi!\\userID=}");
        java.time.LocalDateTime localDateTime6 = null;
        client4.update("", localDateTime6);
        java.lang.String str8 = client4.toString();
        client4.setRentCount();
        java.time.LocalDateTime localDateTime11 = null;
        client4.update("", localDateTime11);
        java.util.List<java.lang.String> strList13 = client4.notifyDueDate();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap14 = client4.displayRentedBooks();
        java.util.Map<java.lang.String, java.time.LocalDateTime> strMap15 = client4.displayRentedBooks();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}" + "'", str8, "Client{type=Client{type=hi!\\email=hi!\\password=hi!\\userID=}\\email=hi!\\password=\\userID=Client{type=hi!\\email=hi!\\password=hi!\\userID=}}");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }
}

