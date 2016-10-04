package anhta.tutorial.spring.guides.restful;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template_say_hello = "Hello, %s!";
	private static final String template_say_bye = "Bye, %s!";
	private final AtomicLong counter = new AtomicLong();
	private static String name = "";

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Guest") String name) {
		this.name = name;
		return new Greeting(counter.incrementAndGet(), String.format(template_say_hello, name));
	}
	
	@RequestMapping("/bye")
	public Greeting bye() {
		return new Greeting(counter.get(), String.format(template_say_bye, this.name));
	}
}
