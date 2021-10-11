package edu.wctc.distjavazodiac.repo;

import edu.wctc.distjavazodiac.entity.Fortune;
import org.springframework.data.repository.CrudRepository;

public interface FortuneRepo extends CrudRepository<Fortune, Integer> {
}
