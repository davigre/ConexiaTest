package com.conexia.test.services;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexia.test.dto.FacturaCreateDto;
import com.conexia.test.entities.Camarero;
import com.conexia.test.entities.Cliente;
import com.conexia.test.entities.Detallefactura;
import com.conexia.test.entities.Factura;
import com.conexia.test.entities.Mesa;
import com.conexia.test.repositories.CamareroRepository;
import com.conexia.test.repositories.ClienteRepository;
import com.conexia.test.repositories.DetallefacturaRepository;
import com.conexia.test.repositories.FacturaRepository;
import com.conexia.test.repositories.MesaRespository;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FacturaServiceImpl implements FacturaServiceI {
	
	@Autowired
	FacturaRepository facturaRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	CamareroRepository camareroRepository;
	
	@Autowired
	MesaRespository mesaRespository;
	
	@Autowired
	DetallefacturaRepository detallefacturaRepository;
	
	public FacturaRepository getFacturaRepository() {
		return facturaRepository;
	}

	public void setFacturaRepository(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Override
	public Factura saveFactura(FacturaCreateDto facturaCreate) {
		
		Long clienteId = facturaCreate.getClienteId();
		Cliente cliente = clienteRepository.findOne(clienteId);
		
		Long camareroId = facturaCreate.getCamareroId();
		Camarero camarero = camareroRepository.findOne(camareroId);
		
		Long mesaId = facturaCreate.getMesaId();
		Mesa mesa = mesaRespository.findOne(mesaId);
		
		Factura factura = new Factura();
		factura.setCliente(cliente);
		factura.setCamarero(camarero);
		factura.setMesa(mesa);
		factura.setFechaFactura(new Date());  
		factura = facturaRepository.save(factura);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			List<Detail> details = Arrays.asList(mapper.readValue(facturaCreate.getSerializedDetails(), Detail[].class));
			for (Detail detail : details) {
				
				Detallefactura detallefactura = new Detallefactura();
				detallefactura.setFactura(factura);
				detallefactura.setPlato(detail.getPlato());
				detallefactura.setImporte(Integer.parseInt(detail.getImporte()));
				
				detallefactura = detallefacturaRepository.save(detallefactura);
				
				factura.getDetallefacturaCollection().add(detallefactura);
				
			}			
				
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return factura;
		
	}

	@Override
	public Factura updateFactura(Factura factura) {
		return facturaRepository.save(factura);
	}

	@Override
	public void deleteFactura(Factura factura) {
		facturaRepository.delete(factura);
	}

	@Override
	public Factura getFacturaById(Long id) {
		return facturaRepository.findOne(id);
	}

	@Override
	public List<Factura> getAllFacturas() {
		return facturaRepository.findAll();
	}
	
	private class Detail {
		
		private Long cocineroId;
		private String cocineroName;
		private String plato;
		private String importe;
				
		public Long getCocineroId() {
			return cocineroId;
		}
		@JsonSetter("CocineroId")
		public void setCocineroId(Long cocineroId) {
			this.cocineroId = cocineroId;
		}
		public String getCocineroName() {
			return cocineroName;
		}
		@JsonSetter("Cocinero")
		public void setCocineroName(String cocineroName) {
			this.cocineroName = cocineroName;
		}
		public String getPlato() {
			return plato;
		}
		@JsonSetter("Plato")
		public void setPlato(String plato) {
			this.plato = plato;
		}
		public String getImporte() {
			return importe;
		}
		@JsonSetter("Importe")
		public void setImporte(String importe) {
			this.importe = importe;
		}
		
	}
	
}
