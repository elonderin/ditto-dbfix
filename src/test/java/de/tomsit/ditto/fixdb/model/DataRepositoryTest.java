package de.tomsit.ditto.fixdb.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataRepositoryTest {

  @Autowired
  DataRepository dataRepository;

  @Test
  void getAll() {
    assertThat(dataRepository.findAll())
        .hasSize(9);
  }
}
