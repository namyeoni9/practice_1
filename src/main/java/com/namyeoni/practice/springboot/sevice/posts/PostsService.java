package com.namyeoni.practice.springboot.sevice.posts;

import com.namyeoni.practice.springboot.domain.posts.PostsRepository;
import com.namyeoni.practice.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
