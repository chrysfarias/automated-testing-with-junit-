package br.com.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;

public class ReajusteService {

	public BigDecimal calcularReajusteADesejar(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
		if(desempenho == Desempenho.ADESEJAR) {
			funcionario.reajustarSalario(reajuste);
			return reajuste.setScale(2,RoundingMode.HALF_UP);		
		}
		return reajuste.ZERO;
	}

	public BigDecimal calcularReajustebom(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
		if(desempenho == Desempenho.BOM) {
			funcionario.reajustarSalario(reajuste);	
			return reajuste.setScale(2,RoundingMode.HALF_UP);
		}
		return reajuste.ZERO;
	}

	public BigDecimal calcularReajusteOtimo(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.2"));
		if(desempenho == Desempenho.OTIMO) {
			funcionario.reajustarSalario(reajuste);
			return reajuste.setScale(2,RoundingMode.HALF_UP);
		}
		return reajuste.ZERO;
	}	
	}



