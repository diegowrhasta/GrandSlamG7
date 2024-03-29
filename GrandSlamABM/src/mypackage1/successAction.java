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
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class successAction extends Action 
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
    successActionForm success = (successActionForm) form;
    String opcion = success.getBoton();
    if(opcion.equals("REGISTRAR")){
        Connection cn = null;
        ConnectDB conn = new ConnectDB();
        ResultSet rsConsulta = null;
        try{
            cn = conn.conexion;
            //Modalidad Query
            String cadena = "select * from modalidad_g7";
            rsConsulta = conn.getData(cadena);
            ArrayList modalidades = new ArrayList();
            int counter = 0;
            while(rsConsulta.next()){
                Modalidad modalidad = new Modalidad();
                modalidad.setModalidad_id(rsConsulta.getString("modalidad_id"));
                modalidad.setNombre(rsConsulta.getString("nombre"));
                modalidades.add(modalidad);
                counter++;
                System.out.println("Paso "+counter);
            }
            request.getSession().setAttribute("modalidades",modalidades);
            //Etapa Query
            String cadena2 = "select * from etapa_g7";
            rsConsulta = conn.getData(cadena2);
            ArrayList etapas = new ArrayList();
            counter = 0;
            while(rsConsulta.next()){
                Etapa etapa = new Etapa();
                etapa.setEtapa_id(rsConsulta.getString("etapa_id"));
                etapa.setNombre(rsConsulta.getString("nombre"));
                etapas.add(etapa);
                counter++;
                System.out.println("Paso "+counter);
            }
            request.getSession().setAttribute("etapas",etapas);
            //Torneo Query
            String cadena3 = "select c.nombre as Grand_Slam, d.anio as Anio_Torneo, d.torneo_id "+
                            "from PARTIDO_G7 a, modalidad_g7 b, GRAND_SLAM_G7 c, TORNEO_G7 d, ETAPA_G7 e, equipo_g7 f "+
                            "where a.MODALIDAD_ID=b.MODALIDAD_ID "+
                            "and c.id=d.GS_ID "+
                            "and d.TORNEO_ID=a.TORNEO_ID "+
                            "and e.ETAPA_ID=a.ETAPA_ID "+
                            "and f.EQUIPO_ID=a.EQUIPO_LOCAL_ID "+
                            "order by 1";
            rsConsulta = conn.getData(cadena3);
            ArrayList items = new ArrayList();
            counter = 0;
            while(rsConsulta.next()){
                PartidoBulk partido = new PartidoBulk();
                partido.setTorneo_id(rsConsulta.getString("torneo_id"));
                partido.setGrand_slam(rsConsulta.getString("grand_slam")+" - "+rsConsulta.getString("anio_torneo"));
                items.add(partido);
                counter++;
                System.out.println("Paso "+counter);
            }
            request.getSession().setAttribute("bulk",items);
            //Leyenda Query
            String cadena4 = "select c.EQUIPO_ID,a.nombre as Jugador_1,b.nombre as Jugador_2 from JUGADOR_G7 a, JUGADOR_G7 b, EQUIPO_G7 c "+
                            "where a.JUGADOR_ID=c.JUGADOR_1_ID "+
                            "and b.JUGADOR_ID(+)=c.JUGADOR_2_ID "+
                            "order by 1";
            rsConsulta = conn.getData(cadena4);
            ArrayList items2 = new ArrayList();
            counter = 0;
            while(rsConsulta.next()){
                TeamLegend teamLegend = new TeamLegend();
                teamLegend.setEquipo_id(rsConsulta.getString("equipo_id"));
                teamLegend.setJugador_1(rsConsulta.getString("jugador_1"));
                teamLegend.setJugador_2(rsConsulta.getString("jugador_2"));
                items2.add(teamLegend);
                counter++;
                System.out.println("Paso "+counter);
            }
            registrarPartidoActionForm f = new registrarPartidoActionForm();
            f.setTabla(items2);
            request.getSession().setAttribute("legend",f);
            //Equipos ID Query
            String cadena5 = "select * from equipo_g7";
            rsConsulta = conn.getData(cadena5);
            ArrayList equipos = new ArrayList();
            counter = 0;
            while(rsConsulta.next()){
                Equipo equipo = new Equipo();
                equipo.setEquipo_id(rsConsulta.getString("equipo_id"));
                equipos.add(equipo);
                counter++;
                System.out.println("Paso "+counter);
            }
            request.getSession().setAttribute("equipos",equipos);
            return mapping.findForward("registrarPartido");
        }
        catch(Exception e){
            e.printStackTrace();
            return mapping.findForward("failure");
        }
        finally{
            conn.closeConnection();
        }
    }
    else if(opcion.equals("VISUALIZAR")){
      return mapping.findForward("success");
    }
    else{
      return mapping.findForward("login");
    }
  }
}