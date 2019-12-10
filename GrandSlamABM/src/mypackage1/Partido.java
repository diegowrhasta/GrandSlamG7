package mypackage1;

public class Partido 
{
  String partido_id;
  String modalidad;
  String grand_slam;
  String anio_torneo;
  String etapa;
  String equipo_local_id;
  String equipo_visitante_id;

  public Partido()
  {
  }

  public String getPartido_id()
  {
    return partido_id;
  }

  public void setPartido_id(String newPartido_id)
  {
    partido_id = newPartido_id;
  }

  public String getModalidad()
  {
    return modalidad;
  }

  public void setModalidad(String newModalidad)
  {
    modalidad = newModalidad;
  }

  public String getGrand_slam()
  {
    return grand_slam;
  }

  public void setGrand_slam(String newGrand_slam)
  {
    grand_slam = newGrand_slam;
  }

  public String getAnio_torneo()
  {
    return anio_torneo;
  }

  public void setAnio_torneo(String  newAnio_torneo)
  {
    anio_torneo = newAnio_torneo;
  }

  public String getEtapa()
  {
    return etapa;
  }

  public void setEtapa(String newEtapa)
  {
    etapa = newEtapa;
  }

  public String getEquipo_local_id()
  {
    return equipo_local_id;
  }

  public void setEquipo_local_id(String newEquipo_local_id)
  {
    equipo_local_id = newEquipo_local_id;
  }

  public String getEquipo_visitante_id()
  {
    return equipo_visitante_id;
  }

  public void setEquipo_visitante_id(String newEquipo_visitante_id)
  {
    equipo_visitante_id = newEquipo_visitante_id;
  }
}