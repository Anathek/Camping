package hu.uni.eku.tzs.dao.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private CustomerEntity customer;

    @Column
    private boolean electricity;
    @Column
    private boolean caravan;
    @Column
    private Date start;
    @Column
    private Date end;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private CampingSlotEntity campingSlot;


}
