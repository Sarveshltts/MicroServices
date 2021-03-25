package com.ltts.Team;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeamRepository extends JpaRepository<Team, Long>
{
	@Query("SELECT u FROM Team u")
	public List<Team> findByAll();
}
