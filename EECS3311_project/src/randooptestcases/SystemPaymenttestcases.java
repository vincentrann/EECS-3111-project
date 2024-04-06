package randooptestcases;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemPaymenttestcases {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test002");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.Client client1 = null;
        Models.Newsletter newsletter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client1, newsletter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test003");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.Class<?> wildcardClass1 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test004");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.Client client5 = null;
        Models.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client5, newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test005");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.Client client5 = null;
        Models.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client5, newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test006");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test007");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test008");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test009");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test010");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test011");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        Models.Client client5 = null;
        Models.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client5, newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test012");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test013");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test014");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test015");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.Client client4 = null;
        Models.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client4, newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test016");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test017");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test018");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test019");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test020");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test021");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test022");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test023");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test024");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test025");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test026");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test027");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test028");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test029");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test030");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test031");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test032");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.Client client4 = null;
        Models.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client4, newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test033");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.Class<?> wildcardClass19 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test034");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test035");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test036");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test037");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test038");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test039");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test040");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test041");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test042");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", 100.0d, "");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test043");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("", 0.0d, "hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client10 = null;
        Models.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client10, newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test044");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test045");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test046");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test047");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test048");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("hi!");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test049");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test050");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test051");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test052");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test053");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test054");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", 100.0d, "");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test055");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test056");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test057");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test058");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("", 0.0d, "hi!");
        Models.Client client6 = null;
        Models.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client6, newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test059");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        Models.Client client5 = null;
        Models.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client5, newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test060");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test061");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("", 0.0d, "hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test062");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.Client client4 = null;
        Models.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client4, newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test063");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test064");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("hi!");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client6 = null;
        Models.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client6, newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test065");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.Client client3 = null;
        Models.Newsletter newsletter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client3, newsletter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test066");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test067");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test068");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test069");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.Client client9 = null;
        Models.Newsletter newsletter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client9, newsletter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test070");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test071");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.Client client5 = null;
        Models.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client5, newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test072");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass12 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test073");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test074");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test075");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test076");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test077");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test078");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 'a', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test079");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test080");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test081");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str14 = systemPayment0.payment("hi!", (double) (short) 100, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test082");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        java.lang.Class<?> wildcardClass12 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test083");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test084");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test085");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test086");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test087");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test088");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        Models.Client client19 = null;
        Models.Newsletter newsletter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client19, newsletter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test089");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test090");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test091");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test092");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test093");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test094");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test095");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test096");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass12 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test097");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "");
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test098");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test099");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test100");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test101");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test102");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test103");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test104");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test105");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 'a', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test106");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test107");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test108");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test109");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test110");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test111");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("", (-1.0d), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass12 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test112");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client6 = null;
        Models.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client6, newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test113");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test114");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "");
        Models.Client client21 = null;
        Models.Newsletter newsletter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client21, newsletter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test115");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test116");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test117");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test118");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str24 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "hi!");
        Models.Client client25 = null;
        Models.Newsletter newsletter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client25, newsletter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str24, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test119");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test120");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test121");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("", 0.0d, "hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "hi!");
        Models.Client client14 = null;
        Models.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client14, newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test122");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client10 = null;
        Models.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client10, newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test123");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test124");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test125");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 10, "");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test126");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test127");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client6 = null;
        Models.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client6, newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test128");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '4', "");
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test129");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test130");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 'a', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test131");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test132");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        Models.Client client19 = null;
        Models.Newsletter newsletter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client19, newsletter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test133");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test134");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.Class<?> wildcardClass19 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test135");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test136");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test137");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client10 = null;
        Models.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client10, newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test138");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '4', "");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test139");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test140");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str18 = systemPayment0.payment("hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test141");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test142");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        Models.PhysicalItem physicalItem14 = null;
        systemPayment1.discount(physicalItem14);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test143");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass21 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test144");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test145");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test146");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test147");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.String str13 = systemPayment1.payment("", (double) 0.0f, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test148");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test149");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test150");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test151");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test152");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test153");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client12 = null;
        Models.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client12, newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test154");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client11 = null;
        Models.Newsletter newsletter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client11, newsletter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test155");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test156");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test157");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        java.lang.Class<?> wildcardClass14 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test158");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test159");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.Class<?> wildcardClass3 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test160");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test161");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test162");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test163");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        Models.PhysicalItem physicalItem19 = null;
        systemPayment0.discount(physicalItem19);
        Models.Client client21 = null;
        Models.Newsletter newsletter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client21, newsletter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test164");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("", (-1.0d), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test165");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test166");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test167");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test168");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client21 = null;
        Models.Newsletter newsletter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client21, newsletter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test169");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.Class<?> wildcardClass7 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test170");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test171");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test172");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test173");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test174");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test175");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test176");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test177");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("", (double) 1L, "hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.Class<?> wildcardClass19 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test178");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.Client client6 = null;
        Models.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client6, newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test179");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test180");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client21 = null;
        Models.Newsletter newsletter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client21, newsletter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test181");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass21 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test182");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.String str22 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str22, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test183");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test184");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test185");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test186");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str24 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "hi!");
        Models.PhysicalItem physicalItem25 = null;
        systemPayment0.discount(physicalItem25);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str24, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test187");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test188");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "");
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass14 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test189");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        Models.PhysicalItem physicalItem19 = null;
        systemPayment0.discount(physicalItem19);
        java.lang.String str24 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str24, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test190");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass10 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test191");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test192");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test193");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test194");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test195");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test196");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test197");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.String str22 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "");
        Models.Client client23 = null;
        Models.Newsletter newsletter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client23, newsletter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str22, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test198");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass16 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test199");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str22 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str22, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test200");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.Class<?> wildcardClass4 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test201");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test202");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test203");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test204");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test205");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        Models.Client client14 = null;
        Models.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client14, newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test206");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "");
        java.lang.String str24 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass25 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str24, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test207");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.Class<?> wildcardClass9 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test208");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test209");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test210");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test211");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test212");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem21 = null;
        systemPayment0.discount(physicalItem21);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test213");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 1.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test214");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("", 0.0d, "hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass14 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test215");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("", (-1.0d), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem16 = null;
        systemPayment1.discount(physicalItem16);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test216");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "");
        java.lang.String str24 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem25 = null;
        systemPayment0.discount(physicalItem25);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str24, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test217");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test218");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test219");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test220");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem19 = null;
        systemPayment0.discount(physicalItem19);
        Models.PhysicalItem physicalItem21 = null;
        systemPayment0.discount(physicalItem21);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test221");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 'a', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.String str22 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str22, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test222");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test223");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1.0f), "");
        java.lang.Class<?> wildcardClass21 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test224");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass21 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test225");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test226");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test227");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test228");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test229");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test230");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test231");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test232");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test233");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 1.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test234");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.Client client12 = null;
        Models.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client12, newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test235");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test236");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "");
        java.lang.String str11 = systemPayment1.payment("", (double) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test237");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str10 = systemPayment0.payment("", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test238");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 'a', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.String str20 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) '#', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test239");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem17 = null;
        systemPayment0.discount(physicalItem17);
        java.lang.String str22 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) ' ', "");
        java.lang.Class<?> wildcardClass23 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str22, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test240");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test241");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 100, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem14 = null;
        systemPayment1.discount(physicalItem14);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test242");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test243");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test244");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 10L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test245");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test246");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.String str13 = systemPayment1.payment("", (double) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test247");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 100, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test248");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        java.lang.Class<?> wildcardClass12 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test249");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test250");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test251");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test252");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test253");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0.0f, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        java.lang.String str13 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str17 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client18 = null;
        Models.Newsletter newsletter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client18, newsletter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str13, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str17, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test254");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.Client client12 = null;
        Models.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client12, newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test255");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client16 = null;
        Models.Newsletter newsletter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client16, newsletter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test256");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.Client client12 = null;
        Models.Newsletter newsletter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client12, newsletter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test257");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client15 = null;
        Models.Newsletter newsletter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client15, newsletter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test258");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 0.0d, "");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test259");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.Client client7 = null;
        Models.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client7, newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test260");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test261");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test262");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test263");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test264");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str15 = systemPayment1.payment("hi!", (double) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test265");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 1.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test266");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test267");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass2 = systemPayment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test268");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client2 = null;
        Models.Newsletter newsletter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client2, newsletter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test269");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        java.lang.String str12 = systemPayment0.payment("", (-1.0d), "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test270");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test271");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("", (-1.0d), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str15 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client16 = null;
        Models.Newsletter newsletter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client16, newsletter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str15, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test272");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test273");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test274");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test275");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 10.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client13 = null;
        Models.Newsletter newsletter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client13, newsletter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test276");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        java.lang.String str17 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 0.0d, "");
        Models.Client client18 = null;
        Models.Newsletter newsletter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client18, newsletter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str17, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test277");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str20 = systemPayment0.payment("hi!", 10.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem21 = null;
        systemPayment0.discount(physicalItem21);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str20, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test278");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 0, "");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass13 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test279");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.Client client8 = null;
        Models.Newsletter newsletter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client8, newsletter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test280");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test281");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test282");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        java.lang.String str5 = systemPayment1.payment("hi!", (double) 1, "");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        Models.PhysicalItem physicalItem8 = null;
        systemPayment1.discount(physicalItem8);
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test283");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        Models.PhysicalItem physicalItem7 = null;
        systemPayment0.discount(physicalItem7);
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test284");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass6 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test285");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test286");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 100.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10.0f, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str18 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (short) 0, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test287");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test288");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 1.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        Models.Client client14 = null;
        Models.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment1.subscribe(client14, newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test289");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test290");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.Class<?> wildcardClass11 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test291");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        Models.PhysicalItem physicalItem4 = null;
        systemPayment1.discount(physicalItem4);
        Models.PhysicalItem physicalItem6 = null;
        systemPayment1.discount(physicalItem6);
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        java.lang.String str17 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 0.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str17, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test292");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "");
        Models.PhysicalItem physicalItem9 = null;
        systemPayment0.discount(physicalItem9);
        Models.PhysicalItem physicalItem11 = null;
        systemPayment0.discount(physicalItem11);
        Models.PhysicalItem physicalItem13 = null;
        systemPayment0.discount(physicalItem13);
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test293");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str5 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (byte) -1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str9 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem10 = null;
        systemPayment1.discount(physicalItem10);
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str5, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str9, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test294");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        Models.PhysicalItem physicalItem3 = null;
        systemPayment0.discount(physicalItem3);
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str12 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test295");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        Models.PhysicalItem physicalItem1 = null;
        systemPayment0.discount(physicalItem1);
        java.lang.String str6 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str14 = systemPayment0.payment("hi!", (double) (short) 100, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str6, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test296");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", 10.0d, "");
        java.lang.String str8 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1L), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test297");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str11 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        Models.PhysicalItem physicalItem12 = null;
        systemPayment1.discount(physicalItem12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str11, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test298");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", 0.0d, "");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", 100.0d, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem15 = null;
        systemPayment0.discount(physicalItem15);
        Models.Client client17 = null;
        Models.Newsletter newsletter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client17, newsletter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test299");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("hi!", (double) 10, "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) ' ', "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 0L, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass15 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test300");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: ", (double) '4', "hi!");
        Models.PhysicalItem physicalItem5 = null;
        systemPayment0.discount(physicalItem5);
        java.lang.String str10 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (-1.0f), "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str14 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ", (double) (byte) 1, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.String str18 = systemPayment0.payment("hi!", (double) '4', "Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.Client client19 = null;
        Models.Newsletter newsletter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemPayment0.subscribe(client19, newsletter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Models.Client.subscribe(Models.Newsletter)\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str10, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str14, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str18, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test301");
        Models.SystemPayment systemPayment0 = Models.SystemPayment.getInstance();
        java.lang.String str4 = systemPayment0.payment("", (double) (short) 100, "");
        java.lang.String str8 = systemPayment0.payment("", 100.0d, "");
        java.lang.String str12 = systemPayment0.payment("", (double) 100L, "Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        java.lang.String str16 = systemPayment0.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) (short) 10, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass17 = systemPayment0.getClass();
        org.junit.Assert.assertNotNull(systemPayment0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str4, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str8, "Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!" + "'", str12, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str16, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test302");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SystemPaymenttestcases0.test303");
        Models.SystemPayment systemPayment1 = new Models.SystemPayment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        Models.PhysicalItem physicalItem2 = null;
        systemPayment1.discount(physicalItem2);
        java.lang.String str7 = systemPayment1.payment("Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: hi!", (double) 1L, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        java.lang.Class<?> wildcardClass8 = systemPayment1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: " + "'", str7, "Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: Payment type unrecognized. Transaction aborted. Payment ID: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

