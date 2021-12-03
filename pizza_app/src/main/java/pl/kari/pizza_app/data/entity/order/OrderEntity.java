package pl.kari.pizza_app.data.entity.order;
import ...

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Created_at")
    private Date Createdat;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Updated_at")
    private Date Updatedat;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Expected_at")
    private Date Expectedat;
    @Column(name="Token")
    private String Token;

    @OneToMany(mappedBy = "Order")
    private Set<OrderSizeEntity> orderSizes;
}
