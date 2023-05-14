package com.devskiller.service;

import com.devskiller.dao.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {
        var items = itemRepository.findItemsWithAverageRatingLowerThan(rating);
        return items.stream()
                .map( i -> i.getTitle())
                .toList();
    }

}
