package base;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class API_Init {
	protected RequestSpecification request;
	protected String key = "f4751449d44131469ed742bcd1fa3cc8";
	protected String token = "ATTAcdc8d4d794f21f2a8c6a90ff11be74cb5ff10f94794e38dac0fea5269d320f1000C37332";
	protected String user = "Phuong";
	protected String base_url = "https://api.trello.com/1/";
	protected String board_path = "board";
	protected String list_path = "lists";
	protected String card_path = "cards";

	@BeforeMethod
	public void setRequest() {
		request = given().contentType(ContentType.JSON);
	}

}
