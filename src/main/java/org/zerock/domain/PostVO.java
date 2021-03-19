package org.zerock.domain;

import lombok.Data;

@Data
public class PostVO {
    private int oid;
    private String studentId;
    private String boardOid;
    private String title;
    private String content;
    private int up;
    private String postDate;
    private String updateDate;
}
