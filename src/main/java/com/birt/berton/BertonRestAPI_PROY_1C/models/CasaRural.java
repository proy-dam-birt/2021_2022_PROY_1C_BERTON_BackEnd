package com.birt.berton.BertonRestAPI_PROY_1C.models;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "id",
    "type",
    "geometry",
    "properties"
})

@Data
@AllArgsConstructor
@Document(collection="casasrurales")

public class CasaRural extends Establecimiento {
	
	@JsonProperty("properties")
	private Properties properties; 
	
}
