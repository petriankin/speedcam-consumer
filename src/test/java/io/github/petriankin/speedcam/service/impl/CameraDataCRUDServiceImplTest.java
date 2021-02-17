package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.domain.CameraData;
import io.github.petriankin.speedcam.service.CameraDataCRUDService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CameraDataCRUDServiceImplTest {

    @Autowired
    private CameraDataCRUDService cameraDataCRUDService;

    @Test
    void whenSaveAndGetCameraDataReturnedEntityHasID() {

        CameraData cameraData = cameraDataCRUDService.save(generateCameraData());

        assertThat(cameraData.getId()).isNotNull();
    }

    private CameraData generateCameraData() {
        return CameraData.builder()
                .speed(100)
                .dateTime(Instant.now())
                .cameraId(1L)
                .licensePlate("A123BC")
                .build();
    }
}
