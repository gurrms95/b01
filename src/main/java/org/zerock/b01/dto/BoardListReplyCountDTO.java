package org.zerock.b01.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardListReplyCountDTO {

    private Long bno;
    private String title;
    private String write;
    private LocalDateTime regDate;

    private Long replyCount;
}
