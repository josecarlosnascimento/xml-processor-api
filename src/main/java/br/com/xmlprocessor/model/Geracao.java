package br.com.xmlprocessor.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Geracao {

    @JacksonXmlProperty(localName = "valor")
    @JacksonXmlElementWrapper(useWrapping = false)
	private Double valores;
	
}
