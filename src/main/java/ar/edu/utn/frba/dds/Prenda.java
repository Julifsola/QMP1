package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private String material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;

  // Constructor obligatorio
  public Prenda(Categoria categoria, TipoPrenda tipo, String material, ColorPrenda colorPrimario, ColorPrenda colorSecundario) {
    if (tipo == null) {
      throw new IllegalArgumentException("El tipo no debe estar vacio");
    }
    this.tipo = tipo;

    this.categoria = tipo.EsCategoria();

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
  // Constructor opcional
  public Prenda(Categoria categoria, TipoPrenda tipo, String material, ColorPrenda colorPrimario) {
    if (tipo == null) {
      throw new IllegalArgumentException("El tipo no debe estar vacio");
    }
    this.tipo = tipo;

    this.categoria = tipo.EsCategoria();

    if (material == null) {
      throw new IllegalArgumentException("El material no debe estar vacio");
    }
    this.material = material;

    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario no debe estar vacio");
    }
    this.colorPrimario = colorPrimario;
  }
}

