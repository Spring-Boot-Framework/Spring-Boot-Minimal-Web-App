package io.github.anantharajuc.sbmwa.model;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="rest_controller_response") 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
@ApiModel(description="Simple JavaBean domain object representing RESTcontrollerResponse") 
public class RESTcontrollerResponse 
{
	@Id
	long id;
	
	@Schema(description="RESTcontrollerResponse verb", example="GET.", required=true)
	String verb;
	
	@Schema(description="RESTcontrollerResponse content", example="HTTP Method Handled.", required=true)
	String content;
	
	@Transient
	long totalRequestsCounter;
}
