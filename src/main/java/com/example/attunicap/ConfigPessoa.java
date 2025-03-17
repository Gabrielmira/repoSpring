package com.example.attunicap;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPessoa {

    @Value("${PESSOA_NOME}")
    private String nome;

    @Value("${PESSOA_IDADE}")
    private String idade;

    @Value("${PESSOA_SEXO}")
    private String sexo;

    @Value("${PESSOA_ESTADOCVL}")
    private String estadoCivil;

    @Value("${PESSOA_PROFISSAO}")
    private String profissao;

    @Bean
    public Pessoa pessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setSexo(sexo);
        pessoa.setEstadoCivil(estadoCivil);
        pessoa.setProfissao(profissao);
        return pessoa;
    }

    @PostConstruct
    public void init() {
        System.out.println("Pessoa criada: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Profissão: " + profissao);
    }
}
