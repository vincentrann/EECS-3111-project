package randooptestcases;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Newslettertestcases {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test002");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.Class<?> wildcardClass1 = newsletter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test003");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        java.lang.Class<?> wildcardClass5 = newsletter0.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test004");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.getName();
        java.lang.String str6 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test005");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.Class<?> wildcardClass4 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test006");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.lang.Class<?> wildcardClass32 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test007");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.getUrl();
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.lang.String str20 = newsletter18.url();
        Models.Newsletter newsletter22 = new Models.Newsletter();
        java.lang.String str23 = newsletter22.getName();
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.getUrl();
        newsletter18.cancelSubscription("", newsletter22);
        java.util.List<Models.Newsletter> newsletterList28 = newsletter22.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList30 = newsletter22.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList32 = newsletter22.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList34 = newsletter22.viewAvailableNewsletters("");
        newsletter10.cancelSubscription("hi!", newsletter22);
        java.lang.String str36 = newsletter22.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(newsletterList28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test008");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.lang.Class<?> wildcardClass7 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test009");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList8 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test010");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter4.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass18 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test011");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter4.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test012");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.getName();
        java.lang.Class<?> wildcardClass12 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test013");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass4 = newsletterList3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test014");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        java.lang.String str16 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test015");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        double double19 = newsletter4.getMonthlyCost("hi!");
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test016");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass3 = newsletterList2.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test017");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter4.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test018");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.getUrl();
        java.lang.Class<?> wildcardClass9 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test019");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.getName();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.getUrl();
        java.lang.Class<?> wildcardClass7 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test020");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "hi!");
        java.lang.String str3 = newsletter2.url();
        java.lang.Class<?> wildcardClass4 = newsletter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test021");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "hi!");
        java.lang.Class<?> wildcardClass3 = newsletter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test022");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        double double25 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test023");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter8.getUrl();
        java.lang.String str21 = newsletter8.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test024");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getUrl();
        newsletter4.cancelSubscription("", newsletter7);
        java.lang.String str12 = newsletter7.url();
        Models.Newsletter newsletter16 = new Models.Newsletter("", "");
        newsletter7.cancelSubscription("hi!", newsletter16);
        newsletter2.cancelSubscription("", newsletter16);
        java.lang.Class<?> wildcardClass19 = newsletter2.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test025");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        double double14 = newsletter4.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test026");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList7 = newsletter0.viewAvailableNewsletters("hi!");
        double double9 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(newsletterList7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test027");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        double double9 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test028");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test029");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.getUrl();
        java.lang.String str12 = newsletter0.getName();
        double double14 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test030");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.lang.String str26 = newsletter20.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test031");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        double double6 = newsletter0.getMonthlyCost("");
        double double8 = newsletter0.getMonthlyCost("hi!");
        java.lang.String str9 = newsletter0.getName();
        java.lang.Class<?> wildcardClass10 = newsletter0.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test032");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.Class<?> wildcardClass21 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test033");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.Class<?> wildcardClass10 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test034");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass11 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test035");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        double double4 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test036");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        java.lang.String str16 = newsletter4.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test037");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test038");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass7 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test039");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        java.lang.Class<?> wildcardClass10 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test040");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        java.lang.String str15 = newsletter13.url();
        java.lang.String str16 = newsletter13.getUrl();
        newsletter9.cancelSubscription("", newsletter13);
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str20 = newsletter9.getName();
        newsletter3.cancelSubscription("hi!", newsletter9);
        java.lang.Class<?> wildcardClass22 = newsletter9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test041");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter8.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass25 = newsletter8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test042");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        java.util.List<Models.Newsletter> newsletterList8 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass9 = newsletter0.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(newsletterList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test043");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.getName();
        double double7 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList9 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test044");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test045");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        double double16 = newsletter4.getMonthlyCost("hi!");
        java.lang.Class<?> wildcardClass17 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test046");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.lang.Class<?> wildcardClass26 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test047");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.getName();
        java.lang.String str18 = newsletter4.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test048");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        java.lang.Class<?> wildcardClass4 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test049");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.lang.String str23 = newsletter20.getUrl();
        newsletter16.cancelSubscription("", newsletter20);
        java.lang.String str25 = newsletter20.getUrl();
        java.lang.String str26 = newsletter20.url();
        java.lang.String str27 = newsletter20.url();
        newsletter4.cancelSubscription("", newsletter20);
        Models.Newsletter newsletter30 = new Models.Newsletter();
        java.lang.String str31 = newsletter30.getName();
        java.lang.String str32 = newsletter30.url();
        Models.Newsletter newsletter34 = new Models.Newsletter();
        java.lang.String str35 = newsletter34.getName();
        java.lang.String str36 = newsletter34.url();
        java.lang.String str37 = newsletter34.getUrl();
        newsletter30.cancelSubscription("", newsletter34);
        java.lang.String str39 = newsletter34.getName();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList43 = newsletter41.viewAvailableNewsletters("");
        Models.Newsletter newsletter45 = new Models.Newsletter();
        java.lang.String str46 = newsletter45.getName();
        newsletter41.cancelSubscription("hi!", newsletter45);
        newsletter34.cancelSubscription("hi!", newsletter41);
        newsletter4.cancelSubscription("", newsletter34);
        java.lang.Class<?> wildcardClass50 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test050");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        java.lang.String str16 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test051");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        double double17 = newsletter4.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test052");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList33 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass34 = newsletterList33.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test053");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass5 = newsletterList4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test054");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getName();
        java.lang.String str11 = newsletter7.getUrl();
        java.lang.String str12 = newsletter7.getUrl();
        java.lang.String str13 = newsletter7.url();
        newsletter0.cancelSubscription("hi!", newsletter7);
        double double16 = newsletter7.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test055");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        java.lang.String str15 = newsletter13.url();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.lang.String str20 = newsletter17.getUrl();
        newsletter13.cancelSubscription("", newsletter17);
        java.lang.String str22 = newsletter13.getName();
        newsletter0.cancelSubscription("", newsletter13);
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.lang.String str28 = newsletter25.url();
        java.lang.String str29 = newsletter25.getName();
        java.lang.String str30 = newsletter25.getUrl();
        newsletter0.cancelSubscription("hi!", newsletter25);
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter37.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList45 = newsletter37.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList47 = newsletter37.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList49 = newsletter37.viewAvailableNewsletters("");
        java.lang.String str50 = newsletter37.url();
        java.lang.String str51 = newsletter37.getName();
        Models.Newsletter newsletter53 = new Models.Newsletter();
        java.lang.String str54 = newsletter53.getName();
        java.lang.String str55 = newsletter53.url();
        java.util.List<Models.Newsletter> newsletterList57 = newsletter53.viewAvailableNewsletters("");
        newsletter37.cancelSubscription("", newsletter53);
        newsletter0.cancelSubscription("hi!", newsletter53);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNotNull(newsletterList45);
        org.junit.Assert.assertNotNull(newsletterList47);
        org.junit.Assert.assertNotNull(newsletterList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(newsletterList57);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test056");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter5.viewAvailableNewsletters("hi!");
        java.lang.String str16 = newsletter5.url();
        newsletter0.cancelSubscription("", newsletter5);
        java.lang.Class<?> wildcardClass18 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test057");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList19 = newsletter12.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass20 = newsletter12.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test058");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass7 = newsletterList6.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test059");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        java.lang.Class<?> wildcardClass22 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test060");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        double double25 = newsletter11.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test061");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.getName();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList8 = newsletter0.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList8);
        org.junit.Assert.assertNotNull(newsletterList10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test062");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        Models.Newsletter newsletter12 = new Models.Newsletter("", "");
        newsletter3.cancelSubscription("hi!", newsletter12);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter3.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass16 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test063");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter12.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList20 = newsletter12.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter12.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter12.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter25.viewAvailableNewsletters("");
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter33.viewAvailableNewsletters("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        newsletter12.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter25.viewAvailableNewsletters("hi!");
        java.lang.String str49 = newsletter25.url();
        java.lang.String str50 = newsletter25.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test064");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.Class<?> wildcardClass15 = newsletter10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test065");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        java.lang.String str24 = newsletter11.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test066");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("hi!");
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.lang.String str43 = newsletter42.getName();
        java.lang.String str44 = newsletter42.url();
        java.lang.String str45 = newsletter42.getUrl();
        java.util.List<Models.Newsletter> newsletterList47 = newsletter42.viewAvailableNewsletters("");
        java.lang.String str48 = newsletter42.getUrl();
        newsletter17.cancelSubscription("hi!", newsletter42);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(newsletterList47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test067");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.lang.String str14 = newsletter11.getUrl();
        newsletter7.cancelSubscription("", newsletter11);
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList21 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter11.viewAvailableNewsletters("");
        java.lang.String str24 = newsletter11.url();
        java.lang.String str25 = newsletter11.getName();
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        java.util.List<Models.Newsletter> newsletterList31 = newsletter27.viewAvailableNewsletters("");
        newsletter11.cancelSubscription("", newsletter27);
        newsletter0.cancelSubscription("hi!", newsletter11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(newsletterList31);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test068");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter12.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList20 = newsletter12.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter12.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter12.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter25.viewAvailableNewsletters("");
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter33.viewAvailableNewsletters("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        newsletter12.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.lang.String str47 = newsletter25.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test069");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        java.lang.String str36 = newsletter33.getUrl();
        newsletter29.cancelSubscription("", newsletter33);
        java.util.List<Models.Newsletter> newsletterList39 = newsletter33.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList41 = newsletter33.viewAvailableNewsletters("");
        newsletter21.cancelSubscription("", newsletter33);
        java.lang.String str43 = newsletter21.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(newsletterList39);
        org.junit.Assert.assertNotNull(newsletterList41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test070");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        double double10 = newsletter3.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter3.viewAvailableNewsletters("");
        java.lang.String str13 = newsletter3.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test071");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.lang.String str32 = newsletter19.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test072");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test073");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.util.List<Models.Newsletter> newsletterList32 = newsletter29.viewAvailableNewsletters("hi!");
        newsletter23.cancelSubscription("hi!", newsletter29);
        java.lang.String str34 = newsletter29.getName();
        java.lang.String str35 = newsletter29.getUrl();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.lang.String str42 = newsletter41.getName();
        java.lang.String str43 = newsletter41.url();
        java.lang.String str44 = newsletter41.getUrl();
        newsletter37.cancelSubscription("", newsletter41);
        java.util.List<Models.Newsletter> newsletterList47 = newsletter41.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList49 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList51 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList53 = newsletter41.viewAvailableNewsletters("");
        newsletter29.cancelSubscription("hi!", newsletter41);
        newsletter4.cancelSubscription("", newsletter29);
        java.lang.Class<?> wildcardClass56 = newsletter4.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(newsletterList47);
        org.junit.Assert.assertNotNull(newsletterList49);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertNotNull(newsletterList53);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test074");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        java.lang.String str14 = newsletter4.getName();
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(newsletterList16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test075");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test076");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass6 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test077");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        double double8 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test078");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter5.viewAvailableNewsletters("hi!");
        java.lang.String str16 = newsletter5.url();
        newsletter0.cancelSubscription("", newsletter5);
        double double19 = newsletter0.getMonthlyCost("");
        java.lang.String str20 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test079");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.lang.String str23 = newsletter8.getName();
        double double25 = newsletter8.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test080");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList4 = newsletter2.viewAvailableNewsletters("hi!");
        java.lang.String str5 = newsletter2.getName();
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test081");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test082");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter4.viewAvailableNewsletters("");
        double double19 = newsletter4.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test083");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass4 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test084");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.lang.Class<?> wildcardClass32 = newsletter19.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test085");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.util.List<Models.Newsletter> newsletterList27 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList29 = newsletter4.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNotNull(newsletterList29);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test086");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter10.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test087");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        java.lang.String str24 = newsletter22.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test088");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.getName();
        double double7 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList9 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test089");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str6 = newsletter0.url();
        java.lang.String str7 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test090");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        Models.Newsletter newsletter12 = new Models.Newsletter("", "");
        newsletter3.cancelSubscription("hi!", newsletter12);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter3.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.util.List<Models.Newsletter> newsletterList20 = newsletter17.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter22 = new Models.Newsletter();
        java.lang.String str23 = newsletter22.getName();
        java.lang.String str24 = newsletter22.url();
        Models.Newsletter newsletter26 = new Models.Newsletter();
        java.lang.String str27 = newsletter26.getName();
        java.lang.String str28 = newsletter26.url();
        java.lang.String str29 = newsletter26.getUrl();
        newsletter22.cancelSubscription("", newsletter26);
        java.util.List<Models.Newsletter> newsletterList32 = newsletter22.viewAvailableNewsletters("hi!");
        java.lang.String str33 = newsletter22.url();
        newsletter17.cancelSubscription("", newsletter22);
        Models.Newsletter newsletter36 = new Models.Newsletter();
        java.lang.String str37 = newsletter36.getName();
        java.lang.String str38 = newsletter36.url();
        java.util.List<Models.Newsletter> newsletterList40 = newsletter36.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList42 = newsletter36.viewAvailableNewsletters("");
        java.lang.String str43 = newsletter36.url();
        newsletter22.cancelSubscription("hi!", newsletter36);
        newsletter3.cancelSubscription("hi!", newsletter22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(newsletterList40);
        org.junit.Assert.assertNotNull(newsletterList42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test091");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.lang.String str7 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test092");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getName();
        java.lang.String str11 = newsletter7.getUrl();
        java.lang.String str12 = newsletter7.getUrl();
        java.lang.String str13 = newsletter7.url();
        newsletter0.cancelSubscription("hi!", newsletter7);
        double double16 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test093");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.Class<?> wildcardClass6 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test094");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        double double9 = newsletter0.getMonthlyCost("hi!");
        java.lang.String str10 = newsletter0.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        java.lang.String str19 = newsletter16.getUrl();
        newsletter12.cancelSubscription("", newsletter16);
        java.util.List<Models.Newsletter> newsletterList22 = newsletter16.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList24 = newsletter16.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList26 = newsletter16.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList28 = newsletter16.viewAvailableNewsletters("");
        java.lang.String str29 = newsletter16.url();
        java.lang.String str30 = newsletter16.getName();
        double double32 = newsletter16.getMonthlyCost("");
        newsletter0.cancelSubscription("", newsletter16);
        double double35 = newsletter16.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(newsletterList26);
        org.junit.Assert.assertNotNull(newsletterList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test095");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.util.List<Models.Newsletter> newsletterList32 = newsletter29.viewAvailableNewsletters("hi!");
        newsletter23.cancelSubscription("hi!", newsletter29);
        java.lang.String str34 = newsletter29.getName();
        java.lang.String str35 = newsletter29.getUrl();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.lang.String str42 = newsletter41.getName();
        java.lang.String str43 = newsletter41.url();
        java.lang.String str44 = newsletter41.getUrl();
        newsletter37.cancelSubscription("", newsletter41);
        java.util.List<Models.Newsletter> newsletterList47 = newsletter41.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList49 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList51 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList53 = newsletter41.viewAvailableNewsletters("");
        newsletter29.cancelSubscription("hi!", newsletter41);
        newsletter4.cancelSubscription("", newsletter29);
        Models.Newsletter newsletter57 = new Models.Newsletter();
        java.lang.String str58 = newsletter57.getName();
        java.lang.String str59 = newsletter57.url();
        java.lang.String str60 = newsletter57.getUrl();
        java.lang.String str61 = newsletter57.url();
        newsletter4.cancelSubscription("", newsletter57);
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(newsletterList47);
        org.junit.Assert.assertNotNull(newsletterList49);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertNotNull(newsletterList53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test096");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str7 = newsletter0.getUrl();
        java.lang.Class<?> wildcardClass8 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test097");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str11 = newsletter0.getUrl();
        java.lang.Class<?> wildcardClass12 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test098");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        java.lang.String str4 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test099");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        double double5 = newsletter0.getMonthlyCost("");
        double double7 = newsletter0.getMonthlyCost("");
        java.util.List<Models.Newsletter> newsletterList9 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass10 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test100");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        java.lang.Class<?> wildcardClass18 = newsletter12.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test101");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.lang.Class<?> wildcardClass23 = newsletter8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test102");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter6 = new Models.Newsletter();
        java.lang.String str7 = newsletter6.getName();
        java.lang.String str8 = newsletter6.url();
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.lang.String str12 = newsletter10.url();
        java.lang.String str13 = newsletter10.getUrl();
        newsletter6.cancelSubscription("", newsletter10);
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.util.List<Models.Newsletter> newsletterList19 = newsletter16.viewAvailableNewsletters("hi!");
        newsletter10.cancelSubscription("hi!", newsletter16);
        newsletter0.cancelSubscription("hi!", newsletter10);
        double double23 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test103");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("", newsletter25);
        Models.Newsletter newsletter30 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList32 = newsletter30.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter30);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNotNull(newsletterList32);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test104");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.getUrl();
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList20 = newsletter18.viewAvailableNewsletters("");
        newsletter10.cancelSubscription("hi!", newsletter18);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(newsletterList20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test105");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.getUrl();
        java.lang.String str12 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test106");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.lang.String str23 = newsletter20.getUrl();
        newsletter16.cancelSubscription("", newsletter20);
        java.lang.String str25 = newsletter20.getUrl();
        java.lang.String str26 = newsletter20.url();
        java.lang.String str27 = newsletter20.url();
        newsletter4.cancelSubscription("", newsletter20);
        double double30 = newsletter4.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test107");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.getUrl();
        java.lang.String str18 = newsletter4.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test108");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        double double29 = newsletter0.getMonthlyCost("hi!");
        java.lang.String str30 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test109");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        double double10 = newsletter3.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter3.viewAvailableNewsletters("");
        java.lang.String str13 = newsletter3.getUrl();
        java.lang.Class<?> wildcardClass14 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test110");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.getName();
        java.lang.Class<?> wildcardClass5 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test111");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test112");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("hi!", newsletter19);
        java.util.List<Models.Newsletter> newsletterList33 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList35 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList37 = newsletter4.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNotNull(newsletterList33);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNotNull(newsletterList37);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test113");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter5.viewAvailableNewsletters("hi!");
        java.lang.String str16 = newsletter5.url();
        newsletter0.cancelSubscription("", newsletter5);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.util.List<Models.Newsletter> newsletterList23 = newsletter19.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList25 = newsletter19.viewAvailableNewsletters("");
        java.lang.String str26 = newsletter19.url();
        newsletter5.cancelSubscription("hi!", newsletter19);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        Models.Newsletter newsletter32 = new Models.Newsletter();
        java.lang.String str33 = newsletter32.getName();
        java.lang.String str34 = newsletter32.url();
        java.lang.String str35 = newsletter32.getUrl();
        newsletter29.cancelSubscription("", newsletter32);
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.lang.String str43 = newsletter42.getName();
        java.lang.String str44 = newsletter42.url();
        java.lang.String str45 = newsletter42.getUrl();
        newsletter38.cancelSubscription("", newsletter42);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter38.viewAvailableNewsletters("");
        java.lang.String str49 = newsletter38.getName();
        newsletter32.cancelSubscription("hi!", newsletter38);
        java.lang.String str51 = newsletter38.getUrl();
        newsletter5.cancelSubscription("", newsletter38);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test114");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter9.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList21 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str22 = newsletter9.url();
        java.lang.String str23 = newsletter9.getName();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        newsletter9.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList35 = newsletter33.viewAvailableNewsletters("");
        double double37 = newsletter33.getMonthlyCost("");
        double double39 = newsletter33.getMonthlyCost("");
        double double41 = newsletter33.getMonthlyCost("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        double double44 = newsletter33.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test115");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.getUrl();
        java.lang.Class<?> wildcardClass3 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test116");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        java.lang.String str28 = newsletter0.url();
        java.lang.String str29 = newsletter0.getUrl();
        double double31 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test117");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        double double10 = newsletter3.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter3.viewAvailableNewsletters("");
        Models.Newsletter newsletter14 = new Models.Newsletter();
        java.lang.String str15 = newsletter14.getName();
        java.util.List<Models.Newsletter> newsletterList17 = newsletter14.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        java.lang.String str30 = newsletter19.url();
        newsletter14.cancelSubscription("", newsletter19);
        double double33 = newsletter19.getMonthlyCost("");
        java.lang.String str34 = newsletter19.url();
        newsletter3.cancelSubscription("hi!", newsletter19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test118");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.getName();
        double double27 = newsletter22.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test119");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter0.getName();
        java.lang.String str9 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test120");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str7 = newsletter0.url();
        java.lang.String str8 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test121");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        java.lang.String str19 = newsletter4.getUrl();
        java.lang.String str20 = newsletter4.getName();
        double double22 = newsletter4.getMonthlyCost("");
        java.lang.String str23 = newsletter4.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test122");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str11 = newsletter0.getName();
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        java.lang.String str15 = newsletter13.url();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.lang.String str20 = newsletter17.getUrl();
        newsletter13.cancelSubscription("", newsletter17);
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList25 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList29 = newsletter17.viewAvailableNewsletters("");
        java.lang.String str30 = newsletter17.url();
        Models.Newsletter newsletter32 = new Models.Newsletter();
        java.lang.String str33 = newsletter32.getName();
        java.lang.String str34 = newsletter32.url();
        Models.Newsletter newsletter36 = new Models.Newsletter();
        java.lang.String str37 = newsletter36.getName();
        java.lang.String str38 = newsletter36.url();
        java.lang.String str39 = newsletter36.getUrl();
        newsletter32.cancelSubscription("", newsletter36);
        java.lang.String str41 = newsletter32.getName();
        java.util.List<Models.Newsletter> newsletterList43 = newsletter32.viewAvailableNewsletters("");
        newsletter17.cancelSubscription("hi!", newsletter32);
        java.lang.String str45 = newsletter32.url();
        Models.Newsletter newsletter47 = new Models.Newsletter();
        java.lang.String str48 = newsletter47.getName();
        java.lang.String str49 = newsletter47.url();
        java.util.List<Models.Newsletter> newsletterList51 = newsletter47.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList53 = newsletter47.viewAvailableNewsletters("");
        Models.Newsletter newsletter55 = new Models.Newsletter();
        java.lang.String str56 = newsletter55.getName();
        java.lang.String str57 = newsletter55.url();
        Models.Newsletter newsletter59 = new Models.Newsletter();
        java.lang.String str60 = newsletter59.getName();
        java.lang.String str61 = newsletter59.url();
        java.lang.String str62 = newsletter59.getUrl();
        newsletter55.cancelSubscription("", newsletter59);
        java.util.List<Models.Newsletter> newsletterList65 = newsletter55.viewAvailableNewsletters("hi!");
        newsletter47.cancelSubscription("", newsletter55);
        java.lang.String str67 = newsletter55.getUrl();
        Models.Newsletter newsletter71 = new Models.Newsletter("hi!", "hi!");
        newsletter55.cancelSubscription("", newsletter71);
        newsletter32.cancelSubscription("hi!", newsletter71);
        newsletter0.cancelSubscription("", newsletter32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertNotNull(newsletterList53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(newsletterList65);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test123");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.lang.String str23 = newsletter20.getUrl();
        newsletter16.cancelSubscription("", newsletter20);
        java.lang.String str25 = newsletter20.getUrl();
        java.lang.String str26 = newsletter20.url();
        java.lang.String str27 = newsletter20.url();
        newsletter4.cancelSubscription("", newsletter20);
        java.util.List<Models.Newsletter> newsletterList30 = newsletter20.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList30);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test124");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.util.List<Models.Newsletter> newsletterList27 = newsletter4.viewAvailableNewsletters("");
        double double29 = newsletter4.getMonthlyCost("");
        Models.Newsletter newsletter31 = null;
        newsletter4.cancelSubscription("hi!", newsletter31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test125");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        double double6 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        newsletter0.cancelSubscription("hi!", newsletter8);
        double double12 = newsletter8.getMonthlyCost("");
        java.lang.Class<?> wildcardClass13 = newsletter8.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test126");
        Models.Newsletter newsletter2 = new Models.Newsletter("hi!", "");
        java.lang.String str3 = newsletter2.url();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test127");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        java.lang.String str5 = newsletter0.url();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test128");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        java.lang.String str19 = newsletter4.getUrl();
        java.lang.String str20 = newsletter4.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test129");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getUrl();
        newsletter4.cancelSubscription("", newsletter7);
        java.lang.String str12 = newsletter7.url();
        Models.Newsletter newsletter16 = new Models.Newsletter("", "");
        newsletter7.cancelSubscription("hi!", newsletter16);
        newsletter2.cancelSubscription("", newsletter16);
        java.util.List<Models.Newsletter> newsletterList20 = newsletter16.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test130");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter21.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(newsletterList29);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test131");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.lang.String str23 = newsletter20.getUrl();
        newsletter16.cancelSubscription("", newsletter20);
        java.lang.String str25 = newsletter20.getUrl();
        java.lang.String str26 = newsletter20.url();
        java.lang.String str27 = newsletter20.url();
        newsletter4.cancelSubscription("", newsletter20);
        Models.Newsletter newsletter30 = new Models.Newsletter();
        java.lang.String str31 = newsletter30.getName();
        java.lang.String str32 = newsletter30.url();
        Models.Newsletter newsletter34 = new Models.Newsletter();
        java.lang.String str35 = newsletter34.getName();
        java.lang.String str36 = newsletter34.url();
        java.lang.String str37 = newsletter34.getUrl();
        newsletter30.cancelSubscription("", newsletter34);
        java.lang.String str39 = newsletter34.getName();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList43 = newsletter41.viewAvailableNewsletters("");
        Models.Newsletter newsletter45 = new Models.Newsletter();
        java.lang.String str46 = newsletter45.getName();
        newsletter41.cancelSubscription("hi!", newsletter45);
        newsletter34.cancelSubscription("hi!", newsletter41);
        newsletter4.cancelSubscription("", newsletter34);
        java.util.List<Models.Newsletter> newsletterList51 = newsletter4.viewAvailableNewsletters("hi!");
        java.lang.String str52 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test132");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        double double15 = newsletter4.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test133");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        double double29 = newsletter0.getMonthlyCost("hi!");
        java.lang.Class<?> wildcardClass30 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test134");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        java.lang.String str19 = newsletter4.getUrl();
        java.lang.String str20 = newsletter4.getName();
        double double22 = newsletter4.getMonthlyCost("");
        java.lang.Class<?> wildcardClass23 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test135");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter8.viewAvailableNewsletters("");
        double double26 = newsletter8.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test136");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.lang.String str23 = newsletter20.getUrl();
        newsletter16.cancelSubscription("", newsletter20);
        java.lang.String str25 = newsletter20.getUrl();
        java.lang.String str26 = newsletter20.url();
        java.lang.String str27 = newsletter20.url();
        newsletter4.cancelSubscription("", newsletter20);
        java.lang.Class<?> wildcardClass29 = newsletter20.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test137");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.lang.String str23 = newsletter8.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test138");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getName();
        java.lang.String str11 = newsletter7.getUrl();
        java.lang.String str12 = newsletter7.getUrl();
        java.lang.String str13 = newsletter7.url();
        newsletter0.cancelSubscription("hi!", newsletter7);
        double double16 = newsletter7.getMonthlyCost("");
        java.lang.String str17 = newsletter7.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test139");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter22 = new Models.Newsletter("", "");
        newsletter11.cancelSubscription("", newsletter22);
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.getName();
        java.lang.String str26 = newsletter22.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test140");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("", newsletter25);
        Models.Newsletter newsletter30 = new Models.Newsletter();
        java.lang.String str31 = newsletter30.getName();
        java.lang.String str32 = newsletter30.url();
        java.util.List<Models.Newsletter> newsletterList34 = newsletter30.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList36 = newsletter30.viewAvailableNewsletters("");
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.lang.String str43 = newsletter42.getName();
        java.lang.String str44 = newsletter42.url();
        java.lang.String str45 = newsletter42.getUrl();
        newsletter38.cancelSubscription("", newsletter42);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter38.viewAvailableNewsletters("hi!");
        newsletter30.cancelSubscription("", newsletter38);
        java.lang.String str50 = newsletter38.url();
        newsletter25.cancelSubscription("hi!", newsletter38);
        java.lang.String str52 = newsletter38.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNotNull(newsletterList36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test141");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        double double25 = newsletter0.getMonthlyCost("hi!");
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter27.cancelSubscription("", newsletter31);
        java.lang.String str36 = newsletter27.getName();
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        java.util.List<Models.Newsletter> newsletterList42 = newsletter38.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList44 = newsletter38.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        java.lang.String str48 = newsletter46.url();
        Models.Newsletter newsletter50 = new Models.Newsletter();
        java.lang.String str51 = newsletter50.getName();
        java.lang.String str52 = newsletter50.url();
        java.lang.String str53 = newsletter50.getUrl();
        newsletter46.cancelSubscription("", newsletter50);
        java.util.List<Models.Newsletter> newsletterList56 = newsletter46.viewAvailableNewsletters("hi!");
        newsletter38.cancelSubscription("", newsletter46);
        double double59 = newsletter46.getMonthlyCost("");
        newsletter27.cancelSubscription("hi!", newsletter46);
        newsletter0.cancelSubscription("", newsletter46);
        java.util.List<Models.Newsletter> newsletterList63 = newsletter0.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList65 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList42);
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(newsletterList56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList63);
        org.junit.Assert.assertNotNull(newsletterList65);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test142");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        java.lang.Class<?> wildcardClass9 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test143");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.getUrl();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.lang.String str7 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test144");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.lang.String str32 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test145");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        java.lang.String str14 = newsletter4.getName();
        java.lang.String str15 = newsletter4.url();
        java.lang.String str16 = newsletter4.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test146");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getUrl();
        Models.Newsletter newsletter24 = new Models.Newsletter();
        java.lang.String str25 = newsletter24.getName();
        java.lang.String str26 = newsletter24.url();
        Models.Newsletter newsletter28 = new Models.Newsletter();
        java.lang.String str29 = newsletter28.getName();
        java.lang.String str30 = newsletter28.url();
        java.lang.String str31 = newsletter28.getUrl();
        newsletter24.cancelSubscription("", newsletter28);
        java.util.List<Models.Newsletter> newsletterList34 = newsletter28.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList36 = newsletter28.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList38 = newsletter28.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList40 = newsletter28.viewAvailableNewsletters("");
        java.lang.String str41 = newsletter28.url();
        java.lang.String str42 = newsletter28.getName();
        double double44 = newsletter28.getMonthlyCost("");
        java.lang.String str45 = newsletter28.getUrl();
        Models.Newsletter newsletter49 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList51 = newsletter49.viewAvailableNewsletters("hi!");
        newsletter28.cancelSubscription("", newsletter49);
        java.lang.String str53 = newsletter49.getUrl();
        newsletter8.cancelSubscription("hi!", newsletter49);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNotNull(newsletterList36);
        org.junit.Assert.assertNotNull(newsletterList38);
        org.junit.Assert.assertNotNull(newsletterList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test147");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("", newsletter25);
        double double30 = newsletter25.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test148");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        Models.Newsletter newsletter12 = new Models.Newsletter("", "");
        newsletter3.cancelSubscription("hi!", newsletter12);
        java.lang.String str14 = newsletter12.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test149");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        java.lang.Class<?> wildcardClass16 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test150");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        Models.Newsletter newsletter28 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter28.viewAvailableNewsletters("");
        Models.Newsletter newsletter32 = new Models.Newsletter();
        java.lang.String str33 = newsletter32.getName();
        newsletter28.cancelSubscription("hi!", newsletter32);
        newsletter15.cancelSubscription("", newsletter28);
        java.lang.String str36 = newsletter28.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test151");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter8.getUrl();
        Models.Newsletter newsletter24 = new Models.Newsletter("hi!", "hi!");
        newsletter8.cancelSubscription("", newsletter24);
        java.lang.String str26 = newsletter8.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test152");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.lang.String str17 = newsletter8.getName();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.util.List<Models.Newsletter> newsletterList23 = newsletter19.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList25 = newsletter19.viewAvailableNewsletters("");
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter27.cancelSubscription("", newsletter31);
        java.util.List<Models.Newsletter> newsletterList37 = newsletter27.viewAvailableNewsletters("hi!");
        newsletter19.cancelSubscription("", newsletter27);
        double double40 = newsletter27.getMonthlyCost("");
        java.lang.String str41 = newsletter27.getName();
        newsletter8.cancelSubscription("hi!", newsletter27);
        newsletter0.cancelSubscription("", newsletter8);
        java.util.List<Models.Newsletter> newsletterList45 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str46 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(newsletterList37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(newsletterList45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test153");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        double double23 = newsletter4.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test154");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        Models.Newsletter newsletter12 = new Models.Newsletter("", "");
        newsletter3.cancelSubscription("hi!", newsletter12);
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.util.List<Models.Newsletter> newsletterList28 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter19.cancelSubscription("hi!", newsletter25);
        double double31 = newsletter19.getMonthlyCost("hi!");
        newsletter3.cancelSubscription("hi!", newsletter19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test155");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass11 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test156");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        double double32 = newsletter19.getMonthlyCost("");
        java.lang.String str33 = newsletter19.getName();
        newsletter0.cancelSubscription("hi!", newsletter19);
        java.lang.String str35 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test157");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        double double25 = newsletter0.getMonthlyCost("hi!");
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter27.cancelSubscription("", newsletter31);
        java.lang.String str36 = newsletter27.getName();
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        java.util.List<Models.Newsletter> newsletterList42 = newsletter38.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList44 = newsletter38.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        java.lang.String str48 = newsletter46.url();
        Models.Newsletter newsletter50 = new Models.Newsletter();
        java.lang.String str51 = newsletter50.getName();
        java.lang.String str52 = newsletter50.url();
        java.lang.String str53 = newsletter50.getUrl();
        newsletter46.cancelSubscription("", newsletter50);
        java.util.List<Models.Newsletter> newsletterList56 = newsletter46.viewAvailableNewsletters("hi!");
        newsletter38.cancelSubscription("", newsletter46);
        double double59 = newsletter46.getMonthlyCost("");
        newsletter27.cancelSubscription("hi!", newsletter46);
        newsletter0.cancelSubscription("", newsletter46);
        java.lang.String str62 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList42);
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(newsletterList56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test158");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        newsletter11.cancelSubscription("hi!", newsletter15);
        newsletter4.cancelSubscription("hi!", newsletter11);
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        java.lang.String str25 = newsletter20.url();
        newsletter11.cancelSubscription("hi!", newsletter20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test159");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter8.url();
        java.util.List<Models.Newsletter> newsletterList22 = newsletter8.viewAvailableNewsletters("");
        double double24 = newsletter8.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test160");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter9.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList21 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str22 = newsletter9.url();
        java.lang.String str23 = newsletter9.getName();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        newsletter9.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.lang.String str32 = newsletter25.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test161");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str6 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test162");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str6 = newsletter0.url();
        double double8 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test163");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.lang.String str17 = newsletter8.getName();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.util.List<Models.Newsletter> newsletterList23 = newsletter19.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList25 = newsletter19.viewAvailableNewsletters("");
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter27.cancelSubscription("", newsletter31);
        java.util.List<Models.Newsletter> newsletterList37 = newsletter27.viewAvailableNewsletters("hi!");
        newsletter19.cancelSubscription("", newsletter27);
        double double40 = newsletter27.getMonthlyCost("");
        java.lang.String str41 = newsletter27.getName();
        newsletter8.cancelSubscription("hi!", newsletter27);
        newsletter0.cancelSubscription("", newsletter8);
        java.util.List<Models.Newsletter> newsletterList45 = newsletter0.viewAvailableNewsletters("");
        java.lang.Class<?> wildcardClass46 = newsletterList45.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(newsletterList37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(newsletterList45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test164");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter8.getUrl();
        Models.Newsletter newsletter24 = new Models.Newsletter("hi!", "hi!");
        newsletter8.cancelSubscription("", newsletter24);
        java.lang.Class<?> wildcardClass26 = newsletter24.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test165");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        java.lang.String str15 = newsletter13.url();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.lang.String str20 = newsletter17.getUrl();
        newsletter13.cancelSubscription("", newsletter17);
        java.lang.String str22 = newsletter13.getName();
        newsletter0.cancelSubscription("", newsletter13);
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.lang.String str28 = newsletter25.url();
        java.lang.String str29 = newsletter25.getName();
        newsletter13.cancelSubscription("", newsletter25);
        java.lang.String str31 = newsletter13.getUrl();
        java.lang.Class<?> wildcardClass32 = newsletter13.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test166");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        java.lang.String str27 = newsletter15.getName();
        double double29 = newsletter15.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test167");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        java.lang.Class<?> wildcardClass28 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test168");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.getUrl();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList9 = newsletter4.viewAvailableNewsletters("hi!");
        java.lang.String str10 = newsletter4.url();
        double double12 = newsletter4.getMonthlyCost("hi!");
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str14 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test169");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getUrl();
        java.lang.String str23 = newsletter8.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test170");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str11 = newsletter0.getName();
        java.lang.String str12 = newsletter0.getName();
        java.lang.String str13 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test171");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        java.lang.String str7 = newsletter0.getName();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test172");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.lang.String str32 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList34 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str35 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test173");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str12 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList14 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass15 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test174");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.lang.String str34 = newsletter25.getName();
        Models.Newsletter newsletter36 = new Models.Newsletter();
        java.lang.String str37 = newsletter36.getName();
        java.lang.String str38 = newsletter36.url();
        java.util.List<Models.Newsletter> newsletterList40 = newsletter36.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList42 = newsletter36.viewAvailableNewsletters("");
        Models.Newsletter newsletter44 = new Models.Newsletter();
        java.lang.String str45 = newsletter44.getName();
        java.lang.String str46 = newsletter44.url();
        Models.Newsletter newsletter48 = new Models.Newsletter();
        java.lang.String str49 = newsletter48.getName();
        java.lang.String str50 = newsletter48.url();
        java.lang.String str51 = newsletter48.getUrl();
        newsletter44.cancelSubscription("", newsletter48);
        java.util.List<Models.Newsletter> newsletterList54 = newsletter44.viewAvailableNewsletters("hi!");
        newsletter36.cancelSubscription("", newsletter44);
        newsletter25.cancelSubscription("", newsletter44);
        newsletter0.cancelSubscription("hi!", newsletter25);
        java.lang.String str58 = newsletter25.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(newsletterList40);
        org.junit.Assert.assertNotNull(newsletterList42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(newsletterList54);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test175");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getName();
        java.lang.String str11 = newsletter7.getUrl();
        java.lang.String str12 = newsletter7.getUrl();
        java.lang.String str13 = newsletter7.url();
        newsletter0.cancelSubscription("hi!", newsletter7);
        java.util.List<Models.Newsletter> newsletterList16 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test176");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.Class<?> wildcardClass5 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test177");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        java.lang.String str5 = newsletter0.getName();
        java.lang.String str6 = newsletter0.url();
        double double8 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test178");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("");
        double double7 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test179");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        double double8 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test180");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.util.List<Models.Newsletter> newsletterList21 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test181");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test182");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test183");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter12.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList20 = newsletter12.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter12.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter12.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter25.viewAvailableNewsletters("");
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter33.viewAvailableNewsletters("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        newsletter12.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter25.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList50 = newsletter25.viewAvailableNewsletters("");
        java.lang.String str51 = newsletter25.url();
        double double53 = newsletter25.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNotNull(newsletterList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test184");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("hi!", newsletter19);
        java.lang.String str32 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test185");
        Models.Newsletter newsletter2 = new Models.Newsletter("", "hi!");
        java.lang.String str3 = newsletter2.url();
        double double5 = newsletter2.getMonthlyCost("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test186");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        double double9 = newsletter0.getMonthlyCost("hi!");
        java.lang.String str10 = newsletter0.url();
        java.lang.String str11 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test187");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.getUrl();
        java.lang.String str12 = newsletter0.getName();
        java.lang.Class<?> wildcardClass13 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test188");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        java.lang.String str24 = newsletter12.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test189");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.url();
        double double17 = newsletter4.getMonthlyCost("hi!");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        Models.Newsletter newsletter32 = new Models.Newsletter();
        java.lang.String str33 = newsletter32.getName();
        java.lang.String str34 = newsletter32.url();
        Models.Newsletter newsletter36 = new Models.Newsletter();
        java.lang.String str37 = newsletter36.getName();
        java.lang.String str38 = newsletter36.url();
        java.lang.String str39 = newsletter36.getUrl();
        newsletter32.cancelSubscription("", newsletter36);
        java.lang.String str41 = newsletter32.getName();
        newsletter19.cancelSubscription("", newsletter32);
        newsletter4.cancelSubscription("hi!", newsletter32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test190");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        java.lang.String str15 = newsletter13.url();
        java.lang.String str16 = newsletter13.getUrl();
        newsletter9.cancelSubscription("", newsletter13);
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str20 = newsletter9.getName();
        newsletter3.cancelSubscription("hi!", newsletter9);
        java.lang.Class<?> wildcardClass22 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test191");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.lang.String str10 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList12 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str13 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test192");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        double double25 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList27);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test193");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter12.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList20 = newsletter12.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter12.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter12.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter25.viewAvailableNewsletters("");
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter33.viewAvailableNewsletters("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        newsletter12.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter25.viewAvailableNewsletters("hi!");
        java.lang.String str49 = newsletter25.getName();
        java.lang.String str50 = newsletter25.getUrl();
        Models.Newsletter newsletter52 = new Models.Newsletter();
        java.lang.String str53 = newsletter52.getName();
        java.lang.String str54 = newsletter52.url();
        Models.Newsletter newsletter56 = new Models.Newsletter();
        java.lang.String str57 = newsletter56.getName();
        java.lang.String str58 = newsletter56.url();
        java.lang.String str59 = newsletter56.getUrl();
        newsletter52.cancelSubscription("", newsletter56);
        java.util.List<Models.Newsletter> newsletterList62 = newsletter52.viewAvailableNewsletters("");
        newsletter25.cancelSubscription("hi!", newsletter52);
        java.lang.String str64 = newsletter52.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(newsletterList62);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test194");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.url();
        double double6 = newsletter0.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test195");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.lang.String str10 = newsletter0.getName();
        java.lang.Class<?> wildcardClass11 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test196");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter18.viewAvailableNewsletters("hi!");
        newsletter12.cancelSubscription("hi!", newsletter18);
        newsletter0.cancelSubscription("hi!", newsletter12);
        double double25 = newsletter0.getMonthlyCost("hi!");
        Models.Newsletter newsletter27 = new Models.Newsletter();
        java.lang.String str28 = newsletter27.getName();
        java.lang.String str29 = newsletter27.url();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter27.cancelSubscription("", newsletter31);
        java.lang.String str36 = newsletter27.getName();
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        java.util.List<Models.Newsletter> newsletterList42 = newsletter38.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList44 = newsletter38.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        java.lang.String str48 = newsletter46.url();
        Models.Newsletter newsletter50 = new Models.Newsletter();
        java.lang.String str51 = newsletter50.getName();
        java.lang.String str52 = newsletter50.url();
        java.lang.String str53 = newsletter50.getUrl();
        newsletter46.cancelSubscription("", newsletter50);
        java.util.List<Models.Newsletter> newsletterList56 = newsletter46.viewAvailableNewsletters("hi!");
        newsletter38.cancelSubscription("", newsletter46);
        double double59 = newsletter46.getMonthlyCost("");
        newsletter27.cancelSubscription("hi!", newsletter46);
        newsletter0.cancelSubscription("", newsletter46);
        java.util.List<Models.Newsletter> newsletterList63 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str64 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList42);
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(newsletterList56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList63);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test197");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        java.lang.String str8 = newsletter3.url();
        java.lang.String str9 = newsletter3.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.lang.String str14 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList16 = newsletter11.viewAvailableNewsletters("hi!");
        java.lang.String str17 = newsletter11.url();
        newsletter3.cancelSubscription("hi!", newsletter11);
        java.lang.Class<?> wildcardClass19 = newsletter3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test198");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        java.lang.String str27 = newsletter15.getUrl();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter15.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter15.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test199");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        double double6 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        newsletter0.cancelSubscription("hi!", newsletter8);
        java.lang.String str11 = newsletter8.getName();
        java.lang.String str12 = newsletter8.getUrl();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test200");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        double double32 = newsletter19.getMonthlyCost("");
        java.lang.String str33 = newsletter19.getName();
        newsletter0.cancelSubscription("hi!", newsletter19);
        java.lang.String str35 = newsletter19.getUrl();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.getUrl();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.lang.String str42 = newsletter41.getName();
        java.lang.String str43 = newsletter41.url();
        java.lang.String str44 = newsletter41.url();
        java.util.List<Models.Newsletter> newsletterList46 = newsletter41.viewAvailableNewsletters("hi!");
        java.lang.String str47 = newsletter41.url();
        double double49 = newsletter41.getMonthlyCost("hi!");
        newsletter37.cancelSubscription("", newsletter41);
        newsletter19.cancelSubscription("hi!", newsletter37);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(newsletterList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test201");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str11 = newsletter0.getName();
        java.lang.String str12 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList14 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str15 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test202");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        double double24 = newsletter8.getMonthlyCost("hi!");
        double double26 = newsletter8.getMonthlyCost("");
        java.lang.String str27 = newsletter8.getUrl();
        double double29 = newsletter8.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test203");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str12 = newsletter0.url();
        Models.Newsletter newsletter14 = new Models.Newsletter();
        java.lang.String str15 = newsletter14.getName();
        java.lang.String str16 = newsletter14.url();
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.lang.String str20 = newsletter18.url();
        java.lang.String str21 = newsletter18.getUrl();
        newsletter14.cancelSubscription("", newsletter18);
        Models.Newsletter newsletter24 = new Models.Newsletter();
        java.lang.String str25 = newsletter24.getName();
        java.util.List<Models.Newsletter> newsletterList27 = newsletter24.viewAvailableNewsletters("hi!");
        newsletter18.cancelSubscription("hi!", newsletter24);
        newsletter0.cancelSubscription("hi!", newsletter24);
        double double31 = newsletter0.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test204");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList19 = newsletter12.viewAvailableNewsletters("hi!");
        java.lang.String str20 = newsletter12.url();
        java.lang.String str21 = newsletter12.url();
        java.util.List<Models.Newsletter> newsletterList23 = newsletter12.viewAvailableNewsletters("");
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test205");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("hi!", newsletter19);
        java.lang.String str32 = newsletter19.getUrl();
        java.lang.String str33 = newsletter19.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test206");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        java.lang.String str27 = newsletter15.getUrl();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter15.viewAvailableNewsletters("");
        java.lang.String str30 = newsletter15.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test207");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        java.lang.String str27 = newsletter15.getUrl();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter15.viewAvailableNewsletters("");
        java.lang.String str30 = newsletter15.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test208");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("hi!", newsletter19);
        java.lang.String str32 = newsletter19.url();
        Models.Newsletter newsletter34 = new Models.Newsletter();
        java.lang.String str35 = newsletter34.getName();
        java.lang.String str36 = newsletter34.url();
        java.util.List<Models.Newsletter> newsletterList38 = newsletter34.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList40 = newsletter34.viewAvailableNewsletters("");
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.lang.String str43 = newsletter42.getName();
        java.lang.String str44 = newsletter42.url();
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        java.lang.String str48 = newsletter46.url();
        java.lang.String str49 = newsletter46.getUrl();
        newsletter42.cancelSubscription("", newsletter46);
        java.util.List<Models.Newsletter> newsletterList52 = newsletter42.viewAvailableNewsletters("hi!");
        newsletter34.cancelSubscription("", newsletter42);
        java.lang.String str54 = newsletter42.getUrl();
        Models.Newsletter newsletter58 = new Models.Newsletter("hi!", "hi!");
        newsletter42.cancelSubscription("", newsletter58);
        newsletter19.cancelSubscription("hi!", newsletter58);
        java.lang.String str61 = newsletter58.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(newsletterList38);
        org.junit.Assert.assertNotNull(newsletterList40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(newsletterList52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test209");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        java.lang.String str22 = newsletter4.url();
        double double24 = newsletter4.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test210");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("", newsletter25);
        java.lang.String str29 = newsletter25.getUrl();
        java.lang.String str30 = newsletter25.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test211");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("");
        java.lang.String str21 = newsletter4.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter("", "hi!");
        java.util.List<Models.Newsletter> newsletterList27 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("", newsletter25);
        Models.Newsletter newsletter30 = new Models.Newsletter();
        java.lang.String str31 = newsletter30.getName();
        java.lang.String str32 = newsletter30.url();
        java.util.List<Models.Newsletter> newsletterList34 = newsletter30.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList36 = newsletter30.viewAvailableNewsletters("");
        Models.Newsletter newsletter38 = new Models.Newsletter();
        java.lang.String str39 = newsletter38.getName();
        java.lang.String str40 = newsletter38.url();
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.lang.String str43 = newsletter42.getName();
        java.lang.String str44 = newsletter42.url();
        java.lang.String str45 = newsletter42.getUrl();
        newsletter38.cancelSubscription("", newsletter42);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter38.viewAvailableNewsletters("hi!");
        newsletter30.cancelSubscription("", newsletter38);
        java.lang.String str50 = newsletter38.url();
        newsletter25.cancelSubscription("hi!", newsletter38);
        java.util.List<Models.Newsletter> newsletterList53 = newsletter25.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNotNull(newsletterList36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(newsletterList53);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test212");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("hi!");
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList44 = newsletter42.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        newsletter42.cancelSubscription("hi!", newsletter46);
        java.util.List<Models.Newsletter> newsletterList50 = newsletter42.viewAvailableNewsletters("");
        double double52 = newsletter42.getMonthlyCost("");
        newsletter17.cancelSubscription("hi!", newsletter42);
        double double55 = newsletter17.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(newsletterList50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test213");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.lang.Class<?> wildcardClass26 = newsletter20.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test214");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("hi!");
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList44 = newsletter42.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        newsletter42.cancelSubscription("hi!", newsletter46);
        java.util.List<Models.Newsletter> newsletterList50 = newsletter42.viewAvailableNewsletters("");
        double double52 = newsletter42.getMonthlyCost("");
        newsletter17.cancelSubscription("hi!", newsletter42);
        double double55 = newsletter42.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(newsletterList50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test215");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        double double9 = newsletter0.getMonthlyCost("hi!");
        java.lang.String str10 = newsletter0.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        Models.Newsletter newsletter16 = new Models.Newsletter();
        java.lang.String str17 = newsletter16.getName();
        java.lang.String str18 = newsletter16.url();
        java.lang.String str19 = newsletter16.getUrl();
        newsletter12.cancelSubscription("", newsletter16);
        java.util.List<Models.Newsletter> newsletterList22 = newsletter16.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList24 = newsletter16.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList26 = newsletter16.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList28 = newsletter16.viewAvailableNewsletters("");
        java.lang.String str29 = newsletter16.url();
        java.lang.String str30 = newsletter16.getName();
        double double32 = newsletter16.getMonthlyCost("");
        newsletter0.cancelSubscription("", newsletter16);
        java.lang.String str34 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(newsletterList26);
        org.junit.Assert.assertNotNull(newsletterList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test216");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        java.lang.String str10 = newsletter0.getName();
        java.lang.String str11 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter0.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test217");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        newsletter0.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList33 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str34 = newsletter0.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test218");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.lang.String str7 = newsletter0.getName();
        java.lang.String str8 = newsletter0.getUrl();
        java.lang.String str9 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test219");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getName();
        java.lang.String str4 = newsletter0.getUrl();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.url();
        java.lang.String str7 = newsletter0.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test220");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test221");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter0.getName();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        java.lang.String str13 = newsletter11.url();
        java.util.List<Models.Newsletter> newsletterList15 = newsletter11.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter11.viewAvailableNewsletters("");
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.util.List<Models.Newsletter> newsletterList29 = newsletter19.viewAvailableNewsletters("hi!");
        newsletter11.cancelSubscription("", newsletter19);
        double double32 = newsletter19.getMonthlyCost("");
        newsletter0.cancelSubscription("hi!", newsletter19);
        java.lang.String str34 = newsletter19.url();
        java.util.List<Models.Newsletter> newsletterList36 = newsletter19.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(newsletterList36);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test222");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test223");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        Models.Newsletter newsletter20 = new Models.Newsletter();
        java.lang.String str21 = newsletter20.getName();
        java.lang.String str22 = newsletter20.url();
        java.util.List<Models.Newsletter> newsletterList24 = newsletter20.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter20);
        java.util.List<Models.Newsletter> newsletterList27 = newsletter4.viewAvailableNewsletters("");
        double double29 = newsletter4.getMonthlyCost("");
        java.lang.Class<?> wildcardClass30 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList24);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test224");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.getUrl();
        Models.Newsletter newsletter18 = new Models.Newsletter();
        java.lang.String str19 = newsletter18.getName();
        java.lang.String str20 = newsletter18.url();
        Models.Newsletter newsletter22 = new Models.Newsletter();
        java.lang.String str23 = newsletter22.getName();
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.getUrl();
        newsletter18.cancelSubscription("", newsletter22);
        java.util.List<Models.Newsletter> newsletterList28 = newsletter22.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList30 = newsletter22.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList32 = newsletter22.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList34 = newsletter22.viewAvailableNewsletters("");
        newsletter10.cancelSubscription("hi!", newsletter22);
        java.lang.String str36 = newsletter10.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(newsletterList28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNotNull(newsletterList34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test225");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        newsletter12.cancelSubscription("hi!", newsletter19);
        java.lang.Class<?> wildcardClass22 = newsletter12.getClass();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test226");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.getUrl();
        java.lang.String str3 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList5 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str6 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(newsletterList5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test227");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList19 = newsletter12.viewAvailableNewsletters("hi!");
        java.lang.String str20 = newsletter12.url();
        java.lang.String str21 = newsletter12.url();
        java.lang.String str22 = newsletter12.getUrl();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test228");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.url();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.lang.String str8 = newsletter7.getName();
        java.lang.String str9 = newsletter7.url();
        java.lang.String str10 = newsletter7.getName();
        java.lang.String str11 = newsletter7.getUrl();
        java.lang.String str12 = newsletter7.getUrl();
        java.lang.String str13 = newsletter7.url();
        newsletter0.cancelSubscription("hi!", newsletter7);
        java.lang.Class<?> wildcardClass15 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test229");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(newsletterList12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test230");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.getUrl();
        java.lang.String str17 = newsletter10.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test231");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.url();
        java.lang.String str4 = newsletter0.getName();
        java.lang.String str5 = newsletter0.getUrl();
        java.lang.String str6 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList8 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str9 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test232");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.getUrl();
        java.lang.String str3 = newsletter0.getUrl();
        java.lang.String str4 = newsletter0.url();
        java.lang.String str5 = newsletter0.getUrl();
        Models.Newsletter newsletter7 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList9 = newsletter7.viewAvailableNewsletters("");
        double double11 = newsletter7.getMonthlyCost("");
        newsletter0.cancelSubscription("hi!", newsletter7);
        double double14 = newsletter7.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(newsletterList9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test233");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        Models.Newsletter newsletter28 = new Models.Newsletter();
        java.lang.String str29 = newsletter28.getName();
        Models.Newsletter newsletter31 = new Models.Newsletter();
        java.lang.String str32 = newsletter31.getName();
        java.lang.String str33 = newsletter31.url();
        java.lang.String str34 = newsletter31.getUrl();
        newsletter28.cancelSubscription("", newsletter31);
        double double37 = newsletter28.getMonthlyCost("hi!");
        double double39 = newsletter28.getMonthlyCost("hi!");
        newsletter15.cancelSubscription("", newsletter28);
        java.util.List<Models.Newsletter> newsletterList42 = newsletter15.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList42);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test234");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.getName();
        double double20 = newsletter4.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter4.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test235");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.lang.String str3 = newsletter0.getUrl();
        double double5 = newsletter0.getMonthlyCost("");
        double double7 = newsletter0.getMonthlyCost("");
        java.util.List<Models.Newsletter> newsletterList9 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList11 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.Class<?> wildcardClass12 = newsletterList11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList9);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test236");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test237");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        java.lang.String str5 = newsletter0.getName();
        java.lang.String str6 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList8 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str9 = newsletter0.getUrl();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test238");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        java.lang.String str20 = newsletter8.getUrl();
        Models.Newsletter newsletter24 = new Models.Newsletter("hi!", "hi!");
        newsletter8.cancelSubscription("", newsletter24);
        java.lang.Class<?> wildcardClass26 = newsletter8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test239");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        java.lang.String str36 = newsletter33.getUrl();
        newsletter29.cancelSubscription("", newsletter33);
        java.util.List<Models.Newsletter> newsletterList39 = newsletter33.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList41 = newsletter33.viewAvailableNewsletters("");
        newsletter21.cancelSubscription("", newsletter33);
        double double44 = newsletter21.getMonthlyCost("hi!");
        java.lang.String str45 = newsletter21.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(newsletterList39);
        org.junit.Assert.assertNotNull(newsletterList41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test240");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        java.lang.String str18 = newsletter4.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test241");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.lang.String str20 = newsletter17.getUrl();
        java.util.List<Models.Newsletter> newsletterList22 = newsletter17.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter17.url();
        newsletter10.cancelSubscription("hi!", newsletter17);
        java.lang.Class<?> wildcardClass25 = newsletter10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test242");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter6 = new Models.Newsletter();
        java.lang.String str7 = newsletter6.getName();
        java.lang.String str8 = newsletter6.url();
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.lang.String str12 = newsletter10.url();
        java.lang.String str13 = newsletter10.getUrl();
        newsletter6.cancelSubscription("", newsletter10);
        java.util.List<Models.Newsletter> newsletterList16 = newsletter6.viewAvailableNewsletters("hi!");
        java.lang.String str17 = newsletter6.getName();
        java.lang.String str18 = newsletter6.getName();
        newsletter0.cancelSubscription("", newsletter6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test243");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.getName();
        java.lang.String str6 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test244");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        double double6 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        newsletter0.cancelSubscription("hi!", newsletter8);
        java.lang.String str11 = newsletter8.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter8.viewAvailableNewsletters("hi!");
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test245");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter5.viewAvailableNewsletters("hi!");
        java.lang.String str16 = newsletter5.url();
        newsletter0.cancelSubscription("", newsletter5);
        java.lang.Class<?> wildcardClass18 = newsletter5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test246");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.lang.String str5 = newsletter0.url();
        java.lang.String str6 = newsletter0.getUrl();
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter12.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList20 = newsletter12.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList22 = newsletter12.viewAvailableNewsletters("");
        java.lang.String str23 = newsletter12.getUrl();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList31 = newsletter25.viewAvailableNewsletters("");
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.lang.String str34 = newsletter33.getName();
        java.lang.String str35 = newsletter33.url();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        java.lang.String str40 = newsletter37.getUrl();
        newsletter33.cancelSubscription("", newsletter37);
        java.util.List<Models.Newsletter> newsletterList43 = newsletter33.viewAvailableNewsletters("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        newsletter12.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.util.List<Models.Newsletter> newsletterList48 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter50 = new Models.Newsletter();
        java.lang.String str51 = newsletter50.getName();
        java.lang.String str52 = newsletter50.url();
        java.lang.String str53 = newsletter50.getUrl();
        java.lang.String str54 = newsletter50.url();
        java.lang.String str55 = newsletter50.url();
        newsletter0.cancelSubscription("", newsletter50);
        java.lang.Class<?> wildcardClass57 = newsletter0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertNotNull(newsletterList20);
        org.junit.Assert.assertNotNull(newsletterList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(newsletterList43);
        org.junit.Assert.assertNotNull(newsletterList48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test247");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        double double4 = newsletter0.getMonthlyCost("");
        double double6 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        newsletter0.cancelSubscription("hi!", newsletter8);
        java.lang.String str11 = newsletter0.getUrl();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test248");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter5.viewAvailableNewsletters("hi!");
        java.lang.String str16 = newsletter5.url();
        newsletter0.cancelSubscription("", newsletter5);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.util.List<Models.Newsletter> newsletterList23 = newsletter19.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList25 = newsletter19.viewAvailableNewsletters("");
        java.lang.String str26 = newsletter19.url();
        newsletter5.cancelSubscription("hi!", newsletter19);
        double double29 = newsletter19.getMonthlyCost("hi!");
        double double31 = newsletter19.getMonthlyCost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test249");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.String str11 = newsletter4.url();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter4.viewAvailableNewsletters("hi!");
        Models.Newsletter newsletter15 = new Models.Newsletter();
        java.lang.String str16 = newsletter15.getName();
        java.lang.String str17 = newsletter15.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        java.lang.String str22 = newsletter19.getUrl();
        newsletter15.cancelSubscription("", newsletter19);
        java.util.List<Models.Newsletter> newsletterList25 = newsletter15.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("", newsletter15);
        java.lang.String str27 = newsletter15.getUrl();
        java.lang.String str28 = newsletter15.getUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(newsletterList25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test250");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter9.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList21 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str22 = newsletter9.url();
        java.lang.String str23 = newsletter9.getName();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        newsletter9.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        Models.Newsletter newsletter33 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList35 = newsletter33.viewAvailableNewsletters("");
        double double37 = newsletter33.getMonthlyCost("");
        double double39 = newsletter33.getMonthlyCost("");
        double double41 = newsletter33.getMonthlyCost("hi!");
        newsletter25.cancelSubscription("", newsletter33);
        java.lang.Class<?> wildcardClass43 = newsletter25.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test251");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        Models.Newsletter newsletter3 = new Models.Newsletter();
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.url();
        java.lang.String str6 = newsletter3.getUrl();
        newsletter0.cancelSubscription("", newsletter3);
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList11 = newsletter9.viewAvailableNewsletters("");
        Models.Newsletter newsletter13 = new Models.Newsletter();
        java.lang.String str14 = newsletter13.getName();
        newsletter9.cancelSubscription("hi!", newsletter13);
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        Models.Newsletter newsletter21 = new Models.Newsletter();
        java.lang.String str22 = newsletter21.getName();
        java.lang.String str23 = newsletter21.url();
        java.lang.String str24 = newsletter21.getUrl();
        newsletter17.cancelSubscription("", newsletter21);
        newsletter13.cancelSubscription("", newsletter21);
        newsletter0.cancelSubscription("", newsletter21);
        java.lang.String str28 = newsletter0.url();
        double double30 = newsletter0.getMonthlyCost("hi!");
        java.util.List<Models.Newsletter> newsletterList32 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str33 = newsletter0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(newsletterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test252");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList16 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str17 = newsletter4.url();
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        java.lang.String str28 = newsletter19.getName();
        java.util.List<Models.Newsletter> newsletterList30 = newsletter19.viewAvailableNewsletters("");
        newsletter4.cancelSubscription("hi!", newsletter19);
        java.lang.String str32 = newsletter19.getUrl();
        java.lang.String str33 = newsletter19.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNotNull(newsletterList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(newsletterList30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test253");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.util.List<Models.Newsletter> newsletterList3 = newsletter0.viewAvailableNewsletters("hi!");
        java.lang.String str4 = newsletter0.getUrl();
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(newsletterList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(newsletterList6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test254");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("hi!");
        java.lang.String str41 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList43 = newsletter17.viewAvailableNewsletters("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(newsletterList43);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test255");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        double double3 = newsletter0.getMonthlyCost("");
        Models.Newsletter newsletter5 = new Models.Newsletter();
        java.lang.String str6 = newsletter5.getName();
        java.lang.String str7 = newsletter5.url();
        Models.Newsletter newsletter9 = new Models.Newsletter();
        java.lang.String str10 = newsletter9.getName();
        java.lang.String str11 = newsletter9.url();
        java.lang.String str12 = newsletter9.getUrl();
        newsletter5.cancelSubscription("", newsletter9);
        java.util.List<Models.Newsletter> newsletterList15 = newsletter9.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList17 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList19 = newsletter9.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList21 = newsletter9.viewAvailableNewsletters("");
        java.lang.String str22 = newsletter9.url();
        java.lang.String str23 = newsletter9.getName();
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        java.util.List<Models.Newsletter> newsletterList29 = newsletter25.viewAvailableNewsletters("");
        newsletter9.cancelSubscription("", newsletter25);
        newsletter0.cancelSubscription("", newsletter25);
        java.lang.String str32 = newsletter25.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(newsletterList15);
        org.junit.Assert.assertNotNull(newsletterList17);
        org.junit.Assert.assertNotNull(newsletterList19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(newsletterList29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test256");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        java.util.List<Models.Newsletter> newsletterList4 = newsletter0.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList6 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        java.util.List<Models.Newsletter> newsletterList18 = newsletter8.viewAvailableNewsletters("hi!");
        newsletter0.cancelSubscription("", newsletter8);
        double double21 = newsletter8.getMonthlyCost("");
        java.lang.String str22 = newsletter8.getName();
        java.lang.String str23 = newsletter8.url();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(newsletterList4);
        org.junit.Assert.assertNotNull(newsletterList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(newsletterList18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test257");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        Models.Newsletter newsletter10 = new Models.Newsletter();
        java.lang.String str11 = newsletter10.getName();
        java.util.List<Models.Newsletter> newsletterList13 = newsletter10.viewAvailableNewsletters("hi!");
        newsletter4.cancelSubscription("hi!", newsletter10);
        java.lang.String str15 = newsletter10.getName();
        java.lang.String str16 = newsletter10.getUrl();
        java.lang.String str17 = newsletter10.getUrl();
        java.lang.String str18 = newsletter10.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(newsletterList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test258");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList2 = newsletter0.viewAvailableNewsletters("");
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        newsletter0.cancelSubscription("hi!", newsletter4);
        Models.Newsletter newsletter8 = new Models.Newsletter();
        java.lang.String str9 = newsletter8.getName();
        java.lang.String str10 = newsletter8.url();
        Models.Newsletter newsletter12 = new Models.Newsletter();
        java.lang.String str13 = newsletter12.getName();
        java.lang.String str14 = newsletter12.url();
        java.lang.String str15 = newsletter12.getUrl();
        newsletter8.cancelSubscription("", newsletter12);
        newsletter4.cancelSubscription("", newsletter12);
        Models.Newsletter newsletter19 = new Models.Newsletter();
        java.lang.String str20 = newsletter19.getName();
        java.lang.String str21 = newsletter19.url();
        Models.Newsletter newsletter23 = new Models.Newsletter();
        java.lang.String str24 = newsletter23.getName();
        java.lang.String str25 = newsletter23.url();
        java.lang.String str26 = newsletter23.getUrl();
        newsletter19.cancelSubscription("", newsletter23);
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.util.List<Models.Newsletter> newsletterList32 = newsletter29.viewAvailableNewsletters("hi!");
        newsletter23.cancelSubscription("hi!", newsletter29);
        java.lang.String str34 = newsletter29.getName();
        java.lang.String str35 = newsletter29.getUrl();
        Models.Newsletter newsletter37 = new Models.Newsletter();
        java.lang.String str38 = newsletter37.getName();
        java.lang.String str39 = newsletter37.url();
        Models.Newsletter newsletter41 = new Models.Newsletter();
        java.lang.String str42 = newsletter41.getName();
        java.lang.String str43 = newsletter41.url();
        java.lang.String str44 = newsletter41.getUrl();
        newsletter37.cancelSubscription("", newsletter41);
        java.util.List<Models.Newsletter> newsletterList47 = newsletter41.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList49 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList51 = newsletter41.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList53 = newsletter41.viewAvailableNewsletters("");
        newsletter29.cancelSubscription("hi!", newsletter41);
        newsletter4.cancelSubscription("", newsletter29);
        double double57 = newsletter4.getMonthlyCost("hi!");
        java.lang.String str58 = newsletter4.url();
        org.junit.Assert.assertNotNull(newsletterList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(newsletterList32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(newsletterList47);
        org.junit.Assert.assertNotNull(newsletterList49);
        org.junit.Assert.assertNotNull(newsletterList51);
        org.junit.Assert.assertNotNull(newsletterList53);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test259");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        java.lang.String str10 = newsletter4.url();
        java.lang.Class<?> wildcardClass11 = newsletter4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test260");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.lang.String str9 = newsletter4.getUrl();
        Models.Newsletter newsletter11 = new Models.Newsletter();
        java.lang.String str12 = newsletter11.getName();
        Models.Newsletter newsletter14 = new Models.Newsletter();
        java.lang.String str15 = newsletter14.getName();
        java.lang.String str16 = newsletter14.url();
        java.lang.String str17 = newsletter14.getUrl();
        newsletter11.cancelSubscription("", newsletter14);
        java.lang.String str19 = newsletter14.url();
        java.lang.String str20 = newsletter14.getName();
        Models.Newsletter newsletter22 = new Models.Newsletter();
        java.lang.String str23 = newsletter22.getName();
        java.lang.String str24 = newsletter22.url();
        java.lang.String str25 = newsletter22.url();
        java.util.List<Models.Newsletter> newsletterList27 = newsletter22.viewAvailableNewsletters("hi!");
        java.lang.String str28 = newsletter22.url();
        newsletter14.cancelSubscription("hi!", newsletter22);
        newsletter4.cancelSubscription("hi!", newsletter22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(newsletterList27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Newslettertestcases0.test261");
        Models.Newsletter newsletter0 = new Models.Newsletter();
        java.lang.String str1 = newsletter0.getName();
        java.lang.String str2 = newsletter0.url();
        Models.Newsletter newsletter4 = new Models.Newsletter();
        java.lang.String str5 = newsletter4.getName();
        java.lang.String str6 = newsletter4.url();
        java.lang.String str7 = newsletter4.getUrl();
        newsletter0.cancelSubscription("", newsletter4);
        java.util.List<Models.Newsletter> newsletterList10 = newsletter4.viewAvailableNewsletters("hi!");
        java.util.List<Models.Newsletter> newsletterList12 = newsletter4.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList14 = newsletter4.viewAvailableNewsletters("");
        java.lang.String str15 = newsletter4.getUrl();
        Models.Newsletter newsletter17 = new Models.Newsletter();
        java.lang.String str18 = newsletter17.getName();
        java.lang.String str19 = newsletter17.url();
        java.util.List<Models.Newsletter> newsletterList21 = newsletter17.viewAvailableNewsletters("");
        java.util.List<Models.Newsletter> newsletterList23 = newsletter17.viewAvailableNewsletters("");
        Models.Newsletter newsletter25 = new Models.Newsletter();
        java.lang.String str26 = newsletter25.getName();
        java.lang.String str27 = newsletter25.url();
        Models.Newsletter newsletter29 = new Models.Newsletter();
        java.lang.String str30 = newsletter29.getName();
        java.lang.String str31 = newsletter29.url();
        java.lang.String str32 = newsletter29.getUrl();
        newsletter25.cancelSubscription("", newsletter29);
        java.util.List<Models.Newsletter> newsletterList35 = newsletter25.viewAvailableNewsletters("hi!");
        newsletter17.cancelSubscription("", newsletter25);
        newsletter4.cancelSubscription("", newsletter17);
        java.lang.String str38 = newsletter17.url();
        double double40 = newsletter17.getMonthlyCost("hi!");
        Models.Newsletter newsletter42 = new Models.Newsletter();
        java.util.List<Models.Newsletter> newsletterList44 = newsletter42.viewAvailableNewsletters("");
        Models.Newsletter newsletter46 = new Models.Newsletter();
        java.lang.String str47 = newsletter46.getName();
        newsletter42.cancelSubscription("hi!", newsletter46);
        java.util.List<Models.Newsletter> newsletterList50 = newsletter42.viewAvailableNewsletters("");
        double double52 = newsletter42.getMonthlyCost("");
        newsletter17.cancelSubscription("hi!", newsletter42);
        java.lang.String str54 = newsletter17.url();
        double double56 = newsletter17.getMonthlyCost("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(newsletterList10);
        org.junit.Assert.assertNotNull(newsletterList12);
        org.junit.Assert.assertNotNull(newsletterList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(newsletterList21);
        org.junit.Assert.assertNotNull(newsletterList23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(newsletterList35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(newsletterList44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(newsletterList50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
    }
}

