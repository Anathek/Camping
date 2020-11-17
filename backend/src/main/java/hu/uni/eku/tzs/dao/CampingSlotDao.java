package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.CampingSlot;

import java.util.Collection;

public interface CampingSlotDao {
    void create(CampingSlot campingSlot);

    Collection<CampingSlot>readAll();

}
