package insuranceFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InsuranceData {
	private LocalDateTime aquireTime;
	private LocalDateTime expireTime;
	private String price;
	private DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	public InsuranceData(String price) {
		aquireTime = LocalDateTime.now();
		expireTime = LocalDateTime.now().plusYears(1) ;
		this.price = price;
	}
	
	public InsuranceData(LocalDateTime aquireTime, LocalDateTime expireTime, String price) {
		this.aquireTime = aquireTime;
		this.expireTime = expireTime;
		this.price = price;
	}
	
	public String getAquireTimeString() {
		return aquireTime.format(dateTimeFormat);
	}
	
	public LocalDateTime getAquireTime() {
		return aquireTime;
	}

	public void setAquireTime(LocalDateTime aquireTime) {
		this.aquireTime = aquireTime;
	}
	
	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public String getExpireTimeString() {
		return expireTime.format(dateTimeFormat);
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}