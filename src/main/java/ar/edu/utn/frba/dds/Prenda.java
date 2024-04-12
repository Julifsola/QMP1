package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private Categoria categoria;
  private Tipo tipo;
  private String material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Categoria categoria, Tipo tipo, String material, Color colorPrimario, Color colorSecundario) {
    if (categoria == null) {
      throw new IllegalArgumentException("La categoria no debe estar vacia");
    }
    this.categoria = categoria;

    if (tipo == null) {
      throw new IllegalArgumentException("El tipo no debe estar vacio");
    }
    this.tipo = tipo;

    if (material == null) {
      throw new IllegalArgumentException("El material no debe estar vacio");
    }
    this.material = material;

    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario no debe estar vacio");
    }
    this.colorPrimario = colorPrimario;

    this.colorSecundario = colorSecundario;
  }
  // TODO : Crear cechequeo de si una prenda correlaciona su clase y su tipo
}