package co.com.ensayoMVC.services;

import co.com.ensayoMVC.model.FirstPageDTO;

import java.util.List;


import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.ServicioDTO;
import co.com.ensayoMVC.model.LugarDTO;
import co.com.ensayoMVC.model.ReservaDTO;

public class EnsayoMVCFacade {

	/* Instancia del mismi static */
	private static EnsayoMVCFacade facade;

	/* Constructor privado */
	private EnsayoMVCFacade() {
		super();
	}

	public static EnsayoMVCFacade getInstance() {
		if (facade == null) {
			facade = new EnsayoMVCFacade();
		}
		return facade;
	}

	public FirstPageDTO getFirstPageDTO() {
		FirstPageServices firstPageServices = new FirstPageServicesImpl();
		return firstPageServices.getFirstPageDTO();
	}

	public List<BarberoDTO> getBarberoPageDTO() {
		BarberoServices barberoServices = new BarberoServicesImp();

		return barberoServices.listBarbero();
	}

	public List<ServicioDTO> getServicioPageDTO() {
		ServicioServices servicioServices = new ServicioServicesImp();

		return servicioServices.listServicios();
	}

	public List<LugarDTO> getLugarPageDTO() {
		LugarServices lugarServices = new LugarServicesImp();
		return lugarServices.findByIdList();
	}
	
	
	public LugarDTO getFindLugarPageDTO(int id) {
		LugarServices lugarServices = new LugarServicesImp();
		return lugarServices.findById(id);
	}
	
	
	public ReservaDTO getFindReservaPageDTO(int id) {
		ReservaServices reservaServices = new ReservaServicesImp();
		return reservaServices.findReservaById(id);
	}

}
