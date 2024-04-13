package ar.edu.utn.frba.dds;
import static ar.edu.utn.frba.dds.Categoria.SUPERIOR;
import static ar.edu.utn.frba.dds.Categoria.INFERIOR;
import static ar.edu.utn.frba.dds.Categoria.CALZADO;
import static ar.edu.utn.frba.dds.Categoria.ACCESORIO;

public class TipoPrenda {
  Categoria categoriaPrenda;

  public TipoPrenda(Categoria unaCategoria) {
    this.categoriaPrenda = unaCategoria;
  }

  public Categoria EsCategoria() {
    return this.categoriaPrenda;
  }

  public TipoPrenda REMERA = new TipoPrenda(SUPERIOR);
  public TipoPrenda PANTALON = new TipoPrenda(INFERIOR);
  public TipoPrenda ZAPATILLA = new TipoPrenda(CALZADO);
  public TipoPrenda CARTERA = new TipoPrenda(ACCESORIO);
}