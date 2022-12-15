package com.masai.exception;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Myerror {
	private String message;
	private String description;
	private LocalDate data;

}
