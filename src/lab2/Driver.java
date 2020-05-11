package lab2;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        AdvancedJavaCourse AdJava = new AdvancedJavaCourse("Advanced Java","3");
        IntroJavaCourse IntJava = new IntroJavaCourse("Intro Java","2");
        IntroToProgrammingCourse IntProgram = new IntroToProgrammingCourse("Intro Programming","1");

        List<Course> Courses = new ArrayList();
        Courses.add(AdJava);
        Courses.add(IntJava);
        Courses.add(IntProgram);

        for (Course c : Courses){
            System.out.println(c.getCourseName());
        }

        /*
        I like that we can still use a list to cycle through a group of "Courses" even though they are not the same kind of object
        but only share an interface. And because we have to declare each course as its own type we don't lose the extra functions
        that may be associated with the subclasses. However, now we need to replicate code in each class.


         */


    }

}
