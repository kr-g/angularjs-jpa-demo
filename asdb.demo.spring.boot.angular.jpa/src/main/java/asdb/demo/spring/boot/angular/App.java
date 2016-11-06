package asdb.demo.spring.boot.angular;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class App {

	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
