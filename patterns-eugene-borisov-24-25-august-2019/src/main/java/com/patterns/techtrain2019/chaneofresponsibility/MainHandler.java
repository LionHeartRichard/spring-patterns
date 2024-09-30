package com.patterns.techtrain2019.chaneofresponsibility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class MainHandler {
	@Autowired
	private List<Handler> handlers;

	@PostConstruct
	public void handle() {
		handlers.forEach(handler -> handler.handle());
	}
}
