package asdb.demo.spring.boot.angular;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataProvider {

	@RequestMapping("/all")
	@ResponseBody
	ArrayList<KeyValue> all() {
		ArrayList<KeyValue> store = new ArrayList<KeyValue>();
		
		store.add(new KeyValue(1L,"greeting", "hello world"));
		store.add(new KeyValue(2L,"name", "donald duck"));
		store.add(new KeyValue(3L,"whois", "localhost"));
		
		return store;
	}

	
	
	
	
}
