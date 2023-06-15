package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  @Test
  public void sePuedeCargarUnaPrendaConUnSoloColorEIdentificarSusCaracteristicas() {
    Prenda pantalonNegroDeCuero = new Prenda(
        TipoPrenda.PANTALONES,
        Material.CUERO,
        new Color(0, 0, 0));

    assertEquals("PANTALONES", pantalonNegroDeCuero.getTipoDePrenda().getDescripcion());
    assertEquals(Categoria.PARTE_INFERIOR, pantalonNegroDeCuero.getTipoDePrenda().getCategoria());
    assertEquals(Material.CUERO, pantalonNegroDeCuero.getMaterial());
    assertEquals(new Color(0, 0, 0), pantalonNegroDeCuero.getColorPrimario());
    assertNull(pantalonNegroDeCuero.getColorSecundario());
  }

  @Test
  public void sePuedeCrearUnaPrendaConDosColores() {
    Prenda remeraDeAlgodonAzulYBlanca = new Prenda(
        TipoPrenda.REMERA,
        Material.ALGODON,
        new Color(1, 1, 1),
        new Color(0, 0, 1));

    assertEquals("REMERA", remeraDeAlgodonAzulYBlanca.getTipoDePrenda().getDescripcion());
    assertEquals(Categoria.PARTE_SUPERIOR, remeraDeAlgodonAzulYBlanca.getTipoDePrenda().getCategoria());
    assertEquals(Material.ALGODON, remeraDeAlgodonAzulYBlanca.getMaterial());
    assertEquals(new Color(1, 1, 1), remeraDeAlgodonAzulYBlanca.getColorPrimario());
    assertNotNull(remeraDeAlgodonAzulYBlanca.getColorSecundario());

  }
}
