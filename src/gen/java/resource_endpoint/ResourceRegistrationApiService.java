package resource_endpoint;

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

public abstract class ResourceRegistrationApiService {
    public abstract Response deleteResource(String resourceId, MessageContext context);
    public abstract Response getResource(String resourceId, MessageContext context);
    public abstract Response getResourceIds(String resourceOwnerId, MessageContext context);
    public abstract Response registerResource(ResourceDetailsDTO resource, MessageContext context);
    public abstract Response updateResource(String resourceId,ResourceDetailsDTO updateresource, MessageContext context);
}

