package resource_endpoint.factories;

import resource_endpoint.ResourceRegistrationApiService;
import resource_endpoint.impl.ResourceRegistrationApiServiceImpl;

public class ResourceRegistrationApiServiceFactory {

   private final static ResourceRegistrationApiService service = new ResourceRegistrationApiServiceImpl();

   public static ResourceRegistrationApiService getResourceRegistrationApi()
   {
      return service;
   }
}
