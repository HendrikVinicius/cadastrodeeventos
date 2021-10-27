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

import br.com.hendrik.projetoevento.model.TerceirizadoModel;
import br.com.hendrik.projetoevento.repository.TerceirizadoRepository;

@RestController
@RequestMapping("/terceirizado")
public class TerceirizadoController {

	@Autowired
	private TerceirizadoRepository ter;
	
	@GetMapping("/listar")
	public List<TerceirizadoModel> listar(){
		return ter. findAll();
}

	@GetMapping("/pesquisar/{id}")
	public Optional<TerceirizadoModel> pesquisarId(@PathVariable Long id) {
		return ter.findById(id);
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody TerceirizadoModel terceirizado) {
		ter.save(terceirizado);
		return "Empresa terceirizada cadastrado com sucesso!";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody TerceirizadoModel terceirizado,@PathVariable Long id) {
		Optional<TerceirizadoModel> te = ter.findById(id);
		
		if(!te.isPresent()) {
			return "A empresa terceirizada não foi localizado!";
		}
			
		terceirizado.setIdTerceirizado(id);
		ter.save(terceirizado);
		return "Empresa terceirizada atualizado com sucesso!";
		
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		ter.deleteById(id);
		return "Empresa terceirizado Apagada";
	}

}
