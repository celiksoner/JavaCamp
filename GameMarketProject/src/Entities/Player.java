package Entities;

public class Player {
	private int playerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int birthYear;
	
	
	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	public Player() {
	}


	public Player(int playerId, String firstName, String lastName, String nationalityId, int birthYear) {
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
	}
	
	
	
	
	
}
