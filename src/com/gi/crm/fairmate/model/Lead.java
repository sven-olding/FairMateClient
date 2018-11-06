package com.gi.crm.fairmate.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lead implements Serializable
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= -1331404892519005597L;

	@JsonProperty("scan_barcode")
	private String				scanBarcode;

	@JsonProperty("scan_timestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date				scanTimestamp;

	@JsonProperty("license_code")
	private String				licenseCode;

	@JsonProperty("license_username")
	private String				licenseUsername;

	@JsonProperty("license_email")
	private String				licenseEMail;

	@JsonProperty("license_area")
	private String				licenseArea;

	@JsonProperty("license_device")
	private String				licenseDevice;

	@JsonProperty("license_device_uuid")
	private String				licenseDeviceUUID;

	@JsonProperty("custom_status")
	private String				customStatus;

	@JsonProperty("contact_rating")
	private String				contactRating;

	@JsonProperty("selected_tags")
	private String[]			selectedTags;

	@JsonProperty("registration")
	private Registration		registration;

	@JsonProperty("custom")
	private CustomFields		customFields;

	/**
	 * @return the scanBarcode
	 */
	public String getScanBarcode()
	{
		return scanBarcode;
	}

	/**
	 * @param scanBarcode the scanBarcode to set
	 */
	public void setScanBarcode(String scanBarcode)
	{
		this.scanBarcode = scanBarcode;
	}

	/**
	 * @return the scanTimestamp
	 */
	public Date getScanTimestamp()
	{
		return scanTimestamp;
	}

	/**
	 * @param scanTimestamp the scanTimestamp to set
	 */
	public void setScanTimestamp(Date scanTimestamp)
	{
		this.scanTimestamp = scanTimestamp;
	}

	/**
	 * @return the licenseCode
	 */
	public String getLicenseCode()
	{
		return licenseCode;
	}

	/**
	 * @param licenseCode the licenseCode to set
	 */
	public void setLicenseCode(String licenseCode)
	{
		this.licenseCode = licenseCode;
	}

	/**
	 * @return the licenseUsername
	 */
	public String getLicenseUsername()
	{
		return licenseUsername;
	}

	/**
	 * @param licenseUsername the licenseUsername to set
	 */
	public void setLicenseUsername(String licenseUsername)
	{
		this.licenseUsername = licenseUsername;
	}

	/**
	 * @return the licenseEMail
	 */
	public String getLicenseEMail()
	{
		return licenseEMail;
	}

	/**
	 * @param licenseEMail the licenseEMail to set
	 */
	public void setLicenseEMail(String licenseEMail)
	{
		this.licenseEMail = licenseEMail;
	}

	/**
	 * @return the licenseArea
	 */
	public String getLicenseArea()
	{
		return licenseArea;
	}

	/**
	 * @param licenseArea the licenseArea to set
	 */
	public void setLicenseArea(String licenseArea)
	{
		this.licenseArea = licenseArea;
	}

	/**
	 * @return the licenseDevice
	 */
	public String getLicenseDevice()
	{
		return licenseDevice;
	}

	/**
	 * @param licenseDevice the licenseDevice to set
	 */
	public void setLicenseDevice(String licenseDevice)
	{
		this.licenseDevice = licenseDevice;
	}

	/**
	 * @return the licenseDeviceUUID
	 */
	public String getLicenseDeviceUUID()
	{
		return licenseDeviceUUID;
	}

	/**
	 * @param licenseDeviceUUID the licenseDeviceUUID to set
	 */
	public void setLicenseDeviceUUID(String licenseDeviceUUID)
	{
		this.licenseDeviceUUID = licenseDeviceUUID;
	}

	/**
	 * @return the customStatus
	 */
	public String getCustomStatus()
	{
		return customStatus;
	}

	/**
	 * @param customStatus the customStatus to set
	 */
	public void setCustomStatus(String customStatus)
	{
		this.customStatus = customStatus;
	}

	/**
	 * @return the contactRating
	 */
	public String getContactRating()
	{
		return contactRating;
	}

	/**
	 * @param contactRating the contactRating to set
	 */
	public void setContactRating(String contactRating)
	{
		this.contactRating = contactRating;
	}

	/**
	 * @return the selectedTags
	 */
	public String[] getSelectedTags()
	{
		return selectedTags;
	}

	/**
	 * @param selectedTags the selectedTags to set
	 */
	public void setSelectedTags(String[] selectedTags)
	{
		this.selectedTags = selectedTags;
	}

	/**
	 * @return the registration
	 */
	public Registration getRegistration()
	{
		return registration;
	}

	/**
	 * @param registration the registration to set
	 */
	public void setRegistration(Registration registration)
	{
		this.registration = registration;
	}

	/**
	 * @return the customFields
	 */
	public CustomFields getCustomFields()
	{
		return customFields;
	}

	/**
	 * @param customFields the customFields to set
	 */
	public void setCustomFields(CustomFields customFields)
	{
		this.customFields = customFields;
	}

	@Override
	public String toString()
	{
		return getScanBarcode() + "/" + getLicenseEMail() + "/"
				+ new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(getScanTimestamp());
	}

}
