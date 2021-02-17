package io.github.petriankin.speedcam.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
public class CameraData {

    @Id
    @GeneratedValue
    private UUID uuid;

    private Long cameraId;
    private Integer speed;
    private String licensePlate;
    private Instant dateTime;

}
