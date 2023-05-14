package com.devskiller.dao;

import com.devskiller.model.Item;
import com.devskiller.model.Review;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepositoryCustom {

    private final EntityManager em;
    @Override
    public List<Item> findItemsWithAverageRatingLowerThan(Double rating) {
        TypedQuery<Item> query
                = em.createQuery(
                "SELECT DISTINCT i FROM Item i LEFT JOIN i.reviews r WHERE r.rating < " + rating, Item.class);

        List<Item> resultList = query.getResultList();

        return resultList;
    }
}
