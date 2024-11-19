package hu.unideb.inf.bootstrap_en;

import hu.unideb.inf.bootstrap_en.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =
		AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)

class BootstrapEnApplicationTests {

	@Test
	void contextLoads() {
		Person p = new Person(10,
				"John",
				"Taylor",
				"jt@example.com",
				"apple123",
				true);

	}

}
