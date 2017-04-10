package ae.coder.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by almehairbi on 2/17/17.
 */

public class ActivationDTO implements Serializable
{

    private int id;
    private String activationCode;
    private Date expiryDate;
    private String userName;
    
    public ActivationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ActivationDTO(String userName, int id, String activationCode, Date expiryDate) {
		this.userName = userName;
		this.id = id;
		this.activationCode = activationCode;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
