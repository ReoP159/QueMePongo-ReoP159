package ar.edu.utn.frba.dds;

public class TipoPrenda {

  private String descripcion;
  private Categoria categoria;

  public TipoPrenda(String descriction, Categoria categoria) {
    this.descripcion = descriction;
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public static TipoPrenda CAMISA = new TipoPrenda("CAMISA", Categoria.CALZADO);
  public static TipoPrenda REMERA = new TipoPrenda("REMERA", Categoria.PARTE_SUPERIOR);
  public static TipoPrenda PANTALONES = new TipoPrenda("PANTALONES", Categoria.PARTE_INFERIOR);
}
