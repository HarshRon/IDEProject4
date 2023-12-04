// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import  java.util.*;
public class Main implements SchoolDistrict{
    public static void main(String[] args) {
        System.out.println(SchoolDistrict.districtName);
        System.out.println("Superintendent: " + SchoolDistrict.superName);
        System.out.println("Phone Number: " +SchoolDistrict.phoneNum);
        System.out.println("**********");
        HighSchool Horseheads = new HighSchool();
        Horseheads.setName("Horseheads High School");
        Horseheads.setEnrollment(350);
        System.out.println(Horseheads.getName());
        Horseheads.describeLevel();
        System.out.println("There are " + Horseheads.getEnrollment() + " Students at this school");
        System.out.println("**********");
        MiddleSchool HorseheadsMid = new MiddleSchool();
        HorseheadsMid.setName("Horseheads Middle School");
        HorseheadsMid.setEnrollment(350);
        System.out.println(HorseheadsMid.getName());
        HorseheadsMid.describeLevel();
        System.out.println("There are " + HorseheadsMid.getEnrollment() + " Students at this school");
        System.out.println("**********");
        ElementarySchool BigFlats = new ElementarySchool();
        BigFlats.setName("Big Flats Elementary");
        BigFlats.setEnrollment(100);
        System.out.println(BigFlats.getName());
        BigFlats.describeLevel();
        System.out.println("There are " + BigFlats.getEnrollment() + " Students at this school");
        System.out.println("**********");
        ElementarySchool Gardner = new ElementarySchool();
        Gardner.setName("Gardner Road Elementary");
        Gardner.setEnrollment(90);
        System.out.println(Gardner.getName());
        Gardner.describeLevel();
        System.out.println("There are " + Gardner.getEnrollment() + " Students at this school");
        System.out.println("**********");
        ElementarySchool Center = new ElementarySchool();
        Center.setName("Center Street Elementary");
        Center.setEnrollment(95);
        System.out.println(Center.getName());
        Center.describeLevel();
        System.out.println("There are " + Center.getEnrollment() + " Students at this school");
        System.out.println("**********");
        ElementarySchool Ridge = new ElementarySchool();
        Ridge.setName("Ridge Road Elementary");
        Ridge.setEnrollment(70);
        System.out.println(Ridge.getName());
        Ridge.describeLevel();
        System.out.println("There are " + Ridge.getEnrollment() + " Students at this school");
        System.out.println("**********");


    }
}