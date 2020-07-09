package spring5.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualifierTest {

//	@Autowired
//	@Qualifier("RegularWriter")
//	TextWriter regular;
//	
//	@GetMapping("/")
//	public String index() {
//		return regular.writeText("Hi Chaman Bharti!");
//	}
	
	@Autowired
	@Qualifier("RegularWriter")
	TextWriter regular;
	
	@Autowired
	@Qualifier("FancyWriter")
	TextWriter fancy;
	
	@GetMapping("/")
	public String index() {
		return regular.writeText("Hi Chaman Bharti!");
	}
}
