package net.wodie.backend.controller;

import net.wodie.backend.model.FrameItem;
import net.wodie.backend.service.FrameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class FrameController {

    private final FrameService frameService;

    public FrameController(FrameService frameService) {
        this.frameService = frameService;
    }

    @GetMapping()
    public List<FrameItem> getAllFrameItems() {
        return frameService.getAllFrameItems();
    }
}
