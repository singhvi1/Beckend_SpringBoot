package org.vikash.dao;

public class JunitCourse implements Course {
    @Override
    public boolean coursePurchased() {
        System.out.println("JunitCourse Purchased");
        return true;
    }
}
