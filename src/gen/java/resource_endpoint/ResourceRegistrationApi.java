package resource_endpoint;

import resource_endpoint.dto.*;
import resource_endpoint.ResourceRegistrationApiService;
import resource_endpoint.factories.ResourceRegistrationApiServiceFactory;

import io.swagger.annotations.ApiParam;

import resource_endpoint.dto.ErrorDTO;
import resource_endpoint.dto.ReadResourceDTO;
import resource_endpoint.dto.ListReadResourceDTO;
import resource_endpoint.dto.CreateResourceDTO;
import resource_endpoint.dto.ResourceDetailsDTO;
import resource_endpoint.dto.UpdateResourceDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.apache.cxf.jaxrs.ext.MessageContext;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("/ResourceRegistration")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/ResourceRegistration", description = "the ResourceRegistration API")
public class ResourceRegistrationApi  {

   private final ResourceRegistrationApiService delegate = ResourceRegistrationApiServiceFactory.getResourceRegistrationApi();

    @DELETE
    @Path("/resource/{resourceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Resource description by ID", notes = "This method uses to delete resource information when resource ID is given", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK.Resource deleted successfully."),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "No content.") })

    public Response deleteResource(@ApiParam(value = "ID ofthe  resource",required=true ) @PathParam("resourceId")  String resourceId, @Context MessageContext context)
    {
    return delegate.deleteResource(resourceId,context);
    }
    @GET
    @Path("/resource/{resourceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Obtain resource description by ID", notes = "This method uses to obtain resource information when resource ID is given", response = ReadResourceDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation. Return Id,name,scopes,icon_uri and type"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.Resource does not exist.") })

    public Response getResource(@ApiParam(value = "ID ofthe  resource",required=true ) @PathParam("resourceId")  String resourceId, @Context MessageContext context)
    {
    return delegate.getResource(resourceId,context);
    }
    @GET
    @Path("/resource")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find all resource IDs", notes = "This method uses to obtain all resource IDs which was registered on Authorization server under same resource owner.", response = ListReadResourceDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Resource does not exist.") })

    public Response getResourceIds(@ApiParam(value = "The resource owner ID is defined to obtain of the list of resources to be retrieved.") @QueryParam("resourceOwnerId")  String resourceOwnerId, @Context MessageContext context)
    {
    return delegate.getResourceIds(resourceOwnerId,context);
    }
    @POST
    @Path("/resource")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a resource", notes = "This method uses to register resources in Authorization server.", response = CreateResourceDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource registered successfully.\n"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input.") })

    public Response registerResource(@ApiParam(value = "The resource description which resource owner save in Authorization server."  ) ResourceDetailsDTO resource, @Context MessageContext context)
    {
    return delegate.registerResource(resource,context);
    }
    @PUT
    @Path("/resource/{resourceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update resource description by ID", notes = "This method uses to update resource description information when resource ID is given by the resource owner.", response = UpdateResourceDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Resource updated successfully."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Resource not found") })

    public Response updateResource(@ApiParam(value = "ID ofthe  resource",required=true ) @PathParam("resourceId")  String resourceId,
    @ApiParam(value = "The resource description which resource owner used to update in Authorization server."  ) ResourceDetailsDTO updateresource, @Context MessageContext context)
    {
    return delegate.updateResource(resourceId,updateresource,context);
    }
}

