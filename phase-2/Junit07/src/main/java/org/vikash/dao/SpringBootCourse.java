package org.vikash.dao;

public class SpringBootCourse implements Course {
    @Override
    public boolean coursePurchased() {
        System.out.println("SpringBoot Course Purchased");
        return true;
    }
}
