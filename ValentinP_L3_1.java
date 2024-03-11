import java.util.Scanner;

public class ValentinP_L3_1 {

//Write a Java application that reads an int value. If the int value is between 1-12, the corresponding string month
//will be displayed. If the value entered is a string and if it corresponds to a month of the year, display the numeric
//value of the month.

	private static Scanner x;

	public static void main(String[] args) {

		x = new Scanner(System.in);
		String month;
		System.out.println("Input name or number of the month: ");

		boolean nr = false;
		int month_no = 0;
		while (month_no == 0 && !nr) {
			month = x.next();

			if (month.charAt(0) > '0' && month.charAt(0) < '9')
				nr = true;

			if (nr) {
				switch (month) {
				case "1":

					System.out.println("Jan");
					break;
				case "2":
					System.out.println("Feb");
					break;
				case "3":
					System.out.println("Mar");
					break;
				case "4":
					System.out.println("Apr");
					break;
				case "5":
					System.out.println("May");
					break;
				case "6":
					System.out.println("Jun");
					break;
				case "7":
					System.out.println("Jul");
					break;
				case "8":
					System.out.println("Aug");
					break;
				case "9":
					System.out.println("Sep");
					break;
				case "10":
					System.out.println("Oct");
					break;
				case "11":
					System.out.println("Nov");
					break;
				case "12":
					System.out.println("Dec");
					break;
				default:
					System.out.println("Incorrect number!");
					break;
				}

			} else {

				month = month.toLowerCase();

				switch (month) {
				case "january":
					month_no = 1;
					break;
				case "february":
					month_no = 2;
					break;
				case "march":
					month_no = 3;
					break;
				case "april":
					month_no = 4;
					break;
				case "may":
					month_no = 5;
					break;
				case "june":
					month_no = 6;
					break;
				case "july":
					month_no = 7;
					break;
				case "august":
					month_no = 8;
					break;
				case "september":
					month_no = 9;
					break;
				case "october":
					month_no = 10;
					break;
				case "november":
					month_no = 11;
					break;
				case "december":
					month_no = 12;
					break;
				default:
					month_no = 0;
				}

				if (month_no != 0)
					System.out.println("Month " + month_no);
				else
					System.out.println("Wrong input! Please try again");
			}
		}
	}
}
