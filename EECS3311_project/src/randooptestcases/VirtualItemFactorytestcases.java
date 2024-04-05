package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VirtualItemFactorytestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Models.VirtualItem virtualItem3 = FlyweightPattern.VirtualItemFactory.getVirtualBook("", "hi!", true);
        java.lang.Class<?> wildcardClass4 = virtualItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(virtualItem3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Models.VirtualItem virtualItem3 = FlyweightPattern.VirtualItemFactory.getVirtualBook("hi!", "", true);
        java.lang.Class<?> wildcardClass4 = virtualItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(virtualItem3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        FlyweightPattern.VirtualItemFactory virtualItemFactory0 = new FlyweightPattern.VirtualItemFactory();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Models.VirtualItem virtualItem3 = FlyweightPattern.VirtualItemFactory.getVirtualBook("hi!", "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(virtualItem3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        Models.VirtualItem virtualItem3 = FlyweightPattern.VirtualItemFactory.getVirtualBook("hi!", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(virtualItem3);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Models.VirtualItem virtualItem3 = FlyweightPattern.VirtualItemFactory.getVirtualBook("hi!", "hi!", false);
        java.lang.Class<?> wildcardClass4 = virtualItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(virtualItem3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

