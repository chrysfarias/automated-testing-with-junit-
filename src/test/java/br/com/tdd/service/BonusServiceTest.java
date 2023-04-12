package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionariosComSalarioAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carlos",LocalDate.now(),new BigDecimal("100000")));
		
		assertEquals(BigDecimal.ZERO, bonus);
	}
	

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carlos",LocalDate.now(),new BigDecimal("3000")));
		
		assertEquals(new BigDecimal("300.0"), bonus);
	}

}
