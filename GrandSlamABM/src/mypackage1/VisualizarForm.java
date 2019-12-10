package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
public class VisualizarForm extends ActionForm 
{
  String partido_id;
  String modalidad;
  String grand_slam;
  String anio_torneo;
  String etapa;
  String equipo_local_id;
  String equipo_visitante_id;
  ArrayList tabla2;
  String boton;

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

  public void setPartido_id(String newPartidoId)
  {
    partido_id = newPartidoId;
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

  public ArrayList getTabla2()
  {
    return tabla2;
  }

  public void setTabla2(ArrayList newTabla2)
  {
    tabla2 = newTabla2;
  }

  public String getBoton()
  {
    return boton;
  }

  public void setBoton(String newBoton)
  {
    boton = newBoton;
  }
}