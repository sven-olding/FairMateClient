package com.gi.crm.fairmate.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Registration implements Serializable
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -8379261837863356405L;

	@JsonProperty("accreditation_type")
	private String				accreditationType;

	@JsonProperty("first_name")
	private String				firstName;

	@JsonProperty("last_name")
	private String				lastName;

	private String				zip;

	private String				email;

	private String				city;

	private String				street;

	private String				country;

	private String				newsletter;

	private String				note;

	private String				gender;

	private String				city2;

	@JsonProperty("house_no_extension")
	private String				houseNoExtension;

	private String				street3;

	private String				street4;

	@JsonProperty("user_name")
	private String				userName;

	private String				title;

	private String				division;

	private String				company;

	private String				company2;

	private String				company3;

	private String				company4;

	private String				street2;

	private String				webpage;

	private String				fax;

	private String				phone;

	@JsonProperty("house_no")
	private String				houseNo;

	private String				salutation;

	private String				position;

	/**
	 * @return the country
	 */
	public String getCountry()
	{
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}

	/**
	 * @return the newsletter
	 */
	public String getNewsletter()
	{
		return newsletter;
	}

	/**
	 * @param newsletter the newsletter to set
	 */
	public void setNewsletter(String newsletter)
	{
		this.newsletter = newsletter;
	}

	/**
	 * @return the note
	 */
	public String getNote()
	{
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note)
	{
		this.note = note;
	}

	/**
	 * @return the gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @return the city2
	 */
	public String getCity2()
	{
		return city2;
	}

	/**
	 * @param city2 the city2 to set
	 */
	public void setCity2(String city2)
	{
		this.city2 = city2;
	}

	/**
	 * @return the houseNoExtension
	 */
	public String getHouseNoExtension()
	{
		return houseNoExtension;
	}

	/**
	 * @param houseNoExtension the houseNoExtension to set
	 */
	public void setHouseNoExtension(String houseNoExtension)
	{
		this.houseNoExtension = houseNoExtension;
	}

	/**
	 * @return the street3
	 */
	public String getStreet3()
	{
		return street3;
	}

	/**
	 * @param street3 the street3 to set
	 */
	public void setStreet3(String street3)
	{
		this.street3 = street3;
	}

	/**
	 * @return the street4
	 */
	public String getStreet4()
	{
		return street4;
	}

	/**
	 * @param street4 the street4 to set
	 */
	public void setStreet4(String street4)
	{
		this.street4 = street4;
	}

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the division
	 */
	public String getDivision()
	{
		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(String division)
	{
		this.division = division;
	}

	/**
	 * @return the company
	 */
	public String getCompany()
	{
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company)
	{
		this.company = company;
	}

	/**
	 * @return the company2
	 */
	public String getCompany2()
	{
		return company2;
	}

	/**
	 * @param company2 the company2 to set
	 */
	public void setCompany2(String company2)
	{
		this.company2 = company2;
	}

	/**
	 * @return the company3
	 */
	public String getCompany3()
	{
		return company3;
	}

	/**
	 * @param company3 the company3 to set
	 */
	public void setCompany3(String company3)
	{
		this.company3 = company3;
	}

	/**
	 * @return the company4
	 */
	public String getCompany4()
	{
		return company4;
	}

	/**
	 * @param company4 the company4 to set
	 */
	public void setCompany4(String company4)
	{
		this.company4 = company4;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2()
	{
		return street2;
	}

	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2)
	{
		this.street2 = street2;
	}

	/**
	 * @return the webpage
	 */
	public String getWebpage()
	{
		return webpage;
	}

	/**
	 * @param webpage the webpage to set
	 */
	public void setWebpage(String webpage)
	{
		this.webpage = webpage;
	}

	/**
	 * @return the fax
	 */
	public String getFax()
	{
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax)
	{
		this.fax = fax;
	}

	/**
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo()
	{
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo)
	{
		this.houseNo = houseNo;
	}

	/**
	 * @return the salutation
	 */
	public String getSalutation()
	{
		return salutation;
	}

	/**
	 * @param salutation the salutation to set
	 */
	public void setSalutation(String salutation)
	{
		this.salutation = salutation;
	}

	/**
	 * @return the position
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position)
	{
		this.position = position;
	}

	/**
	 * @return the accreditationType
	 */
	public String getAccreditationType()
	{
		return accreditationType;
	}

	/**
	 * @param accreditationType the accreditationType to set
	 */
	public void setAccreditationType(String accreditationType)
	{
		this.accreditationType = accreditationType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the zip
	 */
	public String getZip()
	{
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip)
	{
		this.zip = zip;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

}
