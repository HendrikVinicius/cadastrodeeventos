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

import br.com.hendrik.projetoevento.model.LocalModel;
import br.com.hendrik.projetoevento.repository.LocalRepository;

@RestController
@RequestMapping("/local")
public class LocalController {

	@Autowired
	private LocalRepository loc;
	
	@GetMapping("/listar")
	public List<LocalModel> listar(){
		return loc.findAll();
}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<LocalModel> pesquisarId(@PathVariable Long id) {
		return loc.findById(id);
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody LocalModel local) {
		loc.save(local);
		return "Local cadastrado com sucesso!";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody LocalModel local,@PathVariable Long id) {
		Optional<LocalModel> lo = loc.findById(id);
		
		if(!lo.isPresent()) {
			return "O local não foi localizado!";
		}
			
		local.setIdLocal(id);
		loc.save(local);
		return "Local atualizado com sucesso!";
		
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		loc.deleteById(id);
		return "Local Apagado";
	}

}