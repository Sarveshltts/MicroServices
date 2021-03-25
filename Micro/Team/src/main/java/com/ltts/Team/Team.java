package com.ltts.Team;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Team")
public class Team 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamid;
	@Column(nullable = false, unique = true, length = 45)
	private String teamname;
	@Column(nullable = false, unique = true, length = 45)
	private String ownername;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Team(int teamid, String teamname, String ownername) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownername = ownername;
	}
	public Team() {
		super();
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", ownername=" + ownername + "]";
	}
	
	
}
