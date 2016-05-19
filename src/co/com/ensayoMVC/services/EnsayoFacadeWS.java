package co.com.ensayoMVC.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.FirstPageDTO;
import co.com.ensayoMVC.model.LugarDTO;
import co.com.ensayoMVC.model.ReservaDTO;
import co.com.ensayoMVC.model.ServicioDTO;
import co.com.ensayoMVC.services.EnsayoMVCFacade;;


@Path("/json/firstpage")
public class EnsayoFacadeWS {

	public EnsayoFacadeWS() {
		super();
	}
	  @GET
	  @Path("/servicio1")
	  @Produces(MediaType.APPLICATION_JSON)
	  public FirstPageDTO getFirstPageDTO() {
		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();
		  return barberFacade.getFirstPageDTO();
		  }
	  
	  @GET
	  @Path("/servicio2")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<BarberoDTO> getBarberoPageDTO() {

		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();

	    return barberFacade.getBarberoPageDTO();
	  }
	  
	  
	  @GET
	  @Path("/servicio3")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<ServicioDTO> getServicioPageDTO() {

		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();

	    return barberFacade.getServicioPageDTO();
	  }
	  
	  
	  @GET
	  @Path("/servicio4")
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<LugarDTO> getLugarPageDTO() {

		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();

	    return barberFacade.getLugarPageDTO();
	  }
	  
	  @GET
	  @Path("/servicio5/{lugarId}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public LugarDTO findLugarByID(@PathParam("lugarId") int lugarId) {

		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();
	    return barberFacade.getFindLugarPageDTO(lugarId);
	  }
	  
	  
	  @GET
	  @Path("/servicio6/{reservaId}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public ReservaDTO findReservaByID(@PathParam("reservaId") int reservaId) {

		  EnsayoMVCFacade barberFacade = EnsayoMVCFacade.getInstance();
	    return barberFacade.getFindReservaPageDTO(reservaId);
	  }
}
