package org.vikash.dao;

public class JavaCourse implements Course {
    @Override
    public boolean coursePurchased() {
        System.out.println("Java course Purchased");
        return true;
    }
}
