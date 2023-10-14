package tn.enicarthage.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.DBUtil.DButil;
import tn.enicarthage.entities.etudiant;
import tn.enicarthage.repositories.etudiantRepository;

@Service
public class etudiantService implements IetudiantService{
	@Autowired
	etudiantRepository etudiantRepository ;
	
	Connection connection ;
	int flag = 0; 
	public etudiantService() throws SQLException {
		connection = DButil.getConnection();
	}
	@Override
	public void ajouterEtudiant(etudiant e) {
			
			etudiantRepository.save(e); 
		}
	@Override
	public int validateEtd(String num_carteEtd ) {
		
		try {
			PreparedStatement statement = connection.prepareStatement(" SELECT * FROM T_etudiant WHERE NUM_CARTE='" + num_carteEtd+"'   " );
			ResultSet rs = statement.executeQuery();
		
			while (rs.next())
			{ if ( rs.getString(6).equals(num_carteEtd) )
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
