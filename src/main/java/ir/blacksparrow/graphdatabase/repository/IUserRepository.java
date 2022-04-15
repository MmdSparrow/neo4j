package ir.blacksparrow.graphdatabase.repository;

import ir.blacksparrow.graphdatabase.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface IUserRepository extends Neo4jRepository<User, Long> {
    @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
    Collection<User> getAllUsers();
}
