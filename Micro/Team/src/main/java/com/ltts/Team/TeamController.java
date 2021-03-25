package com.ltts.Team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController 
{
	@Autowired
	Teamdao td= new Teamdao();
	@Autowired
	TeamRepository tr;
	 @RequestMapping("/welcome")
	    public String wel()
	    {
	    	return "welcome";
	    }
	@GetMapping("/huy")
	public List<Team> show()
	{

		List<Team> li=new ArrayList<Team>();
		li=tr.findByAll();
		return li;
	}
}
