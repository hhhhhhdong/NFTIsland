package com.ssafy.nfti.api.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardReq {
    Long communityId;
    String userAddress;
    String title;
    String content;
}
