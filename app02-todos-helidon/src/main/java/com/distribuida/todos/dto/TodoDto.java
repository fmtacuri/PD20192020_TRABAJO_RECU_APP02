package com.distribuida.usuario.dto;

import lombok.Getter;
import lombok.Setter;

public class TodoDto {
	
	@Getter @Setter private Integer id;
	@Getter @Setter private Integer userId;
	@Getter @Setter private String title;
	@Getter @Setter private String completed;
	
}
