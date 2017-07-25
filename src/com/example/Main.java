package com.example;

import com.example.common.Month;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(java.util.Arrays.asList(Month.values()));
        System.out.println("Pick a month from above:");
        String selectedMonth = input.nextLine().toUpperCase();

        ArrayList<String> monthList = new ArrayList<>();

        try {
            Month.valueOf(selectedMonth);
        } catch (Exception ex) {
            throw new Exception("That is not a valid month");
        }

        switch (Month.valueOf(selectedMonth)) {
            case JANUARY:
                monthList.add(Month.JANUARY.getEnglishName());
            case FEBRUARY:
                monthList.add(Month.FEBRUARY.getEnglishName());
            case MARCH:
                monthList.add(Month.MARCH.getEnglishName());
            case APRIL:
                monthList.add(Month.APRIL.getEnglishName());
            case MAY:
                monthList.add(Month.MAY.getEnglishName());
            case JUNE:
                monthList.add(Month.JUNE.getEnglishName());
            case JULY:
                monthList.add(Month.JULY.getEnglishName());
            case AUGUST:
                monthList.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                monthList.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                monthList.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                monthList.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                monthList.add(Month.DECEMBER.getEnglishName());
                break;
            default:
                throw new Exception("Month does not exist");
        }
        System.out.println(monthList);
    }
}
