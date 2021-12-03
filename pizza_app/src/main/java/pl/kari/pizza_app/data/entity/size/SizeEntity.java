package pl.kari.pizza_app.data.entity.size;

public class SizeEntity {

import

    @Entity
    @Table(name = "pizzas")
    public class PizzaEntity {
        @Id

        @GeneratedValue(stratgy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "size_type")
        private String sizeType;

        @Column(name = "price_base")
        private BigDecimal priceBase;
        @Column(name = "pizza_id")
        private Integer pizzaId;

        @ManyToOne
        @Joincolumn(name= "pizza_id", insertable = false, updatable = false)
        private PizzaEntity pizza;

        @OneToMany(mappedBy = "size"
        private Set<OrderSizeEntity> orderSizes;)
    }
