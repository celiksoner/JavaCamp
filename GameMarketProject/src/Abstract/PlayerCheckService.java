package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckService {
	boolean CheckIfRealPlayer(Player player) throws NumberFormatException, RemoteException;
}
