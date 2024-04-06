package randooptestcases;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyMembertestcases {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test002");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test003");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass11 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test004");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass16 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test005");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass8 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test006");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test007");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client8 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test008");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test009");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass13 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test010");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test011");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass7 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test012");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test013");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client6 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test014");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test015");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass14 = client13.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test016");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test017");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = client14.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test018");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client9 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test019");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass14 = client13.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test020");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test021");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        Models.Client client4 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test022");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test023");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client11 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test024");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test025");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test026");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client8 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass9 = client8.getClass();
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test027");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass8 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test028");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test029");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test030");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test031");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test032");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test033");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test034");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test035");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test036");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test037");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test038");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test039");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client9 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass10 = client9.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test040");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test041");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test042");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass16 = client15.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test043");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test044");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test045");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test046");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass14 = client13.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test047");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test048");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test049");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test050");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test051");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test052");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test053");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "hi!");
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass6 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test054");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass7 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test055");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test056");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test057");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client12 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass13 = client12.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test058");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        Models.Client client5 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test059");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test060");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test061");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test062");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test063");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        Models.Client client16 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass17 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test064");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass19 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test065");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass8 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test066");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test067");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test068");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test069");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass13 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test070");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass16 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test071");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass11 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test072");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client18 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test073");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass13 = client12.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test074");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test075");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test076");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        Models.Client client17 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(client17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test077");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test078");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test079");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test080");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test081");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        facultyMember3.addCourse("");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test082");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test083");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test084");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test085");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test086");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test087");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test088");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test089");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test090");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test091");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test092");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test093");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass16 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test094");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass16 = client15.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test095");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test096");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test097");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test098");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client13 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test099");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test100");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test101");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        Models.Client client17 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(client17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test102");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test103");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client8 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass9 = client8.getClass();
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test104");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test105");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test106");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        Models.Client client10 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test107");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test108");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test109");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test110");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test111");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test112");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client18 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass19 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test113");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass21 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test114");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test115");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test116");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test117");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test118");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test119");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test120");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test121");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test122");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test123");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test124");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client21 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(client21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test125");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client13 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass14 = client13.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test126");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        facultyMember3.addCourse("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test127");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test128");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass7 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test129");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test130");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test131");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test132");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test133");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test134");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test135");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test136");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test137");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test138");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test139");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test140");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test141");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test142");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass7 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test143");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        Models.Client client15 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test144");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test145");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test146");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass8 = client7.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test147");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test148");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test149");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test150");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test151");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        Models.Client client10 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test152");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test153");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test154");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        Models.Client client14 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test155");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test156");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test157");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test158");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test159");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        java.lang.Class<?> wildcardClass19 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test160");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.addCourse("hi!");
        Models.Client client6 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test161");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test162");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        Models.Client client17 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(client17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test163");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "");
        Models.Client client4 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test164");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass17 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test165");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test166");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test167");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test168");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test169");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test170");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test171");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test172");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass12 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test173");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test174");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test175");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test176");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test177");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass20 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test178");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test179");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test180");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test181");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        java.lang.Class<?> wildcardClass18 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test182");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test183");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass10 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test184");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test185");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test186");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.addTextbook("");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test187");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test188");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client13 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test189");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        java.lang.Class<?> wildcardClass14 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test190");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client18 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test191");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test192");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test193");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client18 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test194");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client20 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test195");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test196");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        Models.Client client17 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(client17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test197");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test198");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        Models.Client client17 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client17);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test199");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test200");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test201");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test202");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test203");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client15 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test204");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test205");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test206");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addCourse("");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test207");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass13 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test208");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        Models.Client client10 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test209");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test210");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass11 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test211");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test212");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client9 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test213");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test214");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        Models.Client client16 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test215");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        Models.Client client16 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass17 = client16.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test216");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test217");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test218");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = client14.getClass();
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test219");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test220");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test221");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client11 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test222");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test223");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test224");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test225");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test226");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        Models.Client client15 = facultyMember3.getClient();
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client19 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass20 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertNotNull(client19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test227");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        Models.Client client14 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test228");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        Models.Client client16 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test229");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test230");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client18 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass19 = client18.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test231");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test232");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test233");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test234");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test235");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test236");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test237");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test238");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client18 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(client18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test239");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test240");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test241");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test242");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test243");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test244");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test245");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test246");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass16 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test247");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test248");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        Models.Client client9 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test249");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test250");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        Models.Client client10 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass11 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test251");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test252");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass5 = client4.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test253");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test254");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "hi!", "");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test255");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client14 = facultyMember3.getClient();
        java.lang.Class<?> wildcardClass15 = client14.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test256");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        Models.Client client11 = facultyMember3.getClient();
        Models.Client client12 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test257");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test258");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client20 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(client20);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test259");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test260");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        Models.Client client13 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        java.lang.Class<?> wildcardClass20 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test261");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client7 = facultyMember3.getClient();
        Models.Client client8 = facultyMember3.getClient();
        Models.Client client9 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("");
        Models.Client client16 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test262");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        java.lang.Class<?> wildcardClass9 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test263");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test264");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test265");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("hi!", "", "");
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
        Models.Client client12 = facultyMember3.getClient();
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test266");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test267");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client15 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test268");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        Models.Client client16 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test269");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        Models.Client client7 = facultyMember3.getClient();
        facultyMember3.remvoeCourse("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test270");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        Models.Client client4 = facultyMember3.getClient();
        facultyMember3.addTextbook("");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("");
        facultyMember3.remvoeCourse("hi!");
        java.lang.Class<?> wildcardClass13 = facultyMember3.getClass();
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test271");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addTextbook("");
        facultyMember3.remvoeCourse("hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test272");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        facultyMember3.addTextbook("");
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.addCourse("hi!");
        facultyMember3.remvoeCourse("");
        facultyMember3.remvoeCourse("hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FacultyMembertInfortestcases0.test273");
        Models.FacultyMember facultyMember3 = new Models.FacultyMember("", "", "hi!");
        facultyMember3.addTextbook("hi!");
        Models.Client client6 = facultyMember3.getClient();
        facultyMember3.addCourse("hi!");
        facultyMember3.addCourse("hi!");
        Models.Client client11 = facultyMember3.getClient();
        facultyMember3.addTextbook("hi!");
        Models.Client client14 = facultyMember3.getClient();
        facultyMember3.addCourse("");
        org.junit.Assert.assertNotNull(client6);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertNotNull(client14);
    }
}

