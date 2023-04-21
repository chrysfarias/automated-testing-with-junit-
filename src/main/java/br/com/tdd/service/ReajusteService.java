package br.com.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		
		if(desempenho == Desempenho.ADESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(reajuste.setScale(2,RoundingMode.UP));		
		}
		
		else if(desempenho == Desempenho.BOM){
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			funcionario.reajustarSalario(reajuste.setScale(2,RoundingMode.UP));				
		}
		
		else if(desempenho == Desempenho.OTIMO) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.2"));
			funcionario.reajustarSalario(reajuste.setScale(2,RoundingMode.UP));
		}

	}
}
	
	
	
	
	
	
	




