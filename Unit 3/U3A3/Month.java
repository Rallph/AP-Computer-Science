// Ralph Nahra
//
// This is the month class for U3A3

public class Month {

	private int month;
	private String days;

	public Month(int m) {

		month = m;
		setDays();
	}

	public void setDays() {

		switch(month) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30";
				break;
			case 2:
				days = "28 or 29";
				break;
		}
	}

	public String getDays() {

		return days;
	}
}