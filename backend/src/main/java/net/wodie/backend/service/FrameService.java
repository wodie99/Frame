package net.wodie.backend.service;

import net.wodie.backend.model.FrameItem;
import net.wodie.backend.repository.FrameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrameService {
    private final FrameRepository frameRepository;

    public FrameService(FrameRepository frameRepository) {
        this.frameRepository = frameRepository;
    }

    public List<FrameItem> getAllFrameItems() {
        return frameRepository.findAll();

    }
}
