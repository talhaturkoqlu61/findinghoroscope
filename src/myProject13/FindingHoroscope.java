package myProject13;
import java.util.Scanner;

public class FindingHoroscope {
	public static void main(String[]args) {
		int day,month;
		Scanner inp=new Scanner(System.in);
		System.out.print("Please enter which month you were born:");
		month=inp.nextInt();
		System.out.print("Please enter day you were born:");
		day=inp.nextInt();
		switch(month) {
		case 1:if(day>=1&&day<=31) {
			if(day<22) {
				System.out.println("Carpicorn");
			}
			else {
				System.out.println("Aquarius");
			}
			
			
		}
		break;
		case 2:if(day>=1&&day<=28) {
			if(day<20) {
				System.out.println("Aquarius");
			}
			else {
				System.out.println("Pisces");
			}
		}
		break;
		case 3:if(day>=1&&day<=31) {
			if(day<21) {
				System.out.println("Pisces");
				
			}
			else {
				System.out.println("Aries");
			}
		}
		break;
		case 4:if(day>=1&&day<=30) {
			if(day<21) {
				System.out.println("Aries");
				
			}
			else {
				System.out.println("Taurus");
			}
			
		}
		break;
		case 5:if(day>=1&&day<=31) {
			if(day<22) {
				System.out.println("Taurus");
				
			}
			else {
				System.out.println("Gemini");
				
			}
		}
		break;
		case 6:if(day>=1&&day<=30) {
			if(day<23) {
				System.out.println("Gemini");
				
			}
			else {
				System.out.println("Cancer");
				
			}
		}
		break;
		case 7:if(day>=1&&day<=31) {
			if(day<24) {
				System.out.println("Cancer");
				
			}
			else {
				System.out.println("Leo");
				
			}
		}
		break;
		case 8:if(day>=1&&day<=31) {
			if(day<23) {
				System.out.println("Leo");
				
			}
			else {
				System.out.println("Virgo");
				
			}
		}
		break;
		case 9:if(day>=1&&day<=30) {
			if(day<23) {
				System.out.println("Virgo");
				
			}
			else {
				System.out.println("Scales");
			}
		}
		break;
		case 10:if(day>=1&&day<=31) {
			if(day<23) {
				System.out.println("Scales");
				
			}
			else {
				System.out.println("Scorpio");
			}
		}
		break;
		case 11:if(day>=1&&day<=30) {
			if(day<22) {
				System.out.println("Scorpio");
				
			}
			else {
				System.out.println("Archer");
				
			}
		}
		break;
		case 12:if(day>=1&&day<=31) {
			if(day<22) {
				System.out.println("Archer");
				
			}
			else {
				System.out.println("Capricorn");
			}
		}
		
		
		}
	}

}
