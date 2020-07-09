package spring5.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FancyWriter")
public class FancyWriter implements TextWriter{

	@Override
	public String writeText(String s) {
		return s +  " fancy text2244444";
	}

}
