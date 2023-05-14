package com.devskiller.controller;

import com.devskiller.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.devskiller.controller.constants.RestConstants.*;

@RestController()
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping( ITEMS_TITLES_PATH)
    public List<String> getTitles(@RequestParam Double rating) {
        return itemService.getTitlesWithAverageRatingLowerThan(rating);
    }
}
