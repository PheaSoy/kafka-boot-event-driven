package org.soyphea.ruleprocessing.repository;

import org.soyphea.ruleprocessing.model.entity.LoginEventEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface LoginRepository extends ReactiveCrudRepository<LoginEventEntity,String> {

}
