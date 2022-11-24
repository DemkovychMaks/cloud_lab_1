package com.lab_for_cloud.lab_for_cloud.controller;

import com.lab_for_cloud.lab_for_cloud.domain.Library;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab_for_cloud.lab_for_cloud.DTO.LibraryDTO;

import com.lab_for_cloud.lab_for_cloud.mapper.AbstractMapper;
import com.lab_for_cloud.lab_for_cloud.mapper.LibraryMapper;

import com.lab_for_cloud.lab_for_cloud.service.AbstractService;
import com.lab_for_cloud.lab_for_cloud.service.LibraryService;

@RequestMapping(value = "/library")
@RestController
@AllArgsConstructor
public class LibraryController extends AbstractController<Library, LibraryDTO, Integer> {
    private final LibraryService libraryService;
    private final LibraryMapper libraryMapper;

    @Override
    public AbstractService<Library, Integer> getService() {
        return libraryService;
    }

    @Override
    public AbstractMapper<Library, LibraryDTO> getMapper() {
        return libraryMapper;
    }
}
