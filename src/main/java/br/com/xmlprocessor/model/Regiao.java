package br.com.xmlprocessor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Regiao {

	private String sigla;
	private Geracao geracao;
	private Compra compra;
	private PrecoMedio precoMedio;

}
