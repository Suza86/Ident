package com.Identyum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 64)
	private String password;
	
	@Column(name = "user_name", nullable = false, unique = true, length = 20)
	private String userName;
	
    @Column(name = "phone", nullable = false)
    private String phone;
    
    @Column(nullable = true, length = 64)
    private String photos;
    
    @PersistenceConstructor
    public User() {}
    
    public User(String username, String phone) {
    	this.userName = username;
    	this.phone = phone;
    }

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Transient
	public String getPhotos() {
	    if (photos == null || id == null) return null;	         
	    return "/user-photos/" + id + "/" + photos;
	}
	 
	public void setPhotos(String photos) {
		this.photos = photos;
	}
}
