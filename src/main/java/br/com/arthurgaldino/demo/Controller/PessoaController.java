package br.com.arthurgaldino.demo.Controller;

import br.com.arthurgaldino.demo.Model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @GetMapping
    public Pessoa cria(){
        var pessoa = new Pessoa();
        pessoa.setName("Arthur");
        pessoa.setSobrenome("Martins");

        return pessoa;
    }
}
