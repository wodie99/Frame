package net.wodie.backend.controller;

import net.wodie.backend.model.FrameItem;
import net.wodie.backend.repository.FrameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FrameControllerTest {

    @Autowired
    private WebTestClient testClient;

    @Autowired
    private FrameRepository frameRepository;

    @BeforeEach
    public void cleanUp() {
        frameRepository.deleteAll();
    }

    @Test
    void getAllFrameItems_AllOk() {
        //GIVEN
        frameRepository.insert(initItem1());

        //WHEN
        List<FrameItem> actual = testClient.get()
                .uri("/api/item")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(FrameItem.class)
                .returnResult()
                .getResponseBody();

        //THEN
        List<FrameItem> expected = List.of(initItem1());
        assertEquals(expected, actual);
    }

    @Test
    void getAllBtoItems_WrongApi_Error400() {
        //GIVEN
        frameRepository.insert(initItem2());

        //WHEN
        testClient.get()
                .uri("/api/wrongBtoItem")
                .exchange()
                .expectStatus().is4xxClientError();
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
