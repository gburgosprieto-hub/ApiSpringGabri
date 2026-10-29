package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void managesResourceNameThroughRestOperations() throws Exception {
		mockMvc.perform(post("/first").param("name", "Ana"))
			.andExpect(status().isOk())
			.andExpect(content().string(""));

		mockMvc.perform(get("/first"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hola Ana"));

		mockMvc.perform(put("/first").param("name", "Luis"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hola Luis"));

		mockMvc.perform(delete("/first").param("name", "Luis"))
			.andExpect(status().isOk())
			.andExpect(content().string(""));
	}

}
