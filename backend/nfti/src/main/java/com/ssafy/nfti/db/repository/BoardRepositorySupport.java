package com.ssafy.nfti.db.repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.nfti.db.entity.Board;
import com.ssafy.nfti.db.entity.QBoard;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepositorySupport extends QuerydslRepositorySupport {

    private final JPAQueryFactory jpaQueryFactory;

    public BoardRepositorySupport(EntityManager em) {
        super(Board.class);
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    QBoard board = QBoard.board;

    public List<Board> findAllByPageSort(Pageable pageable) {
        JPAQuery<Board> query = jpaQueryFactory.selectFrom(board);

        return Objects.requireNonNull(getQuerydsl())
            .applyPagination(pageable, query)
            .fetch();
    }
}