package org.zerock.domain;

import lombok.Data;

@Data
public class ReplyVO {
    private int oid;
    private String userId;
    private String Content;
    private int up;
    private String postDate;
    private String updateDate;
}
