/*
Calculate the age of a person in years

Write a Java 8 program to calculate the age of a person in years given their birthday. */


import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1997, 07, 25);

        LocalDate now = LocalDate.now();

        Period age = Period.between(birthday, now);

        System.out.println("Age : " + age.getYears() + " Years " + age.getMonths() + " Months " +
                age.getDays() + " day");

    }
}
