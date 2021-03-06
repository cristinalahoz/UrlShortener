package urlshortener.common.domain;

import java.sql.Timestamp;

public class Click {

	private Long id;
	private String hash;
	private Timestamp created;
	private String referrer;
	private String browser;
	private String platform;
	private String ip;
	private String country;
	private String latitude;
	private String longitude;

	public Click(Long id, String hash, Timestamp created, String referrer,
			String browser, String platform, String ip, String country,
			 String latitude, String longitude) {
		this.id = id;
		this.hash = hash;
		this.created = created;
		this.referrer = referrer;
		this.browser = browser;
		this.platform = platform;
		this.ip = ip;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public String getHash() {
		return hash;
	}

	public Timestamp getCreated() {
		return created;
	}

	public String getReferrer() {
		return referrer;
	}

	public String getBrowser() {
		return browser;
	}

	public String getPlatform() {
		return platform;
	}

	public String getIp() {
		return ip;
	}

	public String getCountry() {
		return country;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return "Click{" +
				"id=" + id +
				", hash='" + hash + '\'' +
				", created=" + created +
				", referrer='" + referrer + '\'' +
				", browser='" + browser + '\'' +
				", platform='" + platform + '\'' +
				", ip='" + ip + '\'' +
				", country='" + country + '\'' +
				", latitude='" + latitude + '\'' +
				", longitude='" + longitude + '\'' +
				'}';
	}
}
