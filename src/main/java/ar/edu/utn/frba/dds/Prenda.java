package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private Categoria categoria;
  private Tipo tipo;
  private String material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Categoria categoria, Tipo tipo, String material, Color colorPrimario, Color colorSecundario) {
    this.categoria = categoria;
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
  // Crear el objeto que chequee si una prenda correlaciona su clase y su tipo
}
// Quiero evitar que haya prendas sin tipo, tela, categoría o color primario