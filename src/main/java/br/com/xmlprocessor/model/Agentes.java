package br.com.xmlprocessor.model;

import java.util.List;

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
public class Agentes {

    @JacksonXmlProperty(localName = "agente")
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<Agente> agente;
	private Double versao;
	
	
}
