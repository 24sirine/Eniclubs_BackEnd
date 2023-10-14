package tn.enicarthage.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.DBUtil.DButil;
import tn.enicarthage.entities.responsableClub;

import tn.enicarthage.repositories.responsableClubRepository;

@Service
public class responsableClubService implements IresponsableClubService {
	@Autowired
	responsableClubRepository responsableClubRepository ;
	
	Connection connection ;
	int flag = 0; 
	public responsableClubService() throws SQLException {
		connection = DButil.getConnection();
	}
	@Override
	public void ajouterRespClub(responsableClub a) {
			
			responsableClubRepository.save(a); 
		}
	
	@Override
	public int validateResp(String code ) {
		
		try {
			PreparedStatement statement = connection.prepareStatement(" SELECT * FROM T_RESPONSABLE_CLUB WHERE resp_code='" + code+"'   " );
			ResultSet rs = statement.executeQuery();
		
			while (rs.next())
			{ if ( rs.getString(7).equals(code) )
				{flag =1;
				}
			else {System.out.println("Données non Valides");
			flag=0;}
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	return flag ;}
}

