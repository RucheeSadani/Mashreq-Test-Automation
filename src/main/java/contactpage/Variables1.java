package contactpage;

import java.util.ArrayList;
import java.util.List;

public class Variables1 {
	
	public static final List<String> navi =setList();
	public static final List<String> vari =setList1();
	public static final List<String> subprod =setList3();
	
	public static ArrayList<String> setList(){
		ArrayList<String> navi = new ArrayList<>();
		navi.add("Corporate");
		navi.add("Business");
		navi.add("International");
		navi.add("Private Banking");
		navi.add("Al Islami");
		navi.add("Gold");
		navi.add("Mashreq Securities");
		navi.add("Mashreq Capital");
		navi.add("Mashreq Global Services");
		
		return navi;
		
	}
	
	public static List<String> setList1(){
		List<String> vari = new ArrayList<>();
		vari.add("I am looking to...");
		vari.add("Register a complaint");
		vari.add("Enquire about a product");
		vari.add("Raise a service request");
		vari.add("Apply for a new product");
		return vari;
	}
	
	public static ArrayList<String> setList3(){
		ArrayList<String> subprod = new ArrayList<>();
		subprod.add("Auto Loan");
		subprod.add("Home Loan Non-UAE Resident");
		subprod.add("Home Loan UAE Resident");
		subprod.add("Personal Loan For Emiratis");
		subprod.add("Personal Loan for Expats");
		subprod.add("Commercial Mortgage Loans UAE Residents");
		
		return subprod;
		
	}
}
