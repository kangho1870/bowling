package com.example.allcoverproject.repository;


import com.example.allcoverproject.entity.Game;
import com.example.allcoverproject.entity.QGame;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GameRepository {

    @Autowired
    private JPAQueryFactory queryFactory;

    public Game findGameById(Long id) {
        QGame game = QGame.game;
        return queryFactory
                .selectFrom(game)
                .where(game.id.eq(id))
                .fetchOne();
    }
}
