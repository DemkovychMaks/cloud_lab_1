package com.lab_for_cloud.lab_for_cloud.controller;


import com.lab_for_cloud.lab_for_cloud.domain.Song;
import com.lab_for_cloud.lab_for_cloud.mapper.SongMapper;
import com.lab_for_cloud.lab_for_cloud.service.AbstractService;
import com.lab_for_cloud.lab_for_cloud.service.SongService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab_for_cloud.lab_for_cloud.DTO.SongDTO;

import com.lab_for_cloud.lab_for_cloud.mapper.AbstractMapper;


@RequestMapping(value = "/song")
@RestController
@AllArgsConstructor
public class SongController extends AbstractController<Song, SongDTO, Integer> {
    private final SongService songService;
    private final SongMapper songMapper;

    @Override
    public AbstractService<Song, Integer> getService() {
        return songService;
    }

    @Override
    public AbstractMapper<Song, SongDTO> getMapper() {
        return songMapper;
    }
}
