package com.rongyue.efix.repository.neo4j.dao.relation;

import com.rongyue.efix.repository.neo4j.entity.relation.VerifiedBy;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AuthenticateByRepository extends Neo4jRepository<VerifiedBy, Long> {


}
