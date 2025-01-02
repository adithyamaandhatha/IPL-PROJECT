package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJpa implements TeamService {

    private TeamDAO teamDAO;

    private TeamServiceImplJpa(TeamDAO teamDAO){
        this.teamDAO = teamDAO;
    }

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTeams'");
    }

    @Override
    public int addTeam(Team team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTeam'");
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTeamsSortedByName'");
    }

}