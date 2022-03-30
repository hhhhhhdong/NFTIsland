package com.ssafy.nfti.api.service;

import com.ssafy.nfti.api.response.MyActivityRes;
import com.ssafy.nfti.db.entity.Board;
import com.ssafy.nfti.db.entity.User;
import com.ssafy.nfti.db.repository.BoardRepository;
import com.ssafy.nfti.db.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myPageService")
public class MyPageServiceImpl implements MyPageService {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<MyActivityRes> myActivityList(String address) {
        User user = userRepository.findByAddress(address)
            .orElseThrow();

        List<Board> boardList = boardRepository.findByUser(user);
        List<MyActivityRes> res = new ArrayList<>();
        for (Board board : boardList) {
            res.add(MyActivityRes.of(board));
        }

        return res;
    }
}
