package com.lab_for_cloud.lab_for_cloud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.lab_for_cloud.lab_for_cloud.domain.Song;
import com.lab_for_cloud.lab_for_cloud.repository.SongRepository;

@AllArgsConstructor
@Service
public class SongService extends AbstractService<Song, Integer> {
    public SongRepository songRepository;

    @Override
    protected JpaRepository<Song, Integer> getRepository() {
        return songRepository;
    }
}
