package br.com.xmlprocessor.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.xmlprocessor.service.XmlProcessorService;

@RestController
@RequestMapping
public class XmlProcessorController {

	@Autowired
	private XmlProcessorService service;
	
	@PostMapping("/upload")
	public ResponseEntity<Void> process(@RequestParam MultipartFile file) throws Exception {
		service.processarArquivo(file).getAgente().forEach(ag -> System.out.println(ag.getCodigo()));
		return ResponseEntity.ok().build();
	}
	
}
