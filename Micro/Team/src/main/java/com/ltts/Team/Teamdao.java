package com.ltts.Team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Teamdao 
{
	@Autowired
	TeamRepository tr;
	
	public void store()
	{
	tr.save(new Team(123,"huy","kio"));
	tr.save(new Team(456,"ftr","asd"));
	}
}
