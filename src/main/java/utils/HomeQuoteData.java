package utils;

public class HomeQuoteData {

	private String expectedTitle;
	private String landingPageTitle;
	private String locationPageTitle;
	private String zipcode;
	private String informationPageTitle;
	private String firstname;
	private String middle;
	private String lastname;
	private String address;
	private String apt;
	private String city;
	private String dateofbirth;

	public HomeQuoteData(String expectedTitle, String landingPageTitle, String locationPageTitleString,
			String informationPageTitle, String firstname, String middle, String lastname, String address, String apt,
			String city, String dateofbirth) {
	 if	 (expectedTitle == null ||landingPageTitle == null || locationPageTitle ==
		 null || zipcode.length() == 0 || informationPageTitle == null || firstname == null
		 || middle == null || lastname ==null || address.length() == 0 || apt.length() == 0 ||
		 city == null || dateofbirth.length() == 0) {
		 throw new NullPointerException();
	 } else 
			
		 {
			this.expectedTitle = expectedTitle;
			this.landingPageTitle = landingPageTitle;
			this.locationPageTitle = landingPageTitle;
			this.informationPageTitle = informationPageTitle;
			this.firstname = firstname;
			this.middle = middle;
			this.lastname = lastname;
			this.address = address;
			this.apt = apt;
			this.city = city;
			this.dateofbirth = dateofbirth;

		

		}
	}

	public String getExpectedTitle() {
		return expectedTitle;
	}

	public String getLandingPageTitle() {
		return landingPageTitle;
	}

	public String getLocationPageTitle() {
		return locationPageTitle;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getInformationPageTitle() {
		return informationPageTitle;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getMiddle() {
		return middle;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getApt() {
		return apt;
	}

	public String getCity() {
		return city;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

}
