package melomano.dominio;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Cancion {
  private String nombre;
  
  private String cancionIncompleta;
  
  private String primeraPalabra;
  
  private String segundaPalabra;
  
  private String primeraPregunta;
  
  private String segundaPregunta;
  
  private String terceraPregunta;
  
  private String cuartaPregunta;
  
  private String primeraRespuesta;
  
  private String segundaRespuesta;
  
  private String terceraRespuesta;
  
  private String cuartaRespuesta;
  
  private String genero;
  
  private Integer idCancion;
  
  public Cancion() {
  }
  
  public Cancion(final String nombre, final String canInc, final String pripal, final String segpal, final String primPreg, final String segPreg, final String terPreg, final String cuartaPreg, final String primResp, final String segResp, final String terResp, final String cuarResp, final String genero) {
    this.nombre = nombre;
    this.cancionIncompleta = canInc;
    this.primeraPalabra = pripal;
    this.segundaPalabra = segpal;
    this.primeraPregunta = primPreg;
    this.segundaPregunta = segPreg;
    this.terceraPregunta = terPreg;
    this.cuartaPregunta = cuartaPreg;
    this.primeraRespuesta = primResp;
    this.segundaRespuesta = segResp;
    this.terceraRespuesta = terResp;
    this.cuartaRespuesta = cuarResp;
    this.genero = genero;
  }
  
  public void equals(final Cancion cancion) {
    this.nombre.equals(cancion.nombre);
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public String getCancionIncompleta() {
    return this.cancionIncompleta;
  }
  
  public void setCancionIncompleta(final String cancionIncompleta) {
    this.cancionIncompleta = cancionIncompleta;
  }
  
  @Pure
  public String getPrimeraPalabra() {
    return this.primeraPalabra;
  }
  
  public void setPrimeraPalabra(final String primeraPalabra) {
    this.primeraPalabra = primeraPalabra;
  }
  
  @Pure
  public String getSegundaPalabra() {
    return this.segundaPalabra;
  }
  
  public void setSegundaPalabra(final String segundaPalabra) {
    this.segundaPalabra = segundaPalabra;
  }
  
  @Pure
  public String getPrimeraPregunta() {
    return this.primeraPregunta;
  }
  
  public void setPrimeraPregunta(final String primeraPregunta) {
    this.primeraPregunta = primeraPregunta;
  }
  
  @Pure
  public String getSegundaPregunta() {
    return this.segundaPregunta;
  }
  
  public void setSegundaPregunta(final String segundaPregunta) {
    this.segundaPregunta = segundaPregunta;
  }
  
  @Pure
  public String getTerceraPregunta() {
    return this.terceraPregunta;
  }
  
  public void setTerceraPregunta(final String terceraPregunta) {
    this.terceraPregunta = terceraPregunta;
  }
  
  @Pure
  public String getCuartaPregunta() {
    return this.cuartaPregunta;
  }
  
  public void setCuartaPregunta(final String cuartaPregunta) {
    this.cuartaPregunta = cuartaPregunta;
  }
  
  @Pure
  public String getPrimeraRespuesta() {
    return this.primeraRespuesta;
  }
  
  public void setPrimeraRespuesta(final String primeraRespuesta) {
    this.primeraRespuesta = primeraRespuesta;
  }
  
  @Pure
  public String getSegundaRespuesta() {
    return this.segundaRespuesta;
  }
  
  public void setSegundaRespuesta(final String segundaRespuesta) {
    this.segundaRespuesta = segundaRespuesta;
  }
  
  @Pure
  public String getTerceraRespuesta() {
    return this.terceraRespuesta;
  }
  
  public void setTerceraRespuesta(final String terceraRespuesta) {
    this.terceraRespuesta = terceraRespuesta;
  }
  
  @Pure
  public String getCuartaRespuesta() {
    return this.cuartaRespuesta;
  }
  
  public void setCuartaRespuesta(final String cuartaRespuesta) {
    this.cuartaRespuesta = cuartaRespuesta;
  }
  
  @Pure
  public String getGenero() {
    return this.genero;
  }
  
  public void setGenero(final String genero) {
    this.genero = genero;
  }
  
  @Pure
  public Integer getIdCancion() {
    return this.idCancion;
  }
  
  public void setIdCancion(final Integer idCancion) {
    this.idCancion = idCancion;
  }
}
