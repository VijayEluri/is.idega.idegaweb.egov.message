package is.idega.idegaweb.egov.message.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHome;
import java.rmi.RemoteException;

public interface CommuneMessageBusinessHome extends IBOHome {
	public CommuneMessageBusiness create() throws CreateException,
			RemoteException;
}