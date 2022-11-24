package com.lab_for_cloud.lab_for_cloud.mapper;

import com.lab_for_cloud.lab_for_cloud.domain.Song;
import com.lab_for_cloud.lab_for_cloud.DTO.SongDTO;
import org.springframework.stereotype.Component;

@Component
public class SongMapper extends AbstractMapper<Song, SongDTO> {
    @Override
    public SongDTO mapObjectToDto (Song song) {
        if (song == null) return null;

        SongDTO.SongDTOBuilder songDTOBuilder = SongDTO.builder();
        songDTOBuilder.id(song.getId());
        songDTOBuilder.title(song.getTitle());
        songDTOBuilder.amountOfLikes(song.getAmountOfLikes());
        songDTOBuilder.amountOfDownloads(song.getAmountOfDownloads());
        songDTOBuilder.streams(song.getStreams());
        songDTOBuilder.singerId(song.getSingerId());
        return songDTOBuilder.build();
    }
}