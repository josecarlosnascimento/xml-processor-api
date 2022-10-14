package br.com.xmlprocessor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.xmlprocessor.model.Agentes;

@Service
public class XmlProcessorService {

	public Agentes processarArquivo(MultipartFile file) throws Exception {
		String content = new String(file.getBytes());
		XmlMapper xml = new XmlMapper();
		
		Agentes agentes = xml.readValue(content, Agentes.class);
		removerInformacoesConfidenciais(agentes);
		return agentes;
	}
	
	public void removerInformacoesConfidenciais(Agentes agentes) {
		agentes.getAgente().stream().forEach(agente -> agente.getRegioes().stream().forEach(regiao -> regiao.getPrecoMedio().getValores().clear()));
	}
	
}
