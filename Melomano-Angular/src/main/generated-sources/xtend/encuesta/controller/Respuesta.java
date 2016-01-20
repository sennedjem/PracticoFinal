package encuesta.controller;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class Respuesta {
  private String carreraNombre;
  
  private String mail;
  
  private /* List<Curso> */Object materias = new ArrayList<Curso>();
  
  private Integer anioIngreso;
  
  private Integer finalesAprobados;
  
  private Integer finalesDesaprobados;
  
  private Integer cursadasAprobadas;
  
  public Encuesta generarEncuesta(final /* RepoEncuestas */Object repo) {
    throw new Error("Unresolved compilation problems:"
      + "\nEncuesta cannot be resolved to a type."
      + "\nEncuesta cannot be resolved."
      + "\nsetCursos cannot be resolved"
      + "\ncarrera cannot be resolved"
      + "\nfindCarrera cannot be resolved"
      + "\nmail cannot be resolved"
      + "\nañoIngreso cannot be resolved"
      + "\nfinalesAprobados cannot be resolved"
      + "\nfinalesDesaprobados cannot be resolved"
      + "\ncursadasAprobadas cannot be resolved");
  }
  
  @Pure
  public String getCarreraNombre() {
    return this.carreraNombre;
  }
  
  public void setCarreraNombre(final String carreraNombre) {
    this.carreraNombre = carreraNombre;
  }
  
  @Pure
  public String getMail() {
    return this.mail;
  }
  
  public void setMail(final String mail) {
    this.mail = mail;
  }
  
  @Pure
  public /* List<Curso> */Object getMaterias() {
    return this.materias;
  }
  
  public void setMaterias(final /* List<Curso> */Object materias) {
    this.materias = materias;
  }
  
  @Pure
  public Integer getAnioIngreso() {
    return this.anioIngreso;
  }
  
  public void setAnioIngreso(final Integer anioIngreso) {
    this.anioIngreso = anioIngreso;
  }
  
  @Pure
  public Integer getFinalesAprobados() {
    return this.finalesAprobados;
  }
  
  public void setFinalesAprobados(final Integer finalesAprobados) {
    this.finalesAprobados = finalesAprobados;
  }
  
  @Pure
  public Integer getFinalesDesaprobados() {
    return this.finalesDesaprobados;
  }
  
  public void setFinalesDesaprobados(final Integer finalesDesaprobados) {
    this.finalesDesaprobados = finalesDesaprobados;
  }
  
  @Pure
  public Integer getCursadasAprobadas() {
    return this.cursadasAprobadas;
  }
  
  public void setCursadasAprobadas(final Integer cursadasAprobadas) {
    this.cursadasAprobadas = cursadasAprobadas;
  }
}
