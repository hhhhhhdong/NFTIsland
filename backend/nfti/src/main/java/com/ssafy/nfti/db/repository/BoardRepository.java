package com.ssafy.nfti.db.repository;

import com.ssafy.nfti.db.entity.Board;
import com.ssafy.nfti.db.entity.User;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByUser(User user);
}
