package com.tech;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vote")
public class Vote {
	@Id
	@GeneratedValue
	@Column
	
	private int id;
	@Column
	private String partyName;
	@Column
	private Date electionDate;
	
	@OneToOne(targetEntity = Voter.class)
	private Voter voter;

	public Vote() {
		super();
		
	}

	public Vote(int id, String partyName, Date electionDate, Voter voter) {
		super();
		this.id = id;
		this.partyName = partyName;
		this.electionDate = electionDate;
		this.voter = voter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public Date getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", partyName=" + partyName + ", electionDate=" + electionDate + ", voter=" + voter
				+ "]";
	}

}
