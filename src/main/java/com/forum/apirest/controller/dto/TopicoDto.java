package com.forum.apirest.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.forum.apirest.modelo.Topico;

public class TopicoDto {

	
	private Long id;
	private String mensagem;
	private String titulo;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.mensagem = topico.getMensagem();
		this.titulo = topico.getTitulo();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDto> converter(List<Topico> topicos) {
		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
		
	}
	
}
