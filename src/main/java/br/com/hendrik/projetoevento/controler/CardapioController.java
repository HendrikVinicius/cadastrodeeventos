package br.com.hendrik.projetoevento.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hendrik.projetoevento.model.CardapioModel;
import br.com.hendrik.projetoevento.repository.CardapioRepository;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

	@Autowired
	private CardapioRepository car;
	
	@GetMapping("/listar")
	public List<CardapioModel> listar(){
		return car.findAll();
}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<CardapioModel> pesquisarId(@PathVariable Long id) {
		return car.findById(id);
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody CardapioModel cardapio) {
		car.save(cardapio);
		return "Cardapio cadastrado com sucesso!";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody CardapioModel cardapio,@PathVariable Long id) {
		Optional<CardapioModel> ca = car.findById(id);
		
		if(!ca.isPresent()) {
			return "O cardapio não foi localizado!";
		}
			
		cardapio.setIdCardapio(id);
		car.save(cardapio);
		return "Cardapio atualizado com sucesso!";
		
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		car.deleteById(id);
		return "Cardapio Apagado";
	}

}