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
		
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Carlos",LocalDate.now(),new BigDecimal("10001"))));
	}
	

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carlos",LocalDate.now(),new BigDecimal("3000")));
		
		assertEquals(new BigDecimal("300.00"), bonus);
	}
	
	@Test
	void bonusDeveriSer10PorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carlos",LocalDate.now(),new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
		
	}

}
