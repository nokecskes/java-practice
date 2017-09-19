package myfirsttestproject;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Timepractice {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2017, Month.SEPTEMBER, 13);
		System.out.println(today);
		
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());
	}

}
