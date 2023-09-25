package in.mk.serviceFactory;

import in.mk.service.ATMServiceImpl;
import in.mk.service.IATMService;

public class IATMServiceFactory {
	private static IATMService service = null;

	// made constructor as private to avoid object creation
	private IATMServiceFactory() {

	}

	public static IATMService getIATMService() {
		if (service == null) {
			service = new ATMServiceImpl();
		}
		return service;
	}
}
