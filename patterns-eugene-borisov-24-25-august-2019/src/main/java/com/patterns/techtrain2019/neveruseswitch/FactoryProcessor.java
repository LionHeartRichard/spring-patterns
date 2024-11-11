package com.patterns.techtrain2019.neveruseswitch;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class FactoryProcessor {
	@Autowired
	private Map<String, Processor> processors;

	@PostConstruct
	public void runProcessor() {
		processors.forEach((k, v) -> v.apply());
	}
}
