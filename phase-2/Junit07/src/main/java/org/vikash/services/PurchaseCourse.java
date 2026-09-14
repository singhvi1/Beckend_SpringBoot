package org.vikash.services;

import org.vikash.dao.Course;

public class PurchaseCourse {
    private Course course;

    public boolean proceedWithCourse(Course course) {
        return course.coursePurchased();
    }
}
