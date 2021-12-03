package pl.kari.pizza_app.data.entity.ordersize;
@Entity
@Table(name = "orders_sizes")
public class OrderSizeEntity {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "size_count")
    private Integer sizeCount;
}
