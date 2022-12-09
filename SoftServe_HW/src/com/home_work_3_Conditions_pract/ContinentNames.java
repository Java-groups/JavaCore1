package com.home_work_3_Conditions_pract;
import java.util.*;

public enum ContinentNames 
{
			AFRICA
			("Algeria",
			"Angola",
			"Benin",
			"Botswana",
			"Burkina Faso",
			"Burundi",
			"Cameroon",
			"Cape Verde",
			"Central African Republic",
			"Chad",
			"Comoros",
			"Republic of the Congo",
			"Democratic Republic of the Congo",
			"Cote d'Ivoire",
			"Djibouti",
			"Equatorial Guinea",
			"Egypt",
			"Eritrea",
			"Ethiopia",
			"Gabon",
			"The Gambia",
			"Ghana",
			"Guinea",
			"Guinea-Bissau",
			"Kenya",
			"Lesotho",
			"Liberia",
			"Libya",
			"Madagascar",
			"Malawi",
			"Mali",
			"Mauritania",
			"Mauritius",
			"Morocco",
			"Mozambique",
			"Namibia",
			"Niger",
			"Nigeria",
			"Reunion",
			"Rwanda",
			"Sao Tome and Principe",
			"Senegal",
			"Seychelles",
			"Sierra Leone",
			"Somalia",
			"South Africa",
			"South Sudan",
			"Sudan",
			"Swaziland",
			"Tanzania",
			"Togo",
			"Tunisia",
			"Uganda",
			"Western Sahara",
			"Zambia",
			"Zimbabwe"),
			ASIA
			("Afghanistan",
			"Armenia",
			"Azerbaijan",
			"Bahrain",
			"Bangladesh",
			"Bhutan",
			"Brunei",
			"Cambodia",
			"China",
			"East Timor",
			"Georgia",
			"India",
			"Indonesia",
			"Iran",
			"Iraq",
			"Israel",
			"Japan",
			"Jordan",
			"Kazakhstan",
			"Kuwait",
			"Kyrgyzstan",
			"Laos",
			"Lebanon",
			"Malaysia",
			"The Maldives",
			"Mongolia",
			"Myanmar",
			"Nepal",
			"North Korea",
			"Oman",
			"Pakistan",
			"Palestine",
			"The Philippines",
			"Qatar",
			"Russia",
			"Saudi Arabia",
			"Singapore",
			"South Korea",
			"Sri Lanka",
			"Syria",
			"Tajikistan",
			"Thailand",
			"Turkey",
			"Turkmenistan",
			"United Arab Emirates",
			"Uzbekistan",
			"Vietnam",
			"Yemen"),
			EUROPE
			("Albania",
			"Andorra",
			"Austria",
			"Belarus",
			"Belgium",
			"Bosnia and Herzegovina",
			"Bulgaria",
			"Croatia",
			"Cyprus",
			"Czech Republic",
			"Denmark",
			"Estonia",
			"Finland",
			"France",
			"Georgia",
			"Germany",
			"Greece",
			"Hungary",
			"Iceland",
			"Republic of Ireland",
			"Italy",
			"Kosovo",
			"Latvia",
			"Liechtenstein",
			"Lithuania",
			"Luxembourg",
			"North Macedonia",
			"Malta",
			"Moldova",
			"Monaco",
			"Montenegro",
			"Netherlands",
			"Norway",
			"Poland",
			"Portugal",
			"Romania",
			"Russia",
			"San Marino",
			"Serbia",
			"Slovakia",
			"Slovenia",
			"Spain",
			"Sweden",
			"Switzerland",
			"Turkey",
			"Ukraine",
			"United Kingdom",
			"Vatican City"),
			NORTH_AMERICA 
			("Canada",
			"Mexico",
			"United States of America",
			"Navassa Island",
			"Puerto Rico",
			"US Virgin Islands",
			"Dominican Republic",
			"Cuba",
			"Greenland",
			"Haiti",
			"Belize",
			"Costa Rica",
			"El Salvador",
			"Guatemala",
			"Honduras",
			"Guadeloupe",
			"Martinique",
			"Nicaragua",
			"Panama",
			"Jamaica",
			"Bahamas",
			"Barbados",
			"Dominica"),
			SOUTH_AMERICA
			("Brazil",
			"Argentina",
			"Bolivia",
			"Chile",
			"Colombia",
			"Ecuador",
			"Falkland Islands",
			"French Guiana",
			"Guyana",
			"Paraguay",
			"Peru",
			"South Georgia and the South Sandwich Islands",
			"Suriname",
			"Trinidad and Tobago",
			"Uruguay",
			"Venezuela"),
			OCEANIA
			("Australia",
			"Fiji",
			"New Zealand",
			"Federated States of Micronesia",
			"Kiribati",
			"Marshall Islands",
			"Nauru",
			"Palau",
			"Papua New Guinea",
			"Samoa",
			"Solomon Islands",
			"Tonga",
			"Tuvalu",
			"Vanuatu");

	private String[] country;

	private ContinentNames(String... str)
	{
		country = str.clone();
	}

	private static HashMap<String, String> continent = new HashMap<String, String>();

	static 
	{
		for(int i=0; i < ContinentNames.values().length; i++)

			for(int j=0; j < ContinentNames.values()[i].country.length; j++) 
			{
				continent.put(ContinentNames.values()[i].country[j], ContinentNames.values()[i].name());
			}
	}

	public static void getContinent(Scanner sc_in) 
	{		
		String in_word;

		do 
		{
			System.out.println("Please, enter country name to get appropriate continent, or `q` for exit.");

			while(!"q".equals(in_word=sc_in.nextLine()) & !continent.containsKey(in_word)) 
			{
				System.out.println("Please, enter country name, or `q` for exit.");
			}
			if ("q".equals(in_word)) 
			{
				System.out.print("");
			}
			else
			{
				System.out.println(continent.get(in_word));
			}
		}while(!"q".equals(in_word));
	}
}