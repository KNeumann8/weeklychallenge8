package lab1;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Course AdJava = new AdvancedJavaCourse("AdvancedJava","230");
        Course IntJava = new IntroJavaCourse("IntroJava","229");
        Course IntProgram = new IntroToProgrammingCourse("IntroProgramming","228");

        List<Course> Courses = new ArrayList();
        Courses.add(AdJava);
        Courses.add(IntJava);
        Courses.add(IntProgram);

        for (Course c : Courses){
            System.out.println(c.getCourseName());
        }

        AdJava.setCredits(3.8);

        System.out.println(AdJava.getCredits());

        /*
        I like how using an abstract superclass can allow you to have each subclass inherit the same hard-written
        methods while also allowing you to choose to either override them or make them abstract. I don't yet know
        what is bad about this method, but I heard it can be bad if someone overrides a method that needs to behave
        a certain way, and that without having direct access to viewing the super class it is hard to know what methods
        you are inheriting.
         */

        //AdJava.setPrerequisites();

        /*
        Creating the different courses as their super class rather than their own subclass allows me to loop through
        them as I did above, and treat them all as similar objects. However, this makes me unable to access the things
        that makes them different from the other subclasses. I cannot use the setPrerequisites method because this is
        not a method shared with the Course class.
         */

        //I am wondering if my approach towards the setCredits method is correct btw, using a super class's method
        // within the method that overrides it to set a variable in the superclass. Seems roundabout...




        AdvancedJavaCourse AdJavaB = new AdvancedJavaCourse("Advanced Java","3");
        IntroJavaCourse IntJavaB = new IntroJavaCourse("Intro Java","2");
        IntroToProgrammingCourse IntProgramB = new IntroToProgrammingCourse("Intro Programming","1");

        Courses.add(AdJavaB);
        Courses.add(IntJavaB);
        Courses.add(IntProgramB);

        for (Course c : Courses){
            System.out.println(c.getCourseName());
        }



    }

}
