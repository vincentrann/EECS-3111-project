package randooptestcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PhysicalItemFactorytestcases {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("hi!", "", (int) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("", "", (int) '4', "hi!", false);
        java.lang.Class<?> wildcardClass6 = physicalItem5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("hi!", "hi!", (int) (byte) -1, "", false);
        java.lang.Class<?> wildcardClass6 = physicalItem5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("", "hi!", (int) (short) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("hi!", "hi!", 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        FlyweightPattern.PhysicalItemFactory physicalItemFactory0 = new FlyweightPattern.PhysicalItemFactory();
        java.lang.Class<?> wildcardClass1 = physicalItemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        Models.PhysicalItem physicalItem5 = FlyweightPattern.PhysicalItemFactory.getPhysicalItem("", "hi!", (int) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem5);
    }
}

