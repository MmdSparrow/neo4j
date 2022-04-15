package ir.blacksparrow.graphdatabase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Node
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private List<Movie> movies;
}
