package hu.unideb.inf.bootstrap_en;

import hu.unideb.inf.bootstrap_en.model.Person;
import hu.unideb.inf.bootstrap_en.model.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =
		AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)

class BootstrapEnApplicationTests {

	@Autowired
	PersonRepository personRepository;

	//@Test
	void contextLoads() {
		Person p = new Person(100,
				"John",
				"Taylor",
				"jt@example.com",
				"apple123",
				true);

		personRepository.save(p);
	}

}
