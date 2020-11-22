package lesson7;

import lesson7.testing.AfterSuite;
import lesson7.testing.BeforeSuite;
import lesson7.testing.Test;

public class Testing {

    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("Тест метод приоритет 5");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Тест метод приоритет 1");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("Тест метод приоритет 10");
    }

    @Test(priority = 7)
    public void testMethod4() {
        System.out.println("Тест метод приоритет 7");
    }

    @Test
    public void testMethod5() {
        System.out.println("Тест метод приоритет 5");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuite метод");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite метод");
    }
}
