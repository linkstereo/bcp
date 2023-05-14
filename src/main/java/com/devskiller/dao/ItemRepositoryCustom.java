package com.devskiller.dao;

import com.devskiller.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepositoryCustom {

    List<Item> findItemsWithAverageRatingLowerThan(Double rating);

}
