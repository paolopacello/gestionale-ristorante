package com.ristorante.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ristorante.dto.AggiungiCategoriaDTO;
import com.ristorante.dto.AggiungiIngredienteDTO;
import com.ristorante.dto.AggiungiPiattoDTO;
import com.ristorante.mapper.CategoriaMapper;
import com.ristorante.mapper.IngredienteMapper;
import com.ristorante.mapper.PiattoMapper;
import com.ristorante.model.Categoria;
import com.ristorante.model.Ingrediente;
import com.ristorante.model.Piatto;
import com.ristorante.model.Ristorante;
import com.ristorante.repository.IngredienteRepository;
import com.ristorante.service.model.CategoriaService;
import com.ristorante.service.model.IngredienteService;
import com.ristorante.service.model.PiattoService;
import com.ristorante.service.model.RistoranteService;

@Service
public class RistoranteFacade {
	
	@Autowired
	private IngredienteService ingredienteService;
	@Autowired
	private IngredienteMapper ingredienteMapper;
	@Autowired
	private CategoriaService categoriaService;
	@Autowired
	private CategoriaMapper categoriaMapper;
	@Autowired
	private PiattoMapper piattoMapper;
	@Autowired
	private PiattoService piattoService;
	@Autowired
	private RistoranteService ristService;
	@Autowired
	private IngredienteRepository ingredienteRepo;
	
	
	public AggiungiIngredienteDTO aggiungiIngrediente(AggiungiIngredienteDTO request) {
		Ingrediente i = ingredienteService.findIngredienteByNome(request.getNomeIng());
		if (i == null) {
			ingredienteService.aggiungiIngrediente(i);
			AggiungiIngredienteDTO DTO = ingredienteMapper.convertToIngrediente(i);
			return DTO;
			
		}else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Ingrediente già esistente");
		}
	}
		
		public AggiungiCategoriaDTO aggiungiCategoria(AggiungiCategoriaDTO request) {
			Categoria c = categoriaService.findCategoriaById(request.getNome());
			if (c == null) {
				categoriaService.aggiungiCategoria(request.getNome());
				AggiungiCategoriaDTO DTO = categoriaMapper.convertToCategoriaDTO(c);
				return DTO;
				
			}else {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Ingrediente già esistente");
			}
			
	}
		
		public AggiungiPiattoDTO aggiungiPiatto(AggiungiPiattoDTO request) {
			Piatto p = new Piatto();
			Ristorante r = ristService.ristorantePerNome(request.getNome_risto());
			Categoria c = categoriaService.trovaNomeCategorie(request.getNome_cate());
			p.setNome(request.getNome());
			p.setPrezzo(request.getPrezzo());
			c.setNome(request.getNome());
			r.setNomeRistorante(request.getNome_risto());
			if(p != null) {
				piattoService.aggiungiPiatto(p);
				AggiungiPiattoDTO DTO = piattoMapper.convertToPiattoDTO(p);
				return DTO;
			}
			return null;
			
		}
		
		public List<AggiungiIngredienteDTO> visualizzaIngredienti() {
			List<Ingrediente> listaIngredienti = ingredienteRepo.findAll();
			List<AggiungiIngredienteDTO> listaIngredientiDTO = ingredienteMapper.convertIngredienteToListaIngrediente(listaIngredienti);
			return listaIngredientiDTO; 
		}
	
	
	
}
