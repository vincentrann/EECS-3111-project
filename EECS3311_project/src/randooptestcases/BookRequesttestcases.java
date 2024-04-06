package randooptestcases;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRequesttestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test1");
        Models.BookRequest bookRequest3 = new Models.BookRequest("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test3");
        Models.BookRequest bookRequest3 = new Models.BookRequest("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test4");
        Models.BookRequest bookRequest3 = new Models.BookRequest("", "", "");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test5");
        Models.BookRequest bookRequest3 = new Models.BookRequest("", "hi!", "");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test6");
        Models.BookRequest bookRequest3 = new Models.BookRequest("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test7");
        Models.BookRequest bookRequest3 = new Models.BookRequest("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test8");
        Models.BookRequest bookRequest3 = new Models.BookRequest("", "", "hi!");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRequesttestcases0.test9");
        Models.BookRequest bookRequest3 = new Models.BookRequest("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

