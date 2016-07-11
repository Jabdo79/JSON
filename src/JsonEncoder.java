import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonEncoder {
	public static void main(String[] args) {

		//create the json object
		JSONObject obj = new JSONObject();
		
		//store data into the json object using put(dataName, data)
		obj.put("name", "King Leonidas");
		obj.put("age", new Integer(60));

		//create a json array
		JSONArray list = new JSONArray();
		//store data in the array using add(data)
		list.add("This");
		list.add("is");
		list.add("SPARTAAA!");
		//store the array into the json object using put(dataName, data)
		obj.put("messages", list);

		try {

			FileWriter file = new FileWriter("test.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj);

	}

}