package br.com.robson.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor



public class Fornecedor {
	
	private UUID id;
	private String razaoSocial;
	private String cnpj;
	private List<Produto> produtos;

}
