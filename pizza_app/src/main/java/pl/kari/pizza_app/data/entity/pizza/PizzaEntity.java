package pl.kari.pizza_app.data.entity.pizza;

import pl.kari.pizza_app.data.entity.size.SizeEntity;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;


}
