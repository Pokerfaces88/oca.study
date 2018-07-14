package oca.study.chapter1;
//import java.text.SimpleDateFormat;
import java.util.*;

public class Pepsi implements checkable{

	Date dateNow = new Date();
	Date leaveWork = new Date();
	Scanner scanner = new Scanner(System.in);
	
//	SimpleDateFormat formatTime = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss");
//	System.out.println("Current Time: " + formatTime.format(this.dateNow));

	public static void main(String[] args) {

		Pepsi rowan = new Pepsi();
		rowan.leaveWorkTime();
		rowan.check();

	}
	
	
	public Date leaveWorkTime() {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY,15);
		cal.set(Calendar.MINUTE,45);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);

		Date leaveWork = cal.getTime();
		return leaveWork;
	}
	
	public void visitShop() {
		
		Random checkPepsi = new Random();
		boolean maybePepsi = checkPepsi.nextBoolean();
		
		if(maybePepsi = true) {
			System.out.println("Buy all the Pepsi!");
		}
		else if(maybePepsi = false){
			System.out.println("God damn it");
			nextShop();
		}
	}
	
	public void nextShop() {
		visitShop();
	}

	public void pingRowan() {

		System.out.println("Do we have Pepsi?");
		
		try {
			String s = scanner.next();
			if (s == "n") {
				visitShop();
			}
			else if(s == "y"){
				System.out.println("Cool, be home in an hour so");
			}
		} catch (Exception e) {
			
		}
	}

	public void check() {
		if (this.dateNow == this.leaveWork) {
			this.pingRowan();
		}
		else {
			System.out.println("It's. Not. Time. Yet!");
		}
		
		do {
			this.pingRowan();
			this.visitShop();
			break;
		} while (leaveWork != this.dateNow);
	}

}

abstract interface checkable{
	public abstract void check();
}
