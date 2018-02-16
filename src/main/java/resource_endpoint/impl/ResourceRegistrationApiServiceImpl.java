package resource_endpoint.impl;

import resource_endpoint.*;
import resource_endpoint.dto.*;


import resource_endpoint.dto.ErrorDTO;
import resource_endpoint.dto.ReadResourceDTO;
import resource_endpoint.dto.ListReadResourceDTO;
import resource_endpoint.dto.CreateResourceDTO;
import resource_endpoint.dto.ResourceDetailsDTO;
import resource_endpoint.dto.UpdateResourceDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.MessageContext;

import javax.ws.rs.core.Response;

public class ResourceRegistrationApiServiceImpl extends ResourceRegistrationApiService {
    @Override
    public Response deleteResource(String resourceId,MessageContext context){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getResource(String resourceId,MessageContext context){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getResourceIds(String resourceOwnerId,MessageContext context){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response registerResource(ResourceDetailsDTO resource,MessageContext context){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateResource(String resourceId,ResourceDetailsDTO updateresource,MessageContext context){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
