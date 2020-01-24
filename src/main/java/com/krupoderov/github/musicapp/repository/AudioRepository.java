package com.krupoderov.github.musicapp.repository;

import com.krupoderov.github.musicapp.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AudioRepository extends JpaRepository<Audio, Long> {
    List<Audio> findAudioByUploader(String uploader);
}
