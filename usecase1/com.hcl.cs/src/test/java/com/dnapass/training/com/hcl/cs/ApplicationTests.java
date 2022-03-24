package com.dnapass.training.com.hcl.cs;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.dnapass.training.com.hcl.cs.controller.MainController;
import com.dnapass.training.com.hcl.cs.controller.UserController;
import com.dnapass.training.com.hcl.cs.entity.PetEntity;
import com.dnapass.training.com.hcl.cs.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Rollback(false)
@TestInstance(Lifecycle.PER_CLASS)
public class ApplicationTests {

	@Autowired
	private MainController controller;
	
	@Autowired
	private UserController controller1;
	
	@Autowired
	private MockMvc mvc;
	List<PetEntity> petListExpected = null;
	
	@Autowired
	private MockMvc mvc1;
	List<UserEntity> userListExpected = null;
	
	@Test
	public void contextLoades() throws Exception {
		assertThat(controller).isNotNull();
		assertThat(mvc).isNotNull();
		
	}
	
	@Test
	public void contextLoades1() throws Exception {
		  assertThat(controller1).isNotNull();
		  assertThat(mvc1).isNotNull();
	}
	
	@BeforeAll
	public void setUp() throws Exception {
		//pet controller
		String url = "/api/v1/pet";
		petListExpected = DataLoader.newPets();
		PetEntity pet = petListExpected.get(0);
		
		String inputJson = mapToJson(pet);
		
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		int status = mvcResult.getResponse().getStatus();
		System.out.println("setUp status" + status);
		
		pet = petListExpected.get(1);
		inputJson = mapToJson(pet);
		mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		status = mvcResult.getResponse().getStatus();
		System.out.println("setUp Status" + status);
		
		pet = petListExpected.get(2);
		inputJson = mapToJson(pet);
		mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		status = mvcResult.getResponse().getStatus();
		System.out.println("setUp Status" + status);
		
		pet = petListExpected.get(3);
		inputJson = mapToJson(pet);
		mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		status = mvcResult.getResponse().getStatus();
		System.out.println("setUp Status" + status);
		

		pet = petListExpected.get(4);
		inputJson = mapToJson(pet);
		mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		status = mvcResult.getResponse().getStatus();
		System.out.println("setUp Status" + status);
		
		//userController
		String url1 = "/api/v1/user";
		userListExpected = DataLoader.newUsers();
		UserEntity user = userListExpected.get(0);
		
		String inputJson1 = mapToJson(user);
		
		MvcResult mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.post(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		int status1 = mvcResult1.getResponse().getStatus();
		System.out.println("setUp status" + status1);
		
		user = userListExpected.get(1);
		inputJson1 = mapToJson(user);
		mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.post(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		status1 = mvcResult1.getResponse().getStatus();
		System.out.println("setUp Status" + status1);
		
		user = userListExpected.get(2);
		inputJson1 = mapToJson(user);
		mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.post(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		status1 = mvcResult1.getResponse().getStatus();
		System.out.println("setUp Status" + status1);
		
		user = userListExpected.get(3);
		inputJson1 = mapToJson(user);
		mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.post(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		status1 = mvcResult1.getResponse().getStatus();
		System.out.println("setUp Status" + status1);
		
		user = userListExpected.get(4);
		inputJson1 = mapToJson(user);
		mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.post(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		status1 = mvcResult1.getResponse().getStatus();
		System.out.println("setUp Status" + status1);
		
	}
	
	@Test
	public void getAllPets() throws Exception {
		String url = "/api/v1/pet";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(
				MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		int status = mvcResult.getResponse().getStatus();assertEquals(200, status);
		
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("content ::" +content);
		List<PetEntity> petList = mapFromJson(content, new TypeReference<List<PetEntity>>() {});
		assertTrue(petList.size() == 5);
		assertEquals(petListExpected.get(0), petList.get(0));
		assertEquals(petListExpected.get(1), petList.get(1));
		assertEquals(petListExpected.get(2), petList.get(2));
		assertEquals(petListExpected.get(3), petList.get(3));
		
		System.out.println("getPetList() ::" +petList);
	}
	
	@Test
	public void savePet() throws Exception {
		String url = "/api/v1/pet/1";
		PetEntity pet = new PetEntity(1L, "pet1 saved", null, null, null);
		
		String inputJson = mapToJson(pet);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.put(url).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		
		int status = mvcResult.getResponse().getStatus();
		System.out.println("content saved::"+mvcResult.getResponse());
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		PetEntity pet1 = mapFromJson(content, PetEntity.class);
		assertNotNull(pet1);
		assertEquals("pet1 saved", pet1.getPetName());
		System.out.println("pet saved::" +pet1);
	}
	
	@Test
	public void getMyPet() throws Exception {
		String url = "/api/v1/pet";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(
				MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		int status = mvcResult.getResponse().getStatus();assertEquals(200, status);
		
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println("content ::" +content);
		List<PetEntity> petList = mapFromJson(content, new TypeReference<List<PetEntity>>() {});
		assertTrue(petList.size() == 5);
		assertEquals(petListExpected.get(1), petList.get(1));
		
		System.out.println("getPetList() ::" +petList);
	}
	

	@Test
	public void saveUser() throws Exception {
		String url1 = "/api/v1/user/1";
		UserEntity user = new UserEntity(10L, "user1 saved", "user10");
		
		String inputJson1 = mapToJson(user);
		MvcResult mvcResult1 = mvc1.perform(
				MockMvcRequestBuilders.put(url1).contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson1)).andReturn();
		
		int status1 = mvcResult1.getResponse().getStatus();
		System.out.println("content saved::"+mvcResult1.getResponse());
		assertEquals(200, status1);
		String content = mvcResult1.getResponse().getContentAsString();
		UserEntity user2 = mapFromJson(content, UserEntity.class);
		assertNotNull(user2);
		assertEquals("user1 saved", user2.getUserName());
		System.out.println("user saved::" +user2);
	}
	
	protected String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper.writeValueAsString(obj);
		
	}
	
	protected <T> T mapFromJson(String json, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper.readValue(json, clazz);
	}
	
	private List<PetEntity> mapFromJson(String content, TypeReference<List<PetEntity>> typeReference)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper.readValue(content, typeReference);
	}
}
