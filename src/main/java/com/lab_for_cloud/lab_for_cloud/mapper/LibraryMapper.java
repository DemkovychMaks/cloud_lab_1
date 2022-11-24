package com.lab_for_cloud.lab_for_cloud.mapper;

import com.lab_for_cloud.lab_for_cloud.DTO.LibraryDTO;
import com.lab_for_cloud.lab_for_cloud.domain.Library;
import org.springframework.stereotype.Component;

@Component
public class LibraryMapper extends AbstractMapper<Library, LibraryDTO> {
    @Override
    public LibraryDTO mapObjectToDto (Library library) {
        if (library == null) return null;

        LibraryDTO.LibraryDTOBuilder libraryDTOBuilder = LibraryDTO.builder();
        libraryDTOBuilder.id(library.getId());
        libraryDTOBuilder.amountOfDownloadedSongs(library.getAmountOfDownloadedSongs());
        libraryDTOBuilder.amountOfLikedSongs(library.getAmountOfLikedSongs());
        libraryDTOBuilder.amountOfDownloadedAlbums(library.getAmountOfDownloadedAlbums());
        libraryDTOBuilder.amountOfLikedAlbums(library.getAmountOfLikedAlbums());
        libraryDTOBuilder.amountOfSubscribedSingers(library.getAmountOfSubscribedSingers());
        return libraryDTOBuilder.build();
    }
}