package com.project.blog.Makeblog.domain;

import lombok.*;

import java.util.Date;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private int serialNo;
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private int boardViewCnt;
    private Date boardDate;
    private int categoryNo;

    private boolean newFlag; //신규게시물 여부

}
