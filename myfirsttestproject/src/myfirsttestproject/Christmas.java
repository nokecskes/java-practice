package myfirsttestproject;

import java.time.LocalDate;
import java.time.Month;

public class Christmas {
	
	public static void main(String[] args) {
		System.out.println(isChristmasClose());
	}
	
	private static String isChristmasClose() {
		int todayInYear = LocalDate.now().getDayOfYear();
		LocalDate christmas = LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 24);
		int christmasInThisYear = christmas.getDayOfYear();
		int diff = christmasInThisYear - todayInYear;
		
		System.out.println(diff);
		
		if (diff < 100) {
			return "Christmas is in " + diff + " days!";
		}
		return "Christmas is not around. :(";
	}

}
