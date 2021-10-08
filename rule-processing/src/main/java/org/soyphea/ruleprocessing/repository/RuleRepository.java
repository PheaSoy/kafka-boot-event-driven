package org.soyphea.ruleprocessing.repository;

import org.soyphea.ruleprocessing.model.entity.RuleEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RuleRepository extends ReactiveCrudRepository<RuleEntity,String> {

}
