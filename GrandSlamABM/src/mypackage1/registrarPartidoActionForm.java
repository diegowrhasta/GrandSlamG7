package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
public class registrarPartidoActionForm extends ActionForm 
{
  String partido_id;
  String modalidad_id;
  String fecha;
  String torneo_id;
  String equipo_local_id;
  String equipo_visitante_id;
  String etapa_id;
  ArrayList tabla;
  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getPartido_id()
  {
    return partido_id;
  }

  public void setPartido_id(String newPartido_id)
  {
    partido_id = newPartido_id;
  }

  public String getModalidad_id()
  {
    return modalidad_id;
  }

  public void setModalidad_id(String newModalidad_id)
  {
    modalidad_id = newModalidad_id;
  }

  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getTorneo_id()
  {
    return torneo_id;
  }

  public void setTorneo_id(String newTorneo_id)
  {
    torneo_id = newTorneo_id;
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

  public String getEtapa_id()
  {
    return etapa_id;
  }

  public void setEtapa_id(String newEtapa_id)
  {
    etapa_id = newEtapa_id;
  }
  public ArrayList getTabla()
  {
    return tabla;
  }

  public void setTabla(ArrayList newTabla)
  {
    tabla = newTabla;
  }
}