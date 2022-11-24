package com.lab_for_cloud.lab_for_cloud.service;

import com.lab_for_cloud.lab_for_cloud.domain.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.lab_for_cloud.lab_for_cloud.repository.LibraryRepository;

@AllArgsConstructor
@Service
public class LibraryService extends AbstractService<Library, Integer> {
    public LibraryRepository libraryRepository;

    @Override
    protected JpaRepository<Library, Integer> getRepository() {
        return libraryRepository;
    }
}