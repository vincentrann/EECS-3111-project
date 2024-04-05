package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewsletterFactorytestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        FlyweightPattern.NewsletterFactory newsletterFactory0 = new FlyweightPattern.NewsletterFactory();
        java.lang.Class<?> wildcardClass1 = newsletterFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Models.Newsletter newsletter2 = FlyweightPattern.NewsletterFactory.getNewsletter("", "");
        java.lang.Class<?> wildcardClass3 = newsletter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Models.Newsletter newsletter2 = FlyweightPattern.NewsletterFactory.getNewsletter("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletter2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Models.Newsletter newsletter2 = FlyweightPattern.NewsletterFactory.getNewsletter("", "hi!");
        java.lang.Class<?> wildcardClass3 = newsletter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Models.Newsletter newsletter2 = FlyweightPattern.NewsletterFactory.getNewsletter("hi!", "");
        java.lang.Class<?> wildcardClass3 = newsletter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

