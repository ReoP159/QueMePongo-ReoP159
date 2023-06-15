package ar.edu.utn.frba.dds;

import java.util.Objects;

public class Prenda {

  private TipoPrenda tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material material, Color color) {
    Objects.requireNonNull(tipo, "Se debe especificar el tipo de prenda");
    this.tipoDePrenda = tipo;
    Objects.requireNonNull(material, "Se debe especificar el material de la prenda");
    this.material = material;
    Objects.requireNonNull(color, "Se debe especificar el color de la prenda");
    this.colorPrimario = color;
  }

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {
    Objects.requireNonNull(tipo, "Se debe especificar el tipo de prenda");
    this.tipoDePrenda = tipo;
    Objects.requireNonNull(material, "Se debe especificar el material de la prenda");
    this.material = material;
    Objects.requireNonNull(colorPrimario, "Se debe especificar el color principal de la prenda");
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
