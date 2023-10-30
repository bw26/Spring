@Entity
@Table(name="Cat")
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    // Generate constructors.. accessors
}

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {

}