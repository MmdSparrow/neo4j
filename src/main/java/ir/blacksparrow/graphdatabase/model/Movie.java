package ir.blacksparrow.graphdatabase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
//import org.neo4j.ogm.

@NoArgsConstructor
@Getter
@Setter
@Node
public class Movie {
    @Id
    private Long id;
    private String title;
    private String director;
}
