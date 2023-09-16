package testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import base.API_Init;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.PropertiesFileUtils;

public class Trello_API extends API_Init {
	@Test
	public void end2end() throws Exception {
		//Create Board
		Map<String,Object> board_param = new HashMap<String, Object>();
		board_param.put("key",key);
		board_param.put("token",token);
		board_param.put("name","E2E Final");
		board_param.put("defaultLists",false);
		Response board_response = request
				.queryParams(board_param)
				.post(base_url + board_path);
		
		System.out.println(board_response.asPrettyString());
		System.out.println("Board was created");
		utils.PropertiesFileUtils.saveToken("idBoard",(String) board_response.jsonPath().get("id"));
		
		//create Todo List
		Map<String,Object> list_param_todo = new HashMap<String, Object>();
		list_param_todo.put("key",key);
		list_param_todo.put("token",token);
		list_param_todo.put("name","To do");
		list_param_todo.put("idBoard", PropertiesFileUtils.getToken("idBoard"));
		Response list_param_todo_reponse = request
				.queryParams(list_param_todo).post(base_url + list_path);
		
		System.out.println(list_param_todo_reponse.asPrettyString());
		System.out.println("Todo list was created");
		String list_1_id =list_param_todo_reponse.jsonPath().get("id");
		
		//create Done List
		Map<String,Object> list_param_done = new HashMap<String, Object>();
		list_param_done.put("key",key);
		list_param_done.put("token",token);
		list_param_done.put("name","To do");
		list_param_done.put("idBoard", PropertiesFileUtils.getToken("idBoard"));
		Response list_param_done_response = RestAssured.given().contentType(ContentType.JSON)
				.queryParams(list_param_done).post(base_url + list_path);
		
		System.out.println(list_param_done_response.asPrettyString());
		System.out.println("Todo list was created");
		String list_2_id =list_param_done_response.jsonPath().get("id");
		
		//create card in todo list
		Map<String,Object> todo_card = new HashMap<String, Object>();
		todo_card.put("key",key);
		todo_card.put("token",token);
		todo_card.put("name","1st Card");
		todo_card.put("idList",list_1_id);
		todo_card.put("desc","Card model");
		todo_card.put("idBoard", PropertiesFileUtils.getToken("idBoard"));
		Response card_response = request
				.queryParams(todo_card).post(base_url + card_path);
		
		System.out.println(card_response.asPrettyString());
		System.out.println("Todo list was created");
		String card_id =card_response.jsonPath().get("id");
		
		//put card into Done list
		Map<String,Object> put_param = new HashMap<String, Object>();
		put_param.put("key",key);
		put_param.put("token",token);
		Map<String,Object> put_body = new HashMap<String, Object>();
		put_body.put("name","1st Card");
		put_body.put("idList",list_2_id);
		put_body.put("idBoard",PropertiesFileUtils.getToken("idBoard"));
		put_body.put("closed",false);
		Response put_response = request
				.queryParams(put_param).post(base_url + card_path + "/" + card_id + "/");
			
		System.out.println(put_response.asPrettyString());
		System.out.println("Put successfully!");
		
		//Delete Board
		Map<String,Object> delete_param = new HashMap<String, Object>();
		delete_param.put("key",key);
		delete_param.put("token",token);
		Response delete_res = request
				.queryParams(delete_param).post(base_url + board_path + "/" + PropertiesFileUtils.getToken("idBoard"));
		System.out.println(delete_res.asPrettyString());
		System.out.println("Deleted!");	
	}
}
