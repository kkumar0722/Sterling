package commonLibrary;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenericUtilities {
			
	public static String formatdate(String inputdate, String formatteddate){
	
	String formatdate;
	String months[]= {"01", "02", "03", "04","05", "06", "07", "08","09", "10", "11", "12"};
	GregorianCalendar gcalendar = new GregorianCalendar();
	String month = months[gcalendar.get(Calendar.MONTH)];
	int date = gcalendar.get(Calendar.DATE);
	int year = gcalendar.get(Calendar.YEAR);
	int hour = gcalendar.get(Calendar.HOUR);
	int minute = gcalendar.get(Calendar.MINUTE);
	int second = gcalendar.get(Calendar.SECOND);
	//System.out.println(month+date+year+hour+minute+second);
			
			switch(inputdate){
			
				case "mm/dd/yyyy":
					formatteddate = month+"/"+date+"/"+year;
					System.out.println("Date : "+formatteddate);					
					break;
					
				case "dd/mm/yyyy":
					formatteddate = date+"/"+month+"/"+year;
					System.out.println("Date : "+formatteddate);
					break;	
					
				case "mmddyyyyhhmmss":
					formatteddate = date+month+year+hour+minute+second;
					System.out.println("Date : "+formatteddate);
					break;
			}
			formatdate = formatteddate;
			return formatdate;
			
	}
	
	public static String AppendDateTime(){
		
		String AppendDateTime;
		String months[]= {"01", "02", "03", "04","05", "06", "07", "08","09", "10", "11", "12"};
		GregorianCalendar gcalendar = new GregorianCalendar();
		String month = months[gcalendar.get(Calendar.MONTH)];
		int date = gcalendar.get(Calendar.DATE);
		int year = gcalendar.get(Calendar.YEAR);
		int hour = gcalendar.get(Calendar.HOUR);
		int minute = gcalendar.get(Calendar.MINUTE);
		int second = gcalendar.get(Calendar.SECOND);
								
		String datetime = date+month+year+hour+minute+second;		

		AppendDateTime = datetime;
		return AppendDateTime;				
		}
	
	//This method generates a random string of given length
	public static String RandomString(int xlength){
		
		String Chars = "abcdefghijklmnopqrstuvwxyz"; 
		String randomstring = "";
		for (int i=0; i<xlength; i++) { 
			int rnum = (int) Math.floor(Math.random()*Chars.length()); 
			randomstring += Chars.substring(rnum,rnum+1); 
			}
		return randomstring;
		}

}
