package org.zerock.domain;

import lombok.Data;

@Data
public class ReplyVO {
    private int oid;
    private String studentId;
    private String postOid;
    private String content;
    private int up;
    private String postDate;
    private String updateDate;
}
