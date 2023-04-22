package br.com.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Desempenho {
	 ADESEJAR {
		@Override
		public BigDecimal percentualReajuste(Funcionario funcionario) {
			BigDecimal reajusteCalculado = funcionario.getSalario().multiply(new BigDecimal("0.03").setScale(2,RoundingMode.HALF_UP));
			return reajusteCalculado;
		}
		
	},BOM {
		@Override
		public BigDecimal percentualReajuste(Funcionario funcionario) {
			BigDecimal reajusteCalculado = funcionario.getSalario().multiply(new BigDecimal("0.15").setScale(2,RoundingMode.HALF_UP));
			return reajusteCalculado;
		}
			
	},OTIMO {
		@Override
		public BigDecimal percentualReajuste(Funcionario funcionario) {
			BigDecimal reajusteCalculado = funcionario.getSalario().multiply(new BigDecimal("0.2").setScale(2,RoundingMode.HALF_UP));
			return reajusteCalculado;
		}
	};
	 
	
	 public abstract BigDecimal percentualReajuste(Funcionario funcionario);
	 
		 
	 }

