package io.github.petriankin.speedcam.repository;

import io.github.petriankin.speedcam.domain.CameraData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CameraDataRepository extends JpaRepository<CameraData, UUID> {
}
