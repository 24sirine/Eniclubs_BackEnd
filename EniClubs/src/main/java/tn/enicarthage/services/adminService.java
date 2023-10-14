package tn.enicarthage.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.DBUtil.DButil;
import tn.enicarthage.entities.admin;

import tn.enicarthage.repositories.adminRepository;


@Service
public class adminService implements IadminService{
	@Autowired
	adminRepository adminRepository ;
	Connection connection ;
	int flag = 0; 
	public adminService() throws SQLException {
		connection = DButil.getConnection();
		
	}
	@Override
	public void ValiderDemandeCreation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValiderDemandeRenouvellement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValiderDemandeLancementEvent() {
		// TODO Auto-generated method stub
		
	}
	@Override
public void ajouterAdmin(admin a) {
		
		adminRepository.save(a); 
	}
	@Override
	public int validateAdmin(String prenom, String nom , String email ,  String mdp , String code ) {
		
		try {
			PreparedStatement statement = connection.prepareStatement(" SELECT * FROM T_ADMIN  WHERE ADMIN_CODE='" + code+"' and PERSONNE_nom='" + nom+"' and PERSONNE_prenom ='" + prenom+"' and PERSONNE_Email='" + email+"'  and PERSONNE_mdp='" + mdp+"'   " );
			ResultSet rs = statement.executeQuery();
		
			while (rs.next())
			{ if (rs.getString(5).equals(prenom) && rs.getString(4).equals(nom)   && rs.getString(2).equals(email)  && rs.getString(3).equals(mdp)  && rs.getString(6).equals(code) )
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
