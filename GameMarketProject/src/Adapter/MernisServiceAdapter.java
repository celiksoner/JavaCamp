package Adapter;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthYear());
		if(result == true)
		{
			System.out.println("Baþarýlý");
			return true;
			
		}else {
			System.out.println("Baþarýsýz");
			return false;
		}
	}

}
