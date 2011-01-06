package com.palladium.paf.utils.model;


public class ElapsedPeriod {

		private String week;

		private String year;


		public String getWeek() {
			return week;
		}

		public void setWeek(String week) {
			this.week = week;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String toString() {
			return "Week: " + week + "; Year: " + year;
		}

}