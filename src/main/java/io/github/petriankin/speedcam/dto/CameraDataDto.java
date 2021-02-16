package io.github.petriankin.speedcam.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Getter
public class CameraDataDto {
    private Long cameraId;
    private Integer speed;
    private String licensePlate;
    private String dateTime;
}
