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
		Funcionario funcionario = new Funcionario("Chrystian",LocalDate.now(), new BigDecimal("5000"));
		service.concederReajuste(funcionario, Desempenho.ADESEJAR);
		assertEquals(new BigDecimal("150.00"),funcionario.getajusteSalarial());		
	}
	
	@Test
	void reajusteDeveriaSer15PorCentoParaDesempenhoBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Clara",LocalDate.now(), new BigDecimal("5000"));
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("750.00"),funcionario.getajusteSalarial());	
	}
	
	@Test
	void reajusteDeveriaSer20PorCentoParaDesempenhoOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Sabrina",LocalDate.now(), new BigDecimal("5000"));
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1000.00"),funcionario.getajusteSalarial());	

	}
	@Test
	void reajusteDeveriaSer40PorCentoParaDesempenhoEspetacular() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Cicero",LocalDate.now(), new BigDecimal("5000"));
		service.concederReajuste(funcionario, Desempenho.ESPETACULAR);
		assertEquals(new BigDecimal("2000.00"),funcionario.getajusteSalarial());	

	}


}
