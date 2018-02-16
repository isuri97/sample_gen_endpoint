package resource_endpoint.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ResourceDetailsDTO  {
  
  
  @NotNull
  private List<String> resourceScopes = new ArrayList<String>();
  
  @NotNull
  private String iconUri = null;
  
  @NotNull
  private String name = null;
  
  @NotNull
  private String type = null;
  
  @NotNull
  private String description = null;

  
  /**
   * An array of strings indicating the available scopes for this resource.\n
   **/
  @ApiModelProperty(required = true, value = "An array of strings indicating the available scopes for this resource.\n")
  @JsonProperty("resourceScopes")
  public List<String> getResourceScopes() {
    return resourceScopes;
  }
  public void setResourceScopes(List<String> resourceScopes) {
    this.resourceScopes = resourceScopes;
  }

  
  /**
   * A URI for a graphic icon representing the resource.\n
   **/
  @ApiModelProperty(required = true, value = "A URI for a graphic icon representing the resource.\n")
  @JsonProperty("iconUri")
  public String getIconUri() {
    return iconUri;
  }
  public void setIconUri(String iconUri) {
    this.iconUri = iconUri;
  }

  
  /**
   * A human-readable string describing a resource of one or more resources.The authorization server MAY use the name in any user interface it presents to the resource owner.\n
   **/
  @ApiModelProperty(required = true, value = "A human-readable string describing a resource of one or more resources.The authorization server MAY use the name in any user interface it presents to the resource owner.\n")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A string uniquely identifying the semantics of the resource.\n
   **/
  @ApiModelProperty(required = true, value = "A string uniquely identifying the semantics of the resource.\n")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * A human-readable string describing the resource at length. The authorization server MAY use this description in any user interface it presents to a resource owner, for example, for resource protection monitoring or policy setting.\n
   **/
  @ApiModelProperty(required = true, value = "A human-readable string describing the resource at length. The authorization server MAY use this description in any user interface it presents to a resource owner, for example, for resource protection monitoring or policy setting.\n")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsDTO {\n");
    
    sb.append("  resourceScopes: ").append(resourceScopes).append("\n");
    sb.append("  iconUri: ").append(iconUri).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
