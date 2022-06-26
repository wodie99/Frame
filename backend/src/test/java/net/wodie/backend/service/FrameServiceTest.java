package net.wodie.backend.service;

import net.wodie.backend.model.FrameItem;
import net.wodie.backend.repository.FrameRepository;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class FrameServiceTest {
    private final FrameRepository frameRepo = mock(FrameRepository.class);
    private final FrameService frameService = new FrameService(frameRepo);

    @Test
    void getAllBtoItems() {
        //GIVEN
        when(frameRepo.findAll()).thenReturn(List.of(initItem1(), initItem2()));

        //WHEN
        List<FrameItem> actual = frameService.getAllFrameItems();

        //THEN
        List<FrameItem> expected = (List.of(initItem1(), initItem2()));

        verify(frameRepo).findAll();
        assertEquals(expected, actual);
    }

    private FrameItem initItem1() {
        return FrameItem.builder()
                .id("1")
                .displayId("DID001")
                .name("Item001")
                .status("NEW")
                .owner("")
                .build();
    }

    private FrameItem initItem2() {
        return FrameItem.builder()
                .id("999")
                .displayId("DID999")
                .name("Item999")
                .status("NEW")
                .owner("")
                .build();
    }
}