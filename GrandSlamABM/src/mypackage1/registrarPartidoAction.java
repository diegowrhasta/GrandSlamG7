package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;
public class registrarPartidoAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    registrarPartidoActionForm registrarActionForm = (registrarPartidoActionForm) form;
    String partido_id = registrarActionForm.getPartido_id();
    String modalidad_id = registrarActionForm.getModalidad_id();
    String fecha = registrarActionForm.getFecha();
    String torneo_id = registrarActionForm.getTorneo_id();
    String equipo_local_id = registrarActionForm.getEquipo_local_id();
    String equipo_visitante_id = registrarActionForm.getEquipo_visitante_id();
    String etapa_id = registrarActionForm.getEtapa_id();
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    { 
    String cadena = "insert into partido_g7 values ("+partido_id+","+modalidad_id+",'"+fecha+"',"+torneo_id+","+equipo_local_id+","+equipo_visitante_id+","+etapa_id+")";
    System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
         return mapping.findForward("success");
	      }
	
        catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("failure"));
       }
       
    finally
    {
      conn.closeConnection();	
    }
  }
}