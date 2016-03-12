package org.si.dragamina.logic;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PanelaTest {
	
	private Panela p1;

	@Before
	public void setUp() throws Exception {
		p1 = Panela.getPanela();
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
	}

	@Test
	public void testGetPanela() {
		fail("Not yet implemented");
	}

	@Test
	public void testPanelaEraiki() {
		fail("Not yet implemented");
	}

	@Test
	public void testMatrizeaEguneratu() {
		fail("Not yet implemented");
	}

	@Test
	public void testMinaKopurua() {
		int mina = 7;
		assertEquals(p1.minaKopurua(), mina);
	}

	@Test
	public void testIreki() {
		fail("Not yet implemented");
	}

	@Test
	public void testPartidaIrabazi() {
		fail("Not yet implemented");
	}

	@Test
	public void testPartidaGaldu() {
		fail("Not yet implemented");
	}

}
