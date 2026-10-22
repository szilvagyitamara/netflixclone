package com.netflixclone.netflixclone.dao;

import com.netflixclone.netflixclone.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
