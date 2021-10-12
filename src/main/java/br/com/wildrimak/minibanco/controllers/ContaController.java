package br.com.wildrimak.minibanco.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wildrimak.minibanco.dtos.responses.ContaResponse;

@RestController
@RequestMapping("/contas")
public class ContaController {

	@GetMapping
	public List<ContaResponse> getContas(){

		
		var c1 = new ContaResponse("270", "0001", "0000101", '8', "Wildrimak");
		var c2 = new ContaResponse("270", "0001", "0000102", '9', "Kamirdliw");

		var contas = new ArrayList<ContaResponse>();
		
		contas.add(c1);
		contas.add(c2);
		
		return contas;
	}
	
}
