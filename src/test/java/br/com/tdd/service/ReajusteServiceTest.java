package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	@Test
	void reajusteDeveriaSer3PorCentoParaDesempenhoADesejar() {
		ReajusteService service = new ReajusteService();
		BigDecimal reajuste = service.calcularReajusteADesejar(new Funcionario("Fernando",LocalDate.now(),new BigDecimal("5000")),Desempenho.ADESEJAR);
		assertEquals(new BigDecimal("150.00"),reajuste);
	}
	
	@Test
	void reajusteDeveriaSer15PorCentoParaDesempenhoBom() {
		ReajusteService service = new ReajusteService();
		BigDecimal reajuste = service.calcularReajustebom(new Funcionario("Fernando",LocalDate.now(),new BigDecimal("5000")),Desempenho.BOM);
		assertEquals(new BigDecimal("750.00"),reajuste);	
	}
	
	@Test
	void reajusteDeveriaSer20PorCentoParaDesempenhoOtimo() {
		ReajusteService service = new ReajusteService();
		BigDecimal reajuste = service.calcularReajusteOtimo(new Funcionario("Fernando",LocalDate.now(),new BigDecimal("5000")),Desempenho.OTIMO);
		assertEquals(new BigDecimal("1000.00"),reajuste);	
	}

}
